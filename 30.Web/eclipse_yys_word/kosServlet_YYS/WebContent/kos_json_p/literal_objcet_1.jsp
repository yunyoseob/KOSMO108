<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- jQuery CDN 불러오기  -->
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		document.body.mydata={title:'리터럴 객체'};
		alert(document.body.mydata.title);
		var ju={
				"name":"전건희",
				"age":27,
				"gender":"남자",
				"visual":"멋짐"
		};
		
		alert("ju >>> : "+ju);
		
		$("#div_1_btn").click(function(){
			document.getElementById("div_1").innerHTML=ju.name;
			document.getElementById("div_1").innerHTML=ju.age;
			document.getElementById("div_1").innerHTML=ju.gender;
			document.getElementById("div_1").innerHTML=ju.visual;
		});
		
		$("#div_2_btn").on("click", function(){
			const aa_1=document.getElementById("div_2");
			aa_1.innerHTML+=ju.name;
			const aa_2=document.getElementById("div_2");
			aa_2.innerHTML+=ju.gender;
			const aa_3=document.getElementById("div_2");
			aa_3.innerHTML+=ju.gender;
			const aa_4=document.getElementById("div_2");
			aa_4.innerHTML+=ju.visual;
		});
		
		$(document).on("click", "#div_3_btn", function(){
			var t_ju=$("<table style='border:5px solid red' />");
			var row=$("<tr style='border:5px solid red' />").append(
				$("<td />").text(ju.name),
				$("<td />").text(ju.age),
				$("<td />").text(ju.gender),
				$("<td />").text(ju.visual)
			);
			$('#div_3').append(t_ju).append(row);
		});
	});
</script>
</head>
<body>
<div id="div_1"></div>
<button id="div_1_btn">div_1</button>

<div id="div_2"></div>
<button id="div_2_btn">div_2</button>

<div id="div_3"></div>
<button id="div_3_btn">div_3</button>
</body>
</html>