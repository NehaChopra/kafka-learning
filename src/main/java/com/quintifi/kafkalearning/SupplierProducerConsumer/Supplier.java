package com.quintifi.kafkalearning.SupplierProducerConsumer;

import java.time.LocalDateTime;
import java.util.Date;

public class Supplier {
	private int supplierId;
	private String supplierName;
	private LocalDateTime supplierStartDate;

	public Supplier(int supplierId, String supplierName, LocalDateTime supplierStartDate) {
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.supplierStartDate = supplierStartDate;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public LocalDateTime getSupplierStartDate() {
		return supplierStartDate;
	}

	public void setSupplierStartDate(LocalDateTime supplierStartDate) {
		this.supplierStartDate = supplierStartDate;
	}

	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", supplierName=" + supplierName + ", supplierStartDate="
				+ supplierStartDate + "]";
	}

}
