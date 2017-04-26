package quanlynhansu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import quanlynhansu.model.entity.Dantoc;

@Repository
public interface IDanTocRepository extends CrudRepository<Dantoc, Integer> {

}
