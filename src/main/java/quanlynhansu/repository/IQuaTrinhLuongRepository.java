package quanlynhansu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import quanlynhansu.model.entity.Quatrinhluong;

@Repository
public interface IQuaTrinhLuongRepository extends
		CrudRepository<Quatrinhluong, Integer> {
}
