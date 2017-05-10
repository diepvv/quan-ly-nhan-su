package quanlynhansu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import quanlynhansu.model.entity.Quyetdinhkhenthuong;

@Repository
public interface IQuyetDinhKhenThuongRepository extends
		CrudRepository<Quyetdinhkhenthuong, Integer> {
}
