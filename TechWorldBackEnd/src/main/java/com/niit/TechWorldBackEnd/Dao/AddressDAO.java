package com.niit.TechWorldBackEnd.Dao;

import java.util.List;

import com.niit.TechWorldBackEnd.model.Address;

public interface AddressDAO {

	public boolean save(Address address);

	public boolean update(Address address);

	public List<Address> list();
	
	public boolean delete(String id);
	
	public Address getAddressById(String id);
	
	public Address getAddressByUserid(String userid);

}
