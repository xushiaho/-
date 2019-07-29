package com.tedu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tedu.dao.DoorMapper;
import com.tedu.pojo.Door;

/** @Service的作用:
 * (1)标识当前类属于service层
 * (2)表示当前类的对象的创建交给
 * Spring容器负责
 */
@Service 
public class DoorServiceImpl 
		implements DoorService{
	@Autowired /* 表示当前类(或接口)的实例
	 将由spring容器负责创建,并赋值给该变量*/
	private DoorMapper dao;
	
	/** 1.查询所有门店 */
	@Override
	public List<Door> findAll() {
		//调用dao层查询所有门店信息
		List<Door> list = dao.findAll();
		return list;
	}
	
	/** 2.新增门店信息 */
	public void addDoor(Door door) {
		//调用dao层新增门店信息的方法
		dao.addDoor( door );
	}
	
	/** 3.根据ID删除门店 */
	@Override
	public void deleteById(Integer id) {
		//调用dao层的根据ID删除门店的方法
		dao.deleteById( id );
	}
	
	/** 4.根据ID查询门店详情信息 */
	@Override
	public Door findById(Integer id) {
		//调用dao层的根据ID查询门店详情的方法
		Door door = dao.findById( id );
		return door;
	}
	
	/** 5.根据ID修改门店信息 */
	@Override
	public void updateById(Door door) {
		//调用dao层的根据ID修改门店信息的方法
		dao.updateById( door );
	}
	
}




