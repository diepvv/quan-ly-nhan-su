package quanlynhansu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import quanlynhansu.model.entity.Danhsachkhoangon;

@Repository
public interface IDanhSachKhoanGonRepository extends
		CrudRepository<Danhsachkhoangon, Integer> {

}
