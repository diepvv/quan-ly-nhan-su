package quanlynhansu.service;

import java.util.ArrayList;
import java.util.Set;

import quanlynhansu.model.dto.BacLuongDTO;
import quanlynhansu.model.dto.NgachCongChucDTO;

public interface INgachCongChucService {
	public ArrayList<NgachCongChucDTO> getAll();

	void delete(Integer id);

	public NgachCongChucDTO getById(Integer id);

	NgachCongChucDTO update(NgachCongChucDTO t);

	NgachCongChucDTO insert(NgachCongChucDTO t);

	Set<BacLuongDTO> getBacLuongByNgachCongChuc(Integer ngachCongChucPk);
}
