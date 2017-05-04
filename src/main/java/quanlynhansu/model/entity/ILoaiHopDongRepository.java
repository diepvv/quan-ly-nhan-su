package quanlynhansu.model.entity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILoaiHopDongRepository extends
		CrudRepository<Loaihopdong, Integer> {

}
