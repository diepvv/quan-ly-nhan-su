package quanlynhansu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import quanlynhansu.model.entity.Loaihopdong;

@Repository
public interface ILoaiHopDongRepository extends
		CrudRepository<Loaihopdong, Integer> {

}
