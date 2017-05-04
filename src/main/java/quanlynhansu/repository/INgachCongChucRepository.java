package quanlynhansu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import quanlynhansu.model.entity.Ngachcongchuc;

@Repository
public interface INgachCongChucRepository extends
		CrudRepository<Ngachcongchuc, Integer> {

}
