package com.tedu.service;

import java.util.List;

import com.tedu.pojo.Order;

public interface OrderService {
	/**1.查询所有订单信息*/
	public List<Order> findAll();
	/**2.新增订单信息*/
	public void addOrder(Order order);
	/**3.根据id删除订单信息*/
	public void deleteById(Integer id);
	/**4.根据id查询订单信息*/
	public Order findById(Integer id);
	/**5.根据id修改订单信息*/
	public void updateById(Order order);
	
}







