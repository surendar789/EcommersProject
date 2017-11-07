package com.niit.TechWorldBackEnd.Dao;

import java.util.List;

import com.niit.TechWorldBackEnd.model.OrderTable;

public interface OrderTableDAO {
	
	public boolean save(OrderTable orderTable);
	public List<OrderTable> list(String userId);

}
