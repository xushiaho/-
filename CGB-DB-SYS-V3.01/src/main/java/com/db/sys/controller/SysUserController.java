package com.db.sys.controller;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.db.common.vo.JsonResult;
import com.db.sys.entity.SysUser;
import com.db.sys.service.SysUserService;

@RequestMapping("/user/")
@Controller
public class SysUserController {
	   @Autowired
	   private SysUserService sysUserService;
	   @RequestMapping("doUserListUI")
	   public String doUserListUI() {
		   return "sys/user_list";
	   }
	   @RequestMapping("doUserEditUI")
	   public String doUserEditListUI() {
		   return "sys/user_edit";
	   }
	   @RequestMapping("doFindObjectById")
	   @ResponseBody
	   public JsonResult doFindObjectById(Integer id) {
		   Map<String,Object> map=
		   sysUserService.findObjectById(id);
		   return new JsonResult(map);
	   }
	   @RequestMapping("doUpdateObject")
	   @ResponseBody
	   public JsonResult doUpdateObject(
			   SysUser entity,
			   Integer[] roleIds) {
		   sysUserService.updateObject(entity, roleIds);
		   return new JsonResult("update ok");
	   }
	   @RequestMapping("doSaveObject")
	   @ResponseBody
	   public JsonResult doSaveObject(
			  SysUser entity,
			  Integer[] roleIds) {
		      sysUserService.saveObject(entity, roleIds);
		      return new JsonResult("save ok");
	   }
	   
	   @RequestMapping("doValidById")
	   @ResponseBody
	   public JsonResult doValidById(
			   Integer id,Integer valid) {
		   sysUserService.validById(id,
				   valid, "admin");
		   return new JsonResult("update ok");
	   }
	   
	   @RequestMapping("doFindPageObjects")
	   @ResponseBody
	   public JsonResult doFindPageObjects(
			   Integer pageCurrent,String username) {
		  return new JsonResult(
		  sysUserService.findPageObjects(pageCurrent, username));
	   }   
}
