package quanlynhansu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import quanlynhansu.model.entity.Danhsachthamnien;

@Repository
public interface IDanhSachThamNienRepository extends
		CrudRepository<Danhsachthamnien, Integer> {
}
