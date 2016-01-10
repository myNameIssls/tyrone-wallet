package cn.tyrone.wallet.tally.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @author sls
 *
 */
@Controller @RequestMapping(value = "/tally")
public class TallyController {
	
	@RequestMapping(value = "/details",method = {RequestMethod.GET,RequestMethod.POST})
	public String details(){
		return "tally/detail";
	}
	@RequestMapping(value = "/getDetailsData",method = {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public String getDetailsData(HttpServletResponse response) throws IOException{
		System.out.println("-----------------------");
		
		String json = "{\"total\":28,\"rows\":[{\"time\":\"2016-01-02\",\"type\":\"收入\",\"account-type\":\"工资\",\"money\":\"5000\",\"remark\":\"我的工资\"}]}";
		
		System.out.println(json);
//		response.getWriter().write(json);
		return json;
	}
	
	@RequestMapping(value = "/test",produces="text/html;charset=UTF-8")
	public String test(){
		return null;
	}
	
}
