package quanlynhansu.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import quanlynhansu.model.dto.HopDongNganHanDTO;
import quanlynhansu.model.entity.Hopdongnganhan;
import quanlynhansu.repository.IHopDongNganHanRepository;

@Component
public class HopDongNganHanServiceImpl implements IHopDongNganHanService {

    @Autowired
    private IHopDongNganHanRepository repo;

    @Override
    public ArrayList<HopDongNganHanDTO> getAll() {

        ArrayList<HopDongNganHanDTO> ketqua = new ArrayList<>();

        Iterable<Hopdongnganhan> listFromDb = repo.findAll();

        for (Hopdongnganhan h : listFromDb) {
            ketqua.add(new HopDongNganHanDTO(h.getMaHDNganHan().intValue(), h.getTenHopDong(), h.getTenNhanVien(),
                    h.getNgayKy(), h.getTuNgay(), h.getDenNgay()));
        }

        return ketqua;
    }

    @Override
    public void delete(int id) {
        repo.delete(Integer.valueOf(id));
    }

    @Override
    public HopDongNganHanDTO getById(int id) {
        Hopdongnganhan entity = repo.findOne(Integer.valueOf(id));
        return new HopDongNganHanDTO(entity.getMaHDNganHan().intValue(), entity.getTenHopDong(),
                entity.getTenNhanVien(), entity.getNgayKy(), entity.getTuNgay(), entity.getDenNgay());
    }

    @Override
    public HopDongNganHanDTO update(HopDongNganHanDTO t) {
        addOrUpdate(t);
        return t;
    }

    @Override
    public HopDongNganHanDTO insert(HopDongNganHanDTO t) {
        addOrUpdate(t);
        return t;
    }

    private Hopdongnganhan addOrUpdate(HopDongNganHanDTO dto) {
        Hopdongnganhan entity = new Hopdongnganhan();
        if (dto.getMaHDNganHan() != null && dto.getMaHDNganHan().intValue() != -1) {
            entity = repo.findOne(Integer.valueOf(dto.getMaHDNganHan()));
        }

        entity.setTuNgay(dto.getTuNgay());
        entity.setDenNgay(dto.getDenNgay());
        entity.setNgayKy(dto.getNgayKy());
        entity.setTenHopDong(dto.getTenHopDong());
        entity.setTenNhanVien(dto.getTenNhanVien());
        return repo.save(entity);
    }
}
