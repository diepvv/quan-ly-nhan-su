package quanlynhansu.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import quanlynhansu.model.entity.Danhsachkiemnhiem;

@Repository
public interface IDanhSachKiemNhiemRepository extends CrudRepository<Danhsachkiemnhiem, Integer> {
	@Query("SELECT dskn from Danhsachkiemnhiem dskn where dskn.pk=:pk and dskn.version=:version")
	Danhsachkiemnhiem findOneByPkAndVersion(@Param("pk") Integer pk, @Param("version") Integer version);
}
