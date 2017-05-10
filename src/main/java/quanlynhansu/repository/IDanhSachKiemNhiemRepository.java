package quanlynhansu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import quanlynhansu.model.entity.Danhsachkiemnhiem;

@Repository
public interface IDanhSachKiemNhiemRepository extends
		CrudRepository<Danhsachkiemnhiem, Integer> {

}
