<%@page import="com.dao.signupdao"%>
<%@page import="java.time.format.SignStyle"%>
<%@page import="com.bean.signup"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- Basic -->
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<!-- Mobile Metas -->
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<!-- Site Metas -->
<meta name="keywords" content="" />
<meta name="description" content="" />
<meta name="author" content="" />
<link rel="shortcut icon" href="images/favicon.png" type="">
<title>Famms - Fashion </title>
<!-- bootstrap core css -->
<link rel="stylesheet" type="text/css" href="css/bootstrap.css" />
<!-- font awesome style -->
<link href="css/font-awesome.min.css" rel="stylesheet" />
<!-- Custom styles for this template -->
<link href="css/style.css" rel="stylesheet" />
<!-- responsive style -->
<link href="css/responsive.css" rel="stylesheet" />
</head>
<body>
	<div class="hero_area">
		<!-- header section strats -->
		<header class="header_section">
			<div class="container">
				<nav class="navbar navbar-expand-lg custom_nav-container ">
					<a class="navbar-brand" href="index.jsp"><img width="250"
						src="images/logo.png" alt="#" /></a>
					<button class="navbar-toggler" type="button" data-toggle="collapse"
						data-target="#navbarSupportedContent"
						aria-controls="navbarSupportedContent" aria-expanded="false"
						aria-label="Toggle navigation">
						<span class=""> </span>
					</button>
					<div class="collapse navbar-collapse" id="navbarSupportedContent">
						<ul class="navbar-nav">
							<li class="nav-item active"><a class="nav-link"
								href="index.jsp">Home <span class="sr-only">(current)</span></a>
							</li>

								<li class="nav-item dropdown">
                           <a class="nav-link dropdown-toggle" href="#" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="true"> <span class="nav-label">Pages<span class="caret"></span></a>
                           <ul class="dropdown-menu">
                              <li><a href="product.jsp">all product</a></li>
                              category
                              <li><a href="filter.jsp?category=men">men</a></li>
                           	<li><a href="filter.jsp?category=women">women</a></li>
                           	<li><a href="filter.jsp?category=kid">kid</a></li>                           	
                           </ul>
                        </li>
							<li class="nav-item"><a class="nav-link" href="contact.jsp">Contact</a>
							</li>

							<%
								signup s1 = null;
		
								if(session!=null)
								{
									if(session.getAttribute("s")!=null)
									{
										s1 = (signup)session.getAttribute("s");	
							%>
						    <li class="nav-item"><a class="nav-link" href="profile.jsp">profile</a></li>
							<li class="nav-item"><a class="nav-link" href="changepsw.jsp">changepsw</a></li>
							<li class="nav-item"><a class="nav-link" href="logout.jsp">logout<br>Welcome,<%=s1.getFname() %></a>
														

							<% 
									} 	
									else
									{
							%>
							<li class="nav-item"><a class="nav-link" href="signup.jsp">Signup</a>
							</li>
							<li class="nav-item"><a class="nav-link" href="login.jsp">login</a>
							</li>
							<% 			
									}
								}
								else
								{
							%>
							<li class="nav-item"><a class="nav-link" href="signup.jsp">Signup</a>
							</li>
							<li class="nav-item"><a class="nav-link" href="login.jsp">login</a>
							</li>

							<% 		
								}
								
							%>



													</ul>
					</div>
				</nav>
			</div>
		</header>

		</head>
</html>