package com.db.sys.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.db.common.vo.JsonResult;
import com.db.common.vo.PageObject;
import com.db.sys.entity.SysLog;
import com.db.sys.service.SysLogService;

@Controller//告诉spring，此类交给spring管理
@RequestMapping("/log/") //定义对外的url
public class SysLogController {
	
	 @Autowired
	 @Qualifier("sysLogServiceImpl")
	 private SysLogService sysLogService;//has a
	 //=new SysLogServiceImpl();
	
	 @RequestMapping("doLogListUI")
	 public String doLogListUI() {
		 return "sys/log_list";
	 }
	 
	 @PostMapping("doDeleteObjects")
	 @ResponseBody
	 public JsonResult doDeleteObjects(
		 @RequestParam("idArray")Integer...ids) {//1,2,3,4
		 sysLogService.deleteObjects(ids);
		 return new JsonResult("delete ok");
	 }
	 
	 @GetMapping("doFindPageObjects")
	 @ResponseBody
	 public JsonResult doFindPageObjects(
			Integer pageCurrent,String username){
		    PageObject<SysLog> pageObject=
		 	sysLogService.findPageObjects(pageCurrent, username);
	        return new JsonResult(pageObject);
	 }
}




