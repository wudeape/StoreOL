package dao;

import java.text.ParseException;
import java.util.List;

import entity.Customer;

public interface CustomerDao extends BaseDao<Customer> {
	public List<Customer> findOne(Customer customer);
	
	public List<Customer> getOneByName(String customerName);
	
	public List<Customer> getAllByLimit(int page, int rows);
	
	public List<Customer> getQueryList(String birthday1, String birthday2, String name, String sex, String vocation) throws ParseException;
	
	public List<Customer> getQueryListLimit(int rows, int page, String birthday1, String birthday2, String name,
			String sex, String vocation) throws ParseException;
}
