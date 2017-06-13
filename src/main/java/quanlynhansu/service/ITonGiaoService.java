package quanlynhansu.service;

import java.util.ArrayList;

import quanlynhansu.model.dto.TonGiaoDTO;

public interface ITonGiaoService {
	public ArrayList<TonGiaoDTO> getAll();

	void delete(Integer id, Integer version);

	public TonGiaoDTO getById(Integer id);

	TonGiaoDTO update(TonGiaoDTO t);

	TonGiaoDTO insert(TonGiaoDTO t);
}
