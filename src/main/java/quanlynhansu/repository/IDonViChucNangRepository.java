package quanlynhansu.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import quanlynhansu.model.entity.Donvichucnang;

@Repository
public interface IDonViChucNangRepository extends
		CrudRepository<Donvichucnang, Integer> {

}
