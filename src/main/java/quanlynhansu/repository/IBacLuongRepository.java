package quanlynhansu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import quanlynhansu.model.entity.Bacluong;

@Repository
public interface IBacLuongRepository extends CrudRepository<Bacluong, Integer> {

}
