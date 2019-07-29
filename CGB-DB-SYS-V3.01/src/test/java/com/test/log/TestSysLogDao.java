package com.test.log;
import java.util.List;

import org.junit.Test;

import com.db.sys.dao.SysLogDao;
import com.db.sys.entity.SysLog;
import com.test.TestBase;
public class TestSysLogDao extends TestBase{
	 @Test
	 public void testGetRowCount() {
		 SysLogDao dao=
		 ctx.getBean("sysLogDao",SysLogDao.class);
		 System.out.println("dao="+dao);
		 int rowCount=dao.getRowCount("admin");
		 System.out.println(rowCount);
	 }
	 @Test
	 public void testFindPageObjects() {
		 SysLogDao dao=ctx.getBean(
				 "sysLogDao",SysLogDao.class);
		 List<SysLog> list=dao.findPageObjects("admin",
				 0, 3);
		 System.out.println(list.size());
	 }
}




