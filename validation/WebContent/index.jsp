<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<script type ="text/javascript">
	function checkfname()
	{
		var f = document.myform.fname.value;
		
		var reg = /^[A-Za-z]+$/;
		
		if(f=="")
			{
			//alert("please enter first name");
			document.getElementById("fname").innerHTML="please enter first name";
			}
		else if(!reg.test(f))
			{
			document.getElementById("fname").innerHTML="enter name";
			}
		else
			{
			document.getElementById("fname").innerHTML=" ";			
			}
	}
		
	function checklname()
	{
		var l = document.myform.lname.value;
		var reg = /^[a-zA-Z]+$/;
		
		if(l=="")
		{
			//alert("please enter lname");
			document.getElementById("lname").innerHTML="please eneter lname";
		}
		else if(!reg.test(l))
		{
			document.getElementById("lname").innerHTML="enter lname";	
		}
		else
		{
			document.getElementById("lname").innerHTML="";
		}
	}
	function checkemail()
	{
		var e = document.myform.email.value;
		var reg = /^[A-Za-z0-9._-]+@[a-zA-Z]+\.[a-zA-z]{2,4}$/;
			if(e=="")
				{
					//alert("please enter email");
					document.getElementById("email").innerHTML="please neter e-mail";
				}	
			else if(!reg.test(e))
				{
					document.getElementById("email").innerHTML="enter mail";
				}
			else
				{
				document.getElementById("email").innerHTML=" ";
				}
	}	
	
	function checknumber()
	{
		var n = document.myform.mobile.value;
		//var reg = /^[0-9]{10}$/;
		var reg = /^\d{10}$/;
		if(n=="")
			{
			//alert("please enter number");
			document.getElementById("mobile").innerHTML="please enter number";
			}
		else if(!reg.test(n))
			{
			document.getElementById("mobile").innerHTML="number";				
			}
		else
			{
			document.getElementById("mobile").innerHTML="";
			}
	}
	function checkpsw()
	{
		var p = document.myform.psw.value;
		var reg = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{8,15}$/;
		
		if(p=="")
			{
			//alert("please enter password");
			document.getElementById("psw").innerHTML="enter password";
			}
		else if(!reg.test(p))
			{
			document.getElementById("psw").innerHTML="Abcd@1234";
			}
		else
			{
			document.getElementById("psw").innerHTML="";			
			}
	}
	function checkcpsw()
	{
		var p1 = document.myform.cpsw.value;
		var p2 = document.myform.psw.value;
				
		if(p1=="")
			{
			//alert("please enter password");
			document.getElementById("cpsw").innerHTML="enter confirm password";
			}
		else if(p1!=p2)
			{
			document.getElementById("cpsw").innerHTML="psw not match";
			}
		else
			{
			document.getElementById("cpsw").innerHTML="";			
			}
	}
	
</script>
</head>
<body>

<form name="myform" method="get" action="">
<h1 align="center">Student Registration</h1>
<br>
<table align="center">
<tr>
	<td>First Name : </td>
	<td><input type="text" name="fname" onblur="checkfname();"></td>
	<td><span id ="fname" style ="color:red"></span></td>
</tr>
<tr>
	<td>Last Name : </td>
	<td><input type="text" name="lname" onblur="checklname();"></td>
	<td><span id="lname" style ="color:red"></span></td>
</tr>
<tr>
	<td>Email : </td>
	<td><input type="text" name="email" onblur="checkemail();"></td>
	<td><span id ="email" style="color:red"></span></td>
</tr>
<tr>
	<td>Mobile : </td>
	<td><input type="text" name="mobile" onblur="checknumber();"></td>
	<td><span id="mobile" style="color:red"></span></td>
</tr>
<tr>
	<td>Password : </td>
	<td><input type="password" name="psw" onblur="checkpsw();"></td>
	<td><span id="psw" style="color:red"></span></td>
</tr>
<tr>
	<td>Confirm Password : </td>
	<td><input type="password" name="cpsw" onblur="checkcpsw();"></td>
	<td><span id="cpsw" style="color:red"></span></td>
</tr>
<tr>
	<td>Gender : </td>
	<td>
		<input type="radio" name="gender" value="Female">Female
		<input type="radio" name="gender" value="Male">Male
	</td>
</tr>
<tr>
	<td>Address : </td>
	<td><textarea name="address" rows="5" cols="20"></textarea></td>
</tr>
<tr>
	<td>Education Qualification : </td>
	<td><select name="education">
		<option>------Select-------</option>
		<option>10th Pass</option>
		<option>12th Pass</option>
		<option>Graduate</option>
		<option>Post Graduate</option>
		<option>Phd</option>
		</select>
	</td>
</tr>
<tr>
	<td>Hobbies : </td>
	<td>
		<input type="checkbox" name="hobby">Cricket	
	<input type="checkbox" name="hobby">Football
	<input type="checkbox" name="hobby">Swimming
	</td>
</tr>
<tr>
	<td><input  type="submit" value="Register" class="btn btn-danger"></td>
</tr>
</table>
</form>

</body>
</html>