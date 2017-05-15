package quanlynhansu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import quanlynhansu.model.entity.Quequan;

@Repository
public interface IQueQuanRepository extends CrudRepository<Quequan, Integer> {

}
