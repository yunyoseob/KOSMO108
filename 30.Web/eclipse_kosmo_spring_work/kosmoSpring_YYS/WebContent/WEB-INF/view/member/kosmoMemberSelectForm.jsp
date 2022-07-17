<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/kosmoSpring_YYS/calendar_datepicker/jquery-ui-1.12.1/jquery-ui.min.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="/kosmoSpring_YYS/calendar_datepicker/jquery-ui-1.12.1/jquery-ui.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		alert("jQuery ready~~");
		$("#search_btn").click(function(){
			alert("검색 버튼 클릭 전체조회 조건검색 컨트롤러로 이동");
			$("#kosmoSearchForm").attr({
				"method":"GET",
				"action":"kosmoMemberSelect.yys",
				"enctype":"application/x-www-form-urlencoded"
			}).submit();
		});
	});
</script>
</head>
<body>
<form name="kosmoSerachForm" id="kosmoSearchForm">
	조회할 회원의 회원번호 : <input type="text" id="kmnum" name="kmnum" placeholder="검색어 입력"><br>
	<input type="button" id="search_btn" name="search_btn" value="검색">
	<input type="reset" id="reset_btn" name="reset_btn" value="리셋"><br> 
</form>
</body>
</html>