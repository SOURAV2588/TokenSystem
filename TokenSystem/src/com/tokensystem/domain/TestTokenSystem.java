package com.tokensystem.domain;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class TestTokenSystem {

	public static void main(String[] args) {
		//For the sake of simplicity,
		//we would consider that there is only one counter,
		//as there is no more data mentioned about it
		
		//We would also consider that the token is not generated one-by-one,
		//but they are generated after all customers are considered
		List<Customer> customers = new ArrayList<>();
		Customer deep = new Customer("Deep",false, Instant.now());
		Customer sourav = new Customer("Sourav",false, Instant.now());
		Customer krati = new Customer("Krati",true, Instant.now());
		Customer shruti = new Customer("Shruti",true, Instant.now());
		customers.add(deep);
		customers.add(sourav);
		customers.add(krati);
		customers.add(shruti);
		TokenSystem tokenSystem = new TokenSystem();
		tokenSystem.compareCustomers(customers);
		customers.forEach(cus -> System.out.println(cus));
	}

}
