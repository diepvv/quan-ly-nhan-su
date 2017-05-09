package quanlynhansu.service;

import java.util.ArrayList;

import quanlynhansu.model.dto.QuyetDinhKyLuatDTO;

public interface IQuyetDinhKyLuatService {
	public ArrayList<QuyetDinhKyLuatDTO> getAll();

	void delete(Integer id);

	public QuyetDinhKyLuatDTO getById(Integer id);

	QuyetDinhKyLuatDTO update(QuyetDinhKyLuatDTO t);

	QuyetDinhKyLuatDTO insert(QuyetDinhKyLuatDTO t);
}
