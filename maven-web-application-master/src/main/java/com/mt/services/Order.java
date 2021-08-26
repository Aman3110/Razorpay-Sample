package com.mt.services;
import java.util.*;

import java.awt.List;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.json.*;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.razorpay.*;


@Controller
@RequestMapping(value="/order")
public class Order {
	@RequestMapping(value = "/getOrderDetails", method = RequestMethod.GET)
	@ResponseBody
	String create_orderid(HttpServletRequest request, HttpServletResponse response, HttpSession httpSession)
			throws RazorpayException 
	{
		Keys obj1=new Keys();

		try 
			{
			RazorpayClient razorpay = new RazorpayClient(obj1.getKeyId(), obj1.getKeySecret());

		
			CreateOrder obj=new CreateOrder();
			com.razorpay.Order order = razorpay.Orders.create(obj.create_json(request, response, httpSession));
			
			
			
			//return("order_Ho9noMpUp25Y7P");
			return(order.get("id").toString());
			
			  
			} 
		catch (RazorpayException e) 
			{
			
			  return(e.getMessage());
			}
	}
}

