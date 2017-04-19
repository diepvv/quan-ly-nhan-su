package quanlynhansu.models.dto;

import java.io.Serializable;

public class TonGiaoDTO implements Serializable {
	private static final long serialVersionUID = -1300578656885073505L;
	private int maTonGiao;
	private String tenTonGiao;

	public TonGiaoDTO() {
	}

	@Deprecated
	public TonGiaoDTO(int maTonGiao, String tenTonGiao) {
		super();
		this.maTonGiao = maTonGiao;
		this.tenTonGiao = tenTonGiao;
	}

	public int getMaTonGiao() {
		return maTonGiao;
	}

	public void setMaTonGiao(int maTonGiao) {
		this.maTonGiao = maTonGiao;
	}

	public String getTenTonGiao() {
		return tenTonGiao;
	}

	public void setTenTonGiao(String tenTonGiao) {
		this.tenTonGiao = tenTonGiao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
