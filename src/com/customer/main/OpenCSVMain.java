package com.customer.main;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

import com.customer.dto.CustomerDTO;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class OpenCSVMain {

	private static final String CSV_FILE_PATH = "customer10.csv";

	
	public static void main(String[] args) throws IOException {

		try(
		  Reader reader = Files.newBufferedReader(Paths.get(CSV_FILE_PATH));
		) {
			ColumnPositionMappingStrategy strategy = new ColumnPositionMappingStrategy();
			strategy.setType(CustomerDTO.class);
			String[] memberFieldsToBindTo = {"orderId", "customerName", "deliveryNumber", "product", "price"};
			strategy.setColumnMapping(memberFieldsToBindTo);
			
			CsvToBean<CustomerDTO> csvToBean = new CsvToBeanBuilder(reader)
					.withMappingStrategy(strategy)
					.withSkipLines(1)
					.withIgnoreLeadingWhiteSpace(true)
					.build();
			
			Iterator<CustomerDTO> myCustomerIterator = csvToBean.iterator();
			String output = "";
			
			while (myCustomerIterator.hasNext()) {
				CustomerDTO myCustomer = myCustomerIterator.next();
//				System.out.println("Name : " + myCustomer.getName());
//				System.out.println("Email : " + myCustomer.getEmail());
//				System.out.println("PhoneNo : " + myCustomer.getPhoneNo());
//				System.out.println("Country : " + myCustomer.getCountry());
//				System.out.println("===========================");
				
				
				output = myCustomer.toString();
				System.out.println(output);
				
			}
			
		}
	}

}
