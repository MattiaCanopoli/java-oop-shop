package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

	private int productCode;
	private String productName;
	private String productDescription;
	private int productPrice;
	private int vat;

	public Prodotto(String productName, String productDescription, int productPrice, int vat) {

		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.vat = vat;
		Random code = new Random();
		this.productCode = code.nextInt();

	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public int getVat() {
		return vat;
	}

	public void setVat(int vat) {
		this.vat = vat;
	}

	public int getProductCode() {
		return productCode;
	}

}
