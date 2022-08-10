package com.hexaware.java8examples.sellerproject;
public class SellerView {

	public static void main(String[] args) {
		SellerController sc = new SellerController();
		
		sc.populateRecords();
		
		sc.displayAllSellers();
		
//		sc.addSeller(6, "Nancy", "Nancy@gmail.com", "Delhi");
//		
//		sc.displayAllSellers();
		
//		sc.deleteById(4);
//		
//		sc.updateById(4, "Davi", "Pune", "Davi@gamil.com");
//		
//		sc.displayByLocation("Chennai");
	}
}