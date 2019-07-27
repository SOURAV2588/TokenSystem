package com.tokensystem.domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TokenSystem {
	
	private static int token = 1;
	
	public void compareCustomers(List<Customer> customerList) {
		
		//find the highest priority customer
		//Among highest priority customers, who came first?
		
		//Working with a copy as the passed object would remove
		//the privileged customers from the list
		List<Customer> copiedCustomerList = new ArrayList<>(customerList);
		
		List<Customer> privilagedCustomers = copiedCustomerList.stream()
														 .filter(customer -> customer.isPrivilaged())
														 .collect(Collectors.toList());
		
		privilagedCustomers.sort(Comparator.comparing(Customer::getEntryTime));
		privilagedCustomers.forEach(cus-> assignAndIncreamentToken(cus));
		
		//List<Customer> unPrivilagedCustomers = 
		copiedCustomerList.removeAll(privilagedCustomers);
		copiedCustomerList.sort(Comparator.comparing(Customer::getEntryTime));
		copiedCustomerList.forEach(cus-> assignAndIncreamentToken(cus));
	}
	
	
	
	
	private void assignAndIncreamentToken(Customer customer) {
		customer.setAssignedTokenNumber(token);
		token = token + 1;
	}

}
