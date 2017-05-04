package quanlynhansu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import quanlynhansu.model.entity.Loaiquyetdinh;

@Repository
public interface ILoaiQuyetDinhRepository extends
		CrudRepository<Loaiquyetdinh, Integer> {

}
