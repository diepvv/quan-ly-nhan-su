package quanlynhansu.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import quanlynhansu.model.entity.Chucvu;

public interface IChucVuRepository extends CrudRepository<Chucvu, Integer> {
	@Query("SELECT cv from Chucvu cv where cv.pk=:pk and cv.version=:version")
	Chucvu findOneByPkAndVersion(@Param("pk") Integer pk, @Param("version") Integer version);
}
