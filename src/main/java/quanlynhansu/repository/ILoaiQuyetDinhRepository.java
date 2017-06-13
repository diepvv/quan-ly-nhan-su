package quanlynhansu.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import quanlynhansu.model.entity.Loaiquyetdinh;

@Repository
public interface ILoaiQuyetDinhRepository extends
		CrudRepository<Loaiquyetdinh, Integer> {
	@Query("SELECT lqd from Loaiquyetdinh lqd where lqd.pk=:pk and lqd.version=:version")
	Loaiquyetdinh findOneByPkAndVersion(@Param("pk") Integer pk, @Param("version") Integer version);

}
