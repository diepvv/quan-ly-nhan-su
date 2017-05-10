package quanlynhansu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import quanlynhansu.model.entity.Quyetdinh;

@Repository
public interface IQuyetDinhRepository extends
		CrudRepository<Quyetdinh, Integer> {
}
