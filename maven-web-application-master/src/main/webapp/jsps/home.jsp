<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.net.*" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Razorpay Integrations</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {
  font-family: Arial;
  font-size: 17px;
  padding: 8px;
  background-color: #f2f2f2;
  padding: 5px 20px 15px 20px;
  border: 1px solid lightgrey;
  border-radius: 3px;
}
* 
.container {
  background-color: #f2f2f2;
  padding: 5px 20px 15px 20px;
  border: 1px solid lightgrey;
  border-radius: 3px;
}
a {
  color: #2196F3;
}

hr {
  border: 1px solid lightgrey;
}

span.price {
  float: right;
  color: grey;
}

</style>
</head>
</head>
<body>
<h1 align="center">Razorpay Java Server Integration System</h1>
<hr>
<div style="text-align: center;">
	<span>
		<img src="images/download.jpg" alt="" width="100">
	</span>
		<a href="https://razorpay.com/">Visit our Website</a>
	
</div>
<hr>
<div class="col-50">
            <h3>Payment</h3>
            <label for="fname">Accepted Cards</label>
            <div class="icon-container">
              <i class="fa fa-cc-visa" style="color:navy;"></i>
              <i class="fa fa-cc-amex" style="color:blue;"></i>
              <i class="fa fa-cc-mastercard" style="color:red;"></i>
              <i class="fa fa-cc-discover" style="color:orange;"></i>
            </div>
           
          
        </div>
<div>
	<h4>Create your order</h4>
	<p><a href="services/order/getOrderDetails">Click to create an order</a></p>
	<h4>Get your payments_id</h4>
	<p><a href="services/payment/getPaymentDetails">Click to get payment for your order</a></p>
	<h4>Capture the payment</h4>
	<p><a href="services/capture/postCaptureDetails">Click to check the status of payment
	</p>
	<form><script src="https://checkout.razorpay.com/v1/payment-button.js" data-payment_button_id="pl_Ho9lmvIJwAnoTt" async> </script> </form>
	</div>


</body>
</html>
