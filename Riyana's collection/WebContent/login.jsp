<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<section class="inner_page_head">
	<div class="container_fuild">
		<div class="row">
			<div class="col-md-12">
				<div class="full">
					<h3>Login</h3>
				</div>
			</div>
		</div>
	</div>
</section>
<!-- end inner page section -->
<!-- why section -->
<section class="why_section layout_padding">
	<div class="container">


		<%
         
         	if(request.getAttribute("msg")!=null)
         	{
         		out.print(request.getAttribute("msg"));
         	}
         %>

		<div class="row">
			<div class="col-lg-8 offset-lg-2">
				<div class="full">
					<form name="login" method="post" action="signupcontroller">
						<fieldset>
							<input type="email" placeholder="Enter your email address"
								name="email" required /> <input type="password"
								placeholder="Enter your password" name="password" required /> <input
								type="submit" value="Login" name="action" />
						</fieldset>
					</form>
				</div>
			</div>
		</div>
	</div>
</section>
<!-- end why section -->
<!-- arrival section -->
<section class="arrival_section">
	<div class="container">
		<div class="box">
			<div class="arrival_bg_box">
				<img src="images/arrival-bg.png" alt="">
			</div>
			<div class="row">
				<div class="col-md-6 ml-auto">
					<div class="heading_container remove_line_bt">
						<h2>#NewArrivals</h2>
					</div>
					<p style="margin-top: 20px; margin-bottom: 30px;">Vitae fugiat
						laboriosam officia perferendis provident aliquid voluptatibus
						dolorem, fugit ullam sit earum id eaque nisi hic? Tenetur commodi,
						nisi rem vel, ea eaque ab ipsa, autem similique ex unde!</p>
					<a href=""> Shop Now </a>
				</div>
			</div>
		</div>
	</div>
</section>
<!-- end arrival section -->
<!-- footer section -->
<footer class="footer_section">
	<div class="container">
		<div class="row">
			<div class="col-md-4 footer-col">
				<div class="footer_contact">
					<h4>Reach at..</h4>
					<div class="contact_link_box">
						<a href=""> <i class="fa fa-map-marker" aria-hidden="true"></i>
							<span> Location </span>
						</a> <a href=""> <i class="fa fa-phone" aria-hidden="true"></i> <span>
								Call +01 1234567890 </span>
						</a> <a href=""> <i class="fa fa-envelope" aria-hidden="true"></i>
							<span> demo@gmail.com </span>
						</a>
					</div>
				</div>
			</div>
			<div class="col-md-4 footer-col">
				<div class="footer_detail">
					<a href="index.jsp" class="footer-logo"> Famms </a>
					<p>Necessary, making this the first true generator on the
						Internet. It uses a dictionary of over 200 Latin words, combined
						with</p>
					<div class="footer_social">
						<a href=""> <i class="fa fa-facebook" aria-hidden="true"></i>
						</a> <a href=""> <i class="fa fa-twitter" aria-hidden="true"></i>
						</a> <a href=""> <i class="fa fa-linkedin" aria-hidden="true"></i>
						</a> <a href=""> <i class="fa fa-instagram" aria-hidden="true"></i>
						</a> <a href=""> <i class="fa fa-pinterest" aria-hidden="true"></i>
						</a>
					</div>
				</div>
			</div>
			<div class="col-md-4 footer-col">
				<div class="map_container">
					<div class="map">
						<div id="googleMap"></div>
					</div>
				</div>
			</div>
		</div>
		<div class="footer-info">
			<div class="col-lg-7 mx-auto px-0">
				<p>
					&copy; <span id="displayYear"></span> All Rights Reserved By <a
						href="https://html.design/">Free Html Templates</a><br>

					Distributed By <a href="https://themewagon.com/" target="_blank">ThemeWagon</a>
				</p>
			</div>
		</div>
	</div>
</footer>
<!-- footer section -->
<!-- jQery -->
<script src="js/jquery-3.4.1.min.js"></script>
<!-- popper js -->
<script src="js/popper.min.js"></script>
<!-- bootstrap js -->
<script src="js/bootstrap.js"></script>
<!-- custom js -->
<script src="js/custom.js"></script>
</body>
</html>