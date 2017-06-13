package quanlynhansu.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import quanlynhansu.model.entity.Tongiao;

@Repository
public interface ITonGiaoRepository extends CrudRepository<Tongiao, Integer> {
	@Query("SELECT tg from Tongiao tg where tg.pk=:pk and tg.version=:version")
	Tongiao findOneByPkAndVersion(@Param("pk") Integer pk, @Param("version") Integer version);

}
