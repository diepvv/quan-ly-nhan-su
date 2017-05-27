package quanlynhansu.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import quanlynhansu.model.entity.Canbo;

@Repository
public interface ICanBoRepository extends CrudRepository<Canbo, Integer> {
	@Query("select cb from Canbo cb where cb.pk=:pk and cb.version=:version")
	Canbo findOneByPkAndVersion(@Param("pk") Integer pk, @Param("version") Integer version);
}
