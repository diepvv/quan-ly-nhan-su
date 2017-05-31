package quanlynhansu.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import quanlynhansu.model.entity.Danhsachkhoangon;

@Repository
public interface IDanhSachKhoanGonRepository extends CrudRepository<Danhsachkhoangon, Integer> {
	@Query("SELECT dskg from Danhsachkhoangon dskg where dskg.pk=:pk and dskg.version=:version")
	Danhsachkhoangon findOneByPkAndVersion(@Param("pk") Integer pk, @Param("version") Integer version);
}
