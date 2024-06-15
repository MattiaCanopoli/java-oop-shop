package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Prodotto prodotto1 = new Prodotto("name", "desc", 200, 12);
//
//		System.out.println(prodotto1.getProductName());
//		System.out.println(prodotto1.getProductDescription());
//		System.out.println(prodotto1.getProductPrice());
//		System.out.println(prodotto1.getProductCode());
//		System.out.println(prodotto1.getCodeWithZeros());
//		System.out.println(prodotto1.getProductInfo());

		Prodotto prodotto2 = new Prodotto("name2");

		prodotto2.setProductName();
		prodotto2.setProductDescription();
		prodotto2.setProductPrice();
		prodotto2.setVat();

		System.out.println("Nome prodotto: " + prodotto2.getProductName());
		System.out.println("Descrizione prodotto: " + prodotto2.getProductDescription());
		System.out.println("Prezzo prodotto: " + prodotto2.getProductPrice());
		System.out.println("Codice prodotto: " + prodotto2.getProductCode());
		System.out.println("Codice prodotto: " + prodotto2.getCodeWithZeros());
		System.out.println("Nome completo prodotto: " + prodotto2.getProductInfo());
		System.out.println("Prezzo ivato prodotto: " + prodotto2.getVatPrice());
		System.out.println(prodotto2.getHumanVatPrice());

	}

}
