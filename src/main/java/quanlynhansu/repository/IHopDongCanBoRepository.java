package quanlynhansu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import quanlynhansu.model.entity.Hopdongcanbo;

@Repository
public interface IHopDongCanBoRepository extends
		CrudRepository<Hopdongcanbo, Integer> {
}
