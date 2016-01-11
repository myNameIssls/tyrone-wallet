package cn.tyrone.wallet.tally.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tyrone.wallet.core.controller.BaseController;

/**
 * 
 * @author sls
 *
 */
@Controller @RequestMapping(value = "/tally")
public class TallyController extends BaseController {
	
	@RequestMapping(value = "/details",method = {RequestMethod.GET})
	public String details(HttpServletRequest request){
		String method = request.getMethod();
		System.out.println(method);
		return "tally/detail";
	}
	@ResponseBody
	@RequestMapping(value = "/getDetailsData",method = {RequestMethod.POST})
	public String getDetailsData(HttpServletResponse response) throws IOException{
		System.out.println("-----------------------");
		
		String json = "{\"total\":28,\"rows\":[{\"time\":\"2016-01-02\",\"type\":\"收入\",\"account-type\":\"工资\",\"money\":\"5000\",\"remark\":\"我的工资\"}]}";
		
		System.out.println(json);
		return json;
	}
}
