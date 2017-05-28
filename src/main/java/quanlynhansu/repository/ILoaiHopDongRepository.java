package quanlynhansu.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import quanlynhansu.model.entity.Loaihopdong;

@Repository
public interface ILoaiHopDongRepository extends CrudRepository<Loaihopdong, Integer> {
	@Query("SELECT lhd from Loaihopdong lhd where lhd.pk=:pk and lhd.version=:version")
	Loaihopdong findOneByPkAndVersion(@Param("pk") Integer pk, @Param("version") Integer version);
}
