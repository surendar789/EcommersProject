package com.niit.TechWorldBackEnd.Dao;

import java.util.List;

import com.niit.TechWorldBackEnd.model.Supplier;

public interface SupplierDAO {

	public boolean save(Supplier supplier);

	public boolean update(Supplier supplier);

	public List<Supplier> list();

	public boolean delete(String id);

	public Supplier getSupplierById(String id);

	public Supplier getSupplierByName(String name);

}
