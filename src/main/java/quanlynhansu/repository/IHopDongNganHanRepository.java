package quanlynhansu.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import quanlynhansu.model.entity.Hopdongnganhan;

@Repository
public interface IHopDongNganHanRepository extends CrudRepository<Hopdongnganhan, Integer> {
	@Query("SELECT hdnh from Hopdongnganhan hdnh where hdnh.pk=:pk and hdnh.version=:version")
	Hopdongnganhan findOneByPkAndVersion(@Param("pk") Integer pk, @Param("version") Integer version);

}
