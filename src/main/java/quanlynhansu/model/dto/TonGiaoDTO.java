package quanlynhansu.model.dto;

import java.io.Serializable;

public class TonGiaoDTO implements Serializable {
	private static final long serialVersionUID = -1300578656885073505L;
	private Integer pk;
	private String tenTonGiao;
	private Integer version = 0;

	public TonGiaoDTO() {
	}

	@Deprecated
	public TonGiaoDTO(Integer pk, String tenTonGiao) {
		super();
		this.pk = pk;
		this.tenTonGiao = tenTonGiao;
	}

	public Integer getPk() {
		return pk;
	}

	public void setPk(Integer pk) {
		this.pk = pk;
	}

	public String getTenTonGiao() {
		return tenTonGiao;
	}

	public void setTenTonGiao(String tenTonGiao) {
		this.tenTonGiao = tenTonGiao;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
