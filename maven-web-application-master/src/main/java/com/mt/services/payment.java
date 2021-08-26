package com.mt.services;
import java.io.IOException;
import java.awt.*;
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
@RequestMapping("/payment")

public class payment {
	@RequestMapping(value = "/getPaymentDetails", method = RequestMethod.GET)
	@ResponseBody
	String create_paymentid(HttpServletRequest request, HttpServletResponse response, HttpSession httpSession)
			throws RazorpayException
	{
		Keys obj1=new Keys();

		try
		{
			com.mt.services.Order obj=new com.mt.services.Order();
		
			RazorpayClient razorpay = new RazorpayClient(obj1.getKeyId(), obj1.getKeySecret());
		
			java.util.List<Payment> payments = razorpay.Orders.fetchPayments(obj.create_orderid(request, response, httpSession));
		
		 
			try
			{
			return(payments.get(0).get("id").toString());
			}
			catch(Exception e)
			{
				return("No payment has been made for this particular order_id");
			}
			
			
			
		}
		catch(RazorpayException e)
		{
			return(e.getMessage());
			
		}

}
}
