package quanlynhansu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import quanlynhansu.model.entity.Hopdongnganhan;

@Repository
public interface IHopDongNganHanRepository extends CrudRepository<Hopdongnganhan, Integer> {

}
