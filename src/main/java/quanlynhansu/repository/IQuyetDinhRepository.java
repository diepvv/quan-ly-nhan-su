package quanlynhansu.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import quanlynhansu.model.entity.Quyetdinh;

@Repository
public interface IQuyetDinhRepository extends CrudRepository<Quyetdinh, Integer> {
	@Query("SELECT qd from Quyetdinh qd where qd.pk=:pk and qd.version=:version")
	Quyetdinh findOneByPkAndVersion(@Param("pk") Integer pk, @Param("version") Integer version);
}
