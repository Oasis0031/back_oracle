package com.app.vo;

import java.util.Date;
import java.util.Objects;

public class ProductVO {
	
	private Long id;
	private String ncsProductName;
	private Integer ncsProductPrice;
	private String ncsProductSeller;
	private Date ncsProductCreateAt;
	
	public ProductVO() {;}

	public ProductVO(Long id, String ncsProductName, Integer ncsProductPrice, String ncsProductSeller,
			Date ncsProductCreateAt) {
		super();
		this.id = id;
		this.ncsProductName = ncsProductName;
		this.ncsProductPrice = ncsProductPrice;
		this.ncsProductSeller = ncsProductSeller;
		this.ncsProductCreateAt = ncsProductCreateAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNcsProductName() {
		return ncsProductName;
	}

	public void setNcsProductName(String ncsProductName) {
		this.ncsProductName = ncsProductName;
	}

	public Integer getNcsProductPrice() {
		return ncsProductPrice;
	}

	public void setNcsProductPrice(Integer ncsProductPrice) {
		this.ncsProductPrice = ncsProductPrice;
	}

	public String getNcsProductSeller() {
		return ncsProductSeller;
	}

	public void setNcsProductSeller(String ncsProductSeller) {
		this.ncsProductSeller = ncsProductSeller;
	}

	public Date getNcsProductCreateAt() {
		return ncsProductCreateAt;
	}

	public void setNcsProductCreateAt(Date ncsProductCreateAt) {
		this.ncsProductCreateAt = ncsProductCreateAt;
	}

	@Override
	public String toString() {
		return "productVO [id=" + id + ", ncsProductName=" + ncsProductName + ", ncsProductPrice=" + ncsProductPrice
				+ ", ncsProductSeller=" + ncsProductSeller + ", ncsProductCreateAt=" + ncsProductCreateAt + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, ncsProductCreateAt, ncsProductName, ncsProductPrice, ncsProductSeller);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductVO other = (ProductVO) obj;
		return Objects.equals(id, other.id) && Objects.equals(ncsProductCreateAt, other.ncsProductCreateAt)
				&& Objects.equals(ncsProductName, other.ncsProductName)
				&& Objects.equals(ncsProductPrice, other.ncsProductPrice)
				&& Objects.equals(ncsProductSeller, other.ncsProductSeller);
	}

	
}
