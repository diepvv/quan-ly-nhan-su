package quanlynhansu.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import quanlynhansu.model.entity.Quyetdinhkhenthuong;

@Repository
public interface IQuyetDinhKhenThuongRepository extends CrudRepository<Quyetdinhkhenthuong, Integer> {
	@Query("SELECT qdkt from Quyetdinhkhenthuong qdkt where qdkt.pk=:pk and qdkt.version=:version")
	Quyetdinhkhenthuong findOneByPkAndVersion(@Param("pk") Integer pk, @Param("version") Integer version);
}
