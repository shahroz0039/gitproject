package com.hexaware.java8examples.sellerproject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SellerController {

	List <SellerModel> sellerList = new ArrayList <SellerModel> ();
	
	public void populateRecords() {
		sellerList.add(new SellerModel(100, "hari", "hari@gmail.com", "Chennai"));
		sellerList.add(new SellerModel(101, "Doe", "Jenny@gmail.com", "Banglore"));
		sellerList.add(new SellerModel(102, "Harri", "Harri@gmail.com", "Hyderabad"));
		sellerList.add(new SellerModel(103, "Marti", "Marti@gmail.com", "Mumbai"));
		sellerList.add(new SellerModel(104, "Nelson", "Nelson@gmail.com", "Pune"));
		
	}
	
	public void addSeller(int id, String name, String location, String email) {
		sellerList.add(new SellerModel(id, name, location, email));
		System.out.println("Seller Added");
	}
	
	public void displayAllSellers() {
		sellerList.stream().forEach((seller) -> System.out.println(seller));
	}
	
	public void searchById(int id) {
		sellerList.stream()
		.filter((seller) -> id == seller.getId())
		.forEach((seller) -> System.out.println(seller));
	}
	
	public void deleteById(int id) {
		
		sellerList =  sellerList.stream()
		.filter((seller) -> id != seller.getId())
		.collect(Collectors.toList());
		
		sellerList.stream()
		.forEach((seller) -> System.out.println(seller));
	}
	
	public void updateById(int id, String name, String location, String email) {
		sellerList.stream()
		.filter((seller) -> id == seller.getId())
		.forEach((seller) -> {
			seller.setId(id);
			seller.setName(name);
			seller.setEmail(email);
			seller.setLocation(location);
		});
		
		sellerList.stream().forEach((seller) -> System.out.println(seller));

	}
	
	public void displayByLocation(String location) {
		sellerList.stream()
		.filter((seller) -> location.equals(seller.getLocation()))
		.forEach((seller) -> System.out.println(seller));
	}
	
}