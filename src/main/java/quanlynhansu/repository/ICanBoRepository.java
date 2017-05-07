package quanlynhansu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import quanlynhansu.model.entity.Canbo;

@Repository
public interface ICanBoRepository extends CrudRepository<Canbo, Integer> {

}
