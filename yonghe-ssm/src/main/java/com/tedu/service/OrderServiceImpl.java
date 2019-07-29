package com.tedu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.dao.OrderMapper;
import com.tedu.pojo.Order;

@Service
public class OrderServiceImpl 
			implements OrderService{
	@Autowired
	private OrderMapper dao;
	
	/** 1.查询所有订单信息 */
	public List<Order> findAll() {
		List<Order> list = dao.findAll();
		return list;
	}

	/**2.新增订单信息*/
	public void addOrder(Order order) {
		dao.addOrder(order);
	}

	/**3.根据id删除订单信息*/
	public void deleteById(Integer id) {
		dao.deleteById(id);
	}

	/**4.根据id查询订单信息*/
	public Order findById(Integer id) {
		Order order = dao.findById(id);
		return order;
	}

	/** 5.根据id修改订单信息 */
	public void updateById(Order order) {
		dao.updateById(order);
	}
	
	
}












