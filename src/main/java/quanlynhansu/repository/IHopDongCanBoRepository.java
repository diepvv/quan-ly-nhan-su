package quanlynhansu.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import quanlynhansu.model.entity.Hopdongcanbo;

@Repository
public interface IHopDongCanBoRepository extends CrudRepository<Hopdongcanbo, Integer> {
	@Query("SELECT hdcb from Hopdongcanbo hdcb where hdcb.pk=:pk and hdcb.version=:version")
	Hopdongcanbo findOneByPkAndVersion(@Param("pk") Integer pk, @Param("version") Integer version);
}
