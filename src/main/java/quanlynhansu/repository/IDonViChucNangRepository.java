package quanlynhansu.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import quanlynhansu.model.entity.Donvichucnang;

@Repository
public interface IDonViChucNangRepository extends CrudRepository<Donvichucnang, Integer> {
	@Query("SELECT dvcn from Donvichucnang dvcn where dvcn.pk=:pk and dvcn.version=:version")
	Donvichucnang findOneByPkAndVersion(@Param("pk") Integer pk, @Param("version") Integer version);
}
