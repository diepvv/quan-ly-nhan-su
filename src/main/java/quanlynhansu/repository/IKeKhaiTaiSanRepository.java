package quanlynhansu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import quanlynhansu.model.entity.Kekhaitaisan;

@Repository
public interface IKeKhaiTaiSanRepository extends
		CrudRepository<Kekhaitaisan, Integer> {
}
