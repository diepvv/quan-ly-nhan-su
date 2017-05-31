package quanlynhansu.service;

import java.util.ArrayList;
import java.util.Set;

import quanlynhansu.model.dto.CanBoDTO;

public interface ICanBoService {
	public ArrayList<CanBoDTO> getAll();

	void delete(Integer id, Integer version);

	public CanBoDTO getById(Integer id);

	CanBoDTO update(CanBoDTO t);

	CanBoDTO insert(CanBoDTO t);

	Set<CanBoDTO> getByGioiTinh(String cbGioiTinhs);

	Set<CanBoDTO> getByDanToc(Integer cbDanTocs);
	
	Set<CanBoDTO> getByTonGiao(Integer cbTonGiaos);
	
	Set<CanBoDTO> getByChucVu(Integer cbChucVus);
	
	Set<CanBoDTO> getByChucDanh(String chucDanh);
	
	Set<CanBoDTO> getByDonViBoMon(Integer cbDonViChucNangs, Integer cbBoMons);
	
	Set<CanBoDTO> getByQueQuan(Integer cbQueQuans);
	
	Set<CanBoDTO> getByNgachCongChuc(Integer cbNgachCongChucs);
	
	Set<CanBoDTO> getByDonViChucNang(Integer txtDonViChucNangs);
}
