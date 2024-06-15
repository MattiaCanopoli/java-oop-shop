package org.lessons.java.shop;

import java.util.Scanner;

public class Prodotto {

	private int productCode;
	private String productName;
	private String productDescription;
	private float productPrice;
	private int vat;
	private Scanner input = new Scanner(System.in);

	public Prodotto(String productName, String productDescription, int productPrice, int vat) {

		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.vat = vat;
		this.productCode = Utils.randomCode(99999999, 1);

	}

	public Prodotto(String productName) {
		this.productName = productName;
		this.productCode = Utils.randomCode(99999999, 1);
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductName() {
		System.out.println("Inserisci un nome per il prodotto");
		this.productName = input.nextLine();
		// input.close();

	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public void setProductDescription() {
		System.out.println("Inserisci una descrizione");
		this.productDescription = input.nextLine();
		// input.close();
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public void setProductPrice() {
		System.out.println("Inserisci il prezzo");
		this.productPrice = input.nextFloat();
	}

	public int getVat() {
		return vat;
	}

	public void setVat(int vat) {
		this.vat = vat;
	}

	public void setVat() {
		System.out.println("Inserisci la percentuale di IVA da applicare al prodotto");
		this.vat = input.nextInt();
		// input.close();
	}

	public int getProductCode() {
		return productCode;
	}

	public String getProductInfo() {
		String productInfo = productName + "-" + productCode;
		return productInfo;
	}

	public String getCodeWithZeros() {

		int timesToAdd = 8 - Utils.getIntLenght(this.productCode);
		String newProductCode = String.valueOf(this.productCode);

		if (timesToAdd > 0) {
			char charToAdd = '0';
			newProductCode = Utils.repeatChar(charToAdd, timesToAdd) + this.productCode;
		}

		return newProductCode;
	}

	public float getVatPrice() {
		float vatPrice = this.productPrice + ((this.productPrice * this.vat) / 100);
		return vatPrice;
	}

	public String getHumanVatPrice() {
		float vatPrice = this.productPrice + ((this.productPrice * this.vat) / 100);
		String humanVatPrice = String.format("%.2f", vatPrice) + "€";
		return humanVatPrice;
	}

}
