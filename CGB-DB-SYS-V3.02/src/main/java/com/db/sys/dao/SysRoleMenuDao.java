package com.db.sys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * 基于此接口操作角色/菜单关系表(sys_role_menus)数据
 * @author Administrator
 */
public interface SysRoleMenuDao {
	/**
	 * 基于多个角色id查询菜单id
	 * @param roleId
	 * @return
	 */
	List<Integer> findMenuIdsByRoleIds(
	@Param("roleIds")Integer[] roleIds);
	/**
	 * 将角色和菜单的关系数据写入到数据库
	 * @param roleId
	 * @param menuIds
	 * @return
	 */
	int insertObjects(
			@Param("roleId")Integer roleId,
			@Param("menuIds")Integer[] menuIds);
	
	/**
	 * 基于字段名以及对应的值执行删除操作
	 * @param column
	 * @param id
	 * @return
	 */
	int deleteObjectsByColumnId(
			@Param("column")String column,
			@Param("id")Integer id);
	/**
	 * 基于角色id删除角色和菜单的关系数据
	 * @param roleId
	 * @return
	 */
	int deleteObjectsByRoleId(Integer roleId);
	 /**
	  * 基于菜单id删除关系表数据
	  * @param menuId 菜单id
	  * @return 删除的行数
	  */
     int deleteObjectsByMenuId(Integer menuId);
}




