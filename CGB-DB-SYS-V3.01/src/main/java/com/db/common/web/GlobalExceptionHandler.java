package com.db.common.web;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import com.db.common.vo.JsonResult;
/**
 * @ControllerAdvice 修饰的类为一个全局异常处理类
 * 说明：此类需要在配置文件(spring-web.xml)中进行
 * 扫描配置。
 */
@ControllerAdvice
public class GlobalExceptionHandler {
	 /**
	 * @ExceptionHandler 注解修饰的方法为异常处理方法
	 * @param e
	 * @return
	 */
     @ExceptionHandler(RuntimeException.class)
	 @ResponseBody
     public JsonResult doHandleRuntimeException(
			 RuntimeException e) {
		 e.printStackTrace();
		 return new JsonResult(e);
	 }
}



