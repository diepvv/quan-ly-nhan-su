package quanlynhansu.service;

import java.util.ArrayList;

import quanlynhansu.model.dto.QuyetDinhDTO;

public interface IQuyetDinhService {
	public ArrayList<QuyetDinhDTO> getAll();

	void delete(Integer id, Integer version);

	public QuyetDinhDTO getById(Integer id);

	QuyetDinhDTO update(QuyetDinhDTO t);

	QuyetDinhDTO insert(QuyetDinhDTO t);
}
