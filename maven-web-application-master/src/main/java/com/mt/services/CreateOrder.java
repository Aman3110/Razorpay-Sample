package com.mt.services;
import java.util.*;

import java.awt.List;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.razorpay.*;


@Controller
@RequestMapping(value="/ordercreate")

public class CreateOrder {
	@RequestMapping(value = "/postCreateOrderDetails", method = RequestMethod.POST)
	@ResponseBody
	JSONObject create_json(HttpServletRequest request, HttpServletResponse response, HttpSession httpSession)
			throws RazorpayException 
	{
		Keys obj=new Keys();

		try 
		{
			RazorpayClient razorpay = new RazorpayClient(obj.getKeyId(), obj.getKeySecret());
			JSONObject orderRequest = new JSONObject();
			orderRequest.put("amount", 50000); 
			orderRequest.put("currency", "INR");
			return (orderRequest);
		}
		catch(RazorpayException e)
		{
			JSONObject obj1=new JSONObject();
			return obj1 ;
		}
	}
}
