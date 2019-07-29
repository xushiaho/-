package com.test.log;
import org.junit.Test;
import com.db.common.vo.PageObject;
import com.db.sys.entity.SysLog;
import com.db.sys.service.SysLogService;
import com.test.TestBase;
public class TestSysLogService extends TestBase {
	@Test
	public void testFindPageObjects() {
		SysLogService sysLogService=
		ctx.getBean("sysLogServiceImpl",
				SysLogService.class);
		PageObject<SysLog> po=
		sysLogService.findPageObjects(
				1,"admin");
		System.out.println(po.getRowCount());
		System.out.println(po.getPageCount());
	}
}
