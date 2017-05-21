package quanlynhansu.config;

import javax.validation.ConstraintViolationException;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@ControllerAdvice
public class ExceptionHandlingConfig {
	private static final Logger LOGGER = org.slf4j.LoggerFactory
			.getLogger(ExceptionHandlingConfig.class);

	private static ObjectMapper objectMapper;

	@Autowired
	public void setObjectMapper(ObjectMapper objectMapper) {
		ExceptionHandlingConfig.objectMapper = objectMapper;
	}

	@ExceptionHandler(OptimisticLockingFailureException.class)
	public ResponseEntity<?> handleConcurrentUpdate(Exception exception) {
		return log(ResponseEntity.status(HttpStatus.PRECONDITION_FAILED),
				exception)
				.body(errorFor("You are trying to update a resource that has been modified by another user!"));
	}

	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<?> handleValidationError(Exception exception) {
		return log(ResponseEntity.status(HttpStatus.BAD_REQUEST), exception)
				.body(errorFor("Data validation error occurred"));
	}

	@ExceptionHandler(Throwable.class)
	public ResponseEntity<?> handleUnexpectedException(Throwable exception) {
		return log(ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR),
				exception).body(errorFor("Internal server error occurred"));
	}

	private BodyBuilder log(BodyBuilder bb, Throwable exception) {
		// Enhancement of the body can happen here.
		LOGGER.error("Unhandled exception occurred", exception);
		return bb;
	}

	public static String errorFor(String message) {
		try {
			return objectMapper.writeValueAsString(message);
		} catch (JsonProcessingException e) {
			throw new RuntimeException("Error during error serialization", e);
		}
	}
}
