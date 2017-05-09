package quanlynhansu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import quanlynhansu.model.entity.Quyetdinhkyluat;

@Repository
public interface IQuyetDinhKyLuatRepository extends
		CrudRepository<Quyetdinhkyluat, Integer> {

}
