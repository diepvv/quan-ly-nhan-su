package quanlynhansu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import quanlynhansu.model.entity.Tongiao;

@Repository
public interface ITonGiaoRepository extends CrudRepository<Tongiao, Integer> {

}
