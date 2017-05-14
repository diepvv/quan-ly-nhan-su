package quanlynhansu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import quanlynhansu.model.entity.Bomon;

@Repository
public interface IBoMonRepository extends CrudRepository<Bomon, Integer> {

}
