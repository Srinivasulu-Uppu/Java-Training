package com.citibank.main;

import java.util.List;

import com.citibank.main.domain.Customer;
import com.citibank.main.service.CustomerService;

public class DataBaseMain {

	public static void main(String[] args) {
		
		CustomerService customerService = new CustomerService();
		Customer customer;
		
 	    customerService.getAllCustomers();
		
		
//		System.out.println("--------------");
//		System.out.println("Insert into table customer_details::");
//		
//		customer = new Customer(101, "Citi", "Pune");
//		boolean chkFlag = customerService.addNewCustomer(customer);
//		if (chkFlag) {
//			System.out.println("Customer inserted successfully;");
//		}
//		else {
//			System.out.println("Customer not inserted:");
//		}
//		
//		System.out.println("--------------");
//		System.out.println("Get all customers details::");
//		List<Customer> customersList = customerService.getAllCustomers();
//		System.out.println("Get all customers");
//		for (Customer customer1 : customersList) {
//			System.out.println(customer1);
//		}
//		
//		System.out.println("--------------");
//		System.out.println("Update query::");
//		customer = new Customer(8, "CitiBank", "EON2 - Pune");
//		
//		boolean chkFlag1 = customerService.updateCustomerByCustomerId(customer);
//		
//		if(chkFlag) {
//			System.out.println("Update successful:");
//		}
//		
//		else {
//			System.out.println("Update fialed:");
//		}
		
//		System.out.println("--------------");
//		System.out.println("Get one customer details::");
//		
//		customer = customerService.getCustomerByCustomerId(8);
//		if(customer != null) {
//			System.out.println("customer details::" +customer);
//		}else {
//			System.out.println("Customer not found");
//		}
//			
		
		System.out.println("--------------");
		System.out.println("Delete one customer::");
		
		boolean chkFlag2 = customerService.deleteCustomerByCustomerId(11);
		if(chkFlag2) {
			System.out.println("customer deleted::");
		}else {
			System.out.println("customer not deleted::");
		}
		
		System.out.println("--------------");
		System.out.println("Get one customer details::");
		
		customer = customerService.getCustomerByCustomerId(11);
		if(customer != null) {
			System.out.println("customer details::" +customer);
		}else {
			System.out.println("Customer not found");
		}
			
		
	}

}
