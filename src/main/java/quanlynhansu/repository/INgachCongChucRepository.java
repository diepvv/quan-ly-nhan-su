package quanlynhansu.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import quanlynhansu.model.entity.Ngachcongchuc;

@Repository
public interface INgachCongChucRepository extends CrudRepository<Ngachcongchuc, Integer> {
	@Query("SELECT ncc from Ngachcongchuc ncc where ncc.pk=:pk and ncc.version=:version")
	Ngachcongchuc findOneByPkAndVersion(@Param("pk") Integer pk, @Param("version") Integer version);
}
