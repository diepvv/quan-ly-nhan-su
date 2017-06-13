package quanlynhansu.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import quanlynhansu.model.entity.Dantoc;

@Repository
public interface IDanTocRepository extends CrudRepository<Dantoc, Integer> {
	@Query("SELECT dt from Dantoc dt where dt.pk=:pk and dt.version=:version")
	Dantoc findOneByPkAndVersion(@Param("pk") Integer pk, @Param("version") Integer version);

}
