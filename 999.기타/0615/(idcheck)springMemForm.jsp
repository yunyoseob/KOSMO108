<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>스프링 회원가입 폼</title>

<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script type="text/javascript">
	//alert("자바스크립트 블럭 시작 >>> : ")

	$(document).ready(function(){	
		//alert("제이쿼리 블럭 시작 >>> : ")
		// 회원번호 		
		// 이름 
		
		// 아이디 중복체크 시작  ================================================= 		
		$("#midbtn").click(function(){				
			console.log("idCheck >>> : ");
			
			let midVal = $("#mid").val();
			if (midVal == '') {
				alert("중복 체크할 아이디를 입력하세요 >>> : ");
				$("#mid").focus();
				return false;
			}
		});
		
		/*
		---------------------------
		아이디 중복체크 Ajax 비동기 방식
		---------------------------
		$(document).on("click", "#midbtn", function(){
			alert("midbtn >>> : ");

			let idCheckURL = "memIdCheck.h";
			let reqType = "POST";
			let dataParam = { mid: $("#mid").val(), };
			
			$.ajax({
				url: idCheckURL,
				type: reqType,								
				data: dataParam,	            
				success: whenSuccess,
				error: whenError
			});
			
			function whenSuccess(resData){	
				if ("ID_YES" == resData){
					alert("아이디 사용가능 : ID_YES.");														
					$("#mid").css('background-color','yellow');	
					$("#mid").attr("readonly", true);
					$("#mpw").focus();	
				}else if ("ID_NO" == resData){
					alert("이미 아이디 사용중 : ID_NO.");
					$("#mid").val('');
					$("#mid").focus();
				};				
			}
			function whenError(e){
				alert("e >>> : " + e.responseText);
			}
		});
		*/
		
		// 아이디 중복체크 Ajax 동기 방식
		$(document).on("click", "#midbtn", function(){
			alert("midbtn >>> : ");
			syncIdCheckData();
		});			
		
		async function syncIdCheckData(){			
			
			let idCheckData = '';
			console.log('start >>> : ');
			
			var vv = $("#mid").val();
			alert("vv >>> : " + vv);
			
			idCheckData = await ajaxIdCheckData(vv);						
			alert("리턴된 데이터 >>> : " + idCheckData);
			
			if ("ID_YES" == idCheckData){
				alert("아이디 사용가능 : ID_YES.");																		
				$("#mid").attr("readonly", true);				
				$("#mid").css('background-color','yellow');						
				$("#mpw").focus();				
			}else if ("ID_NO" == idCheckData){
				alert("이미 아이디 사용중 : ID_NO.");
				$("#mid").val('');
				$("#mid").focus();
			};				
		}
		
		function ajaxIdCheckData(myval){
			alert("myval >>> : " + myval);
			
			let idCheckURL = "memIdCheck.h";
			let reqType = "POST";
			let dataParam = { mid: myval, };
			
			return $.ajax({							
			    url: idCheckURL
			   ,type: reqType
			   ,data: dataParam			   
			});
		}	
		// 아이디 중복체크 끝 =================================================
			
		// 비밀번호 체크 
		$("#pwCheck").click(function(){
			console.log(" pwCheck 함수 진입");
			var pw = $("#mpw").val();
			var pw_r = $("#mpw_r").val();
			// var pw = document.getElementById("mpw").value;
			// var pw_r = document.getElementById("mpw_r").value;			
			// alert(pw + " : " + pw_r);
			if(pw == pw_r) {
				alert("비밀번호가 같습니다.");
				 pw_r.val('');
				// document.memForm.mpw_r.value = "";
				$("#mgender").focus();						
				return true;
			} else {
				alert("비밀번호가 다릅니다.");
				pw.val('');
				pw_r.val('');
				//document.memForm.mpw.value = "";
				//document.memForm.mpw_r.value = "";
				//document.memForm.mpw.focus();
				pw.focus();			
				
				return false;
			}
		});
		
		// 성별
		
		// 생년월일
		$("#mbirth").on("input", function(){
			var m = $("#mbirth");
			if (m.val().length > m.maxlength){
				m.value = m.value.slice(0, m.maxlength);
			}
		});
       
		// 월 
        $("#mbirth1").append("<option value=''>월--- </option>");
        for(var i = 1; i <= 12; i++){
        	if (i < 10){ i = '0'+i;}
            $("#mbirth1").append("<option value='"+ i +"'>"+ i + "</option>");
        }
        // 일 
        $("#mbirth2").append("<option value=''>일 ---</option>");
        for(var i = 1; i <= 31; i++){
        	if (i < 10){ i = '0'+i;}
            $("#mbirth2").append("<option value='"+ i +"'>"+ i + "</option>");
        }

		
		// 핸드폰		
		// 전화번호
		
		// 이메일 
		$('#memail2').change(function(){	
		$("#memail2 option:selected").each(function () {
			if($(this).val()== '1'){ //직접입력일 경우 
					var aa = $("#memail1").val();
					//alert("aa >>> : " + aa);
					$("#memail1").val(''); //값 초기화 
					$("#memail1").attr("readonly",false); //활성화 				
			}else{ //직접입력이 아닐경우 
					$("#memail1").val($(this).text()); //선택값 입력 
					$("#memail1").attr("readonly",true); //비활성화 
			}}); 
		}); 	
		
		// 우편번호	
		$("#zonecode").click(function(){
			console.log("zonecode >>> : ");
			new daum.Postcode({
				oncomplete: function(data) {
				    $("#mzonecode").val(data.zonecode); //5자리 새우편번호 사용
				    $("#mroadaddress").val(data.roadAddress); //도로명 주소
				    $("#mjibunaddress").val(data.jibunAddress); //지번주소			
				}
			}).open();
		});
		
		// 취미		
		// 소개글 		
		// 사진 
		
		// 폼태그 데이터 JSP 보내기 
		$("#btn").click(function(){
			//alert("btn click() 함수 진입 >>> : ");
			console.log("btn click() 함수 진입 >>> : ");
			
			/* 
			form 태그에서 서블릿으로 전송되는 데이터 
			콘솔에서 확인하기, alert으로 확인하기				
		*/
		
		//############################################# START
		/*
			자바스크립트 버전 
			
			id 값 : 
				var v1 = document.getElementById('id_name').value;
			name 값 : 
				var v2 = document.form_name.input_name.value;
			class 값 : 
				var v3 = document.getElementsByName('mgender');
			
		*/		
		/*
		1. console.log() : 함수는 웹 브라우저 콘솔에 프린트 하는 함수 이다. 
		                    System.out.println() 과 같다.
		2. document : <html></html>
		3. memForm : form 태그의 name 속성의 값 form name="memForm"
		4. mnum : memForm 태그의 intpu name="mnum" 속성
		5. value : mnum 의 값
		
		<form name="memForm" id="memForm">
			<input type="text" name="mnum" id="mnum" readonly/>
		</from>
		*/
			console.log("mnum >>> : " + document.memForm.mnum.value);			
			console.log("mname >>> : " + document.memForm.mname.value);
			console.log("mid >>> : " + document.memForm.mid.value);
			console.log("mpw >>> : " + document.memForm.mpw.value);
			console.log("mpw_r >>> : " + document.memForm.mpw_r.value);
			
			// 성별
			var mgender_check = document.getElementsByName('mgender');
			for (var i=0; i < mgender_check.length; i++){
				if(mgender_check[i].checked == true){
					console.log("mgender_check["+i+"].value >>> : " + mgender_check[i].value);
				}
			}
			
			// 생일
			console.log("mbirth >>> : " + document.memForm.mbirth.value);
			console.log("mbirth1 >>> : " + document.memForm.mbirth1.value);
			console.log("mbirth2 >>> : " + document.memForm.mbirth2.value);
			
			// 핸드폰
			console.log("mhp >>> : " + document.memForm.mhp.value);
			console.log("mhp1 >>> : " + document.memForm.mhp1.value);
			console.log("mhp2 >>> : " + document.memForm.mhp2.value);
			
			// 전화번호
			console.log("mtel >>> : " + document.memForm.mtel.value);
			console.log("mte1l >>> : " + document.memForm.mtel1.value);
			console.log("mtel2 >>> : " + document.memForm.mtel2.value);
			
			// 이메일
			console.log("memail >>> : " + document.memForm.memail.value);
			console.log("memail1 >>> : " + document.memForm.memail1.value);
		
			// 주소
			console.log("mzonecode >>> : " + document.memForm.mzonecode.value);
			console.log("mroadaddress >>> : " + document.memForm.mroadaddress.value);
			console.log("mroadaddressdetail >>> : " + document.memForm.mroadaddressdetail.value);
			console.log("mjibunaddress >>> : " + document.memForm.mjibunaddress.value);
			
			// 취미			
			var mhobby_check = document.getElementsByName('mhobby');
			for (var i=0; i < mhobby_check.length; i++){
				if(mhobby_check[i].checked == true){
					console.log("mhobby_check["+i+"].value >>> : " + mhobby_check[i].value);
				}
			}
			
			// 소개글
			console.log("minfo >>> : " + document.memForm.minfo.value);			
			// 사진
			console.log("mphoto >>> : " + document.memForm.mphoto.value);
			//############################################# END
			
			
			//############################################# START
			/*
				jQuery 버전
				
				id 값 : 
					var v1 = $('#id_name').val();
			
				name 값 : 
					var v2_0 = $('input[name=input_name]').val();
					var v2_1 = $('input:radio[name=mgender]:checked').val();
					var v2_2 = $('select[name=mtel]').val();
					var v2_3 = $('input:checkbox[name=mhobby]');
					var v2_4 = $('textarea[name=minfo]').val());	
			
				class 값 : 
					var v3 = $('.class_name').val();
				
			*/							
			console.log("mnum >>> : " + $('#mnum').val());
			console.log("mname >>> : " + $('input[name=mname]').val());
			console.log("mid >>> : " + $('input[name=mid]').val());
			console.log("mpw >>> : " + $('input[name=mpw]').val());
			console.log("mpw_r >>> : " + $('input[name=mpw_r]').val());
			
			// 성별
			var mgender_check = $('input:radio[name=mgender]:checked').val();
			console.log("mgender_check.value >>> : " + mgender_check);
			
			// 생일
			console.log("mbirth >>> : " + $('input[name=mbirth]').val());
			console.log("mbirth1 >>> : " + $('select[name=mbirth1]').val());
			console.log("mbirth2 >>> : " + $('select[name=mbirth2]').val());
			
			// 핸드폰
			console.log("mhp >>> : " + $('select[name=mhp]').val());
			console.log("mhp1 >>> : " + $('input[name=mhp1]').val());
			console.log("mhp2 >>> : " + $('input[name=mhp2]').val());
			
			// 전화번호
			console.log("mtel >>> : " + $('select[name=mtel]').val());
			console.log("mte1l >>> : " + $('input[name=mtel1]').val());
			console.log("mtel2 >>> : " + $('input[name=mtel2]').val());
			
			// 이메일
			console.log("memail >>> : " + $('input[name=memail]').val());
			console.log("memail1 >>> : " + $('input[name=memail1]').val());
		
			// 주소
			console.log("mzonecode >>> : " + $('input[name=mzonecode]').val());
			console.log("mroadaddress >>> : " + $('input[name=mroadaddress]').val());
			console.log("mroadaddressdetail >>> : " + $('input[name=mroadaddressdetail]').val());
			console.log("mjibunaddress >>> : " + $('input[name=mjibunaddress]').val());
			
			// 취미			
			var mhobby_check = $('input:checkbox[name=mhobby]').each(function(){
				if (this.checked == true){
					console.log("mhobby_check.value >>> : " + this.value);
				}
			});
			
			// 소개글
			console.log("minfo >>> : " + $('textarea[name=minfo]').val());			
			// 사진
			console.log("mphoto >>> : " + $('input[name=mphoto]').val());			
			//############################################# END
			
			$("#memForm")
			.attr({
					"action":"memInsert.h",
				    "method":"POST",
				    "enctype":"multipart/form-data"
			       })
			.submit();	
		});
	});
</script>	
</head>
<body>
<h3 align="center">회원 가입</h3>
<hr>
<form name="memForm" id="memForm">
<table border="1" align="center">
<tr>
	<td colspan="2" align="center">					
		<font size="4" style="color:blue;">KOSMO 93기</font> 
		<img src="/springHbe/img/img_mandu/ase.gif" width="25" height="25" alt="image">
	</td>
</tr>
<tr>
	<td>회원번호</td>
	<td><input type="text" name="mnum" id="mnum" readonly/></td>
 </tr>
<tr>
	<td>이름</td>
	<td><input type="text" name="mname" id="mname"/></td>
</tr>
<div id="middiv">
<tr>
	<td>아이디</td>
	<td>
		<!-- 
		<input type="text" name="mid" id="mid" placeholder="아이디 체크" style="width:100px" />
		 -->		
		<input type="text" name="mid" id="mid" placeholder="아이디 체크" />
		<input type="button" name="midbtn" id="midbtn" value="아이디중복확인"  />
	</td>
</tr>
</div>
<tr>
	<td>패스워드</td>
	<td>
		<!-- 
			<input type="text" name="mpw" id="mpw" style="width:100px"/><br/>		
			<input type="text" id="mpw_r" name="mpw_r" placeholder="비밀번호확인" style="width:100px" />		
		 -->		
		<input type="text" name="mpw" id="mpw" /><br/>	
		<input type="text" id="mpw_r" name="mpw_r" placeholder="비밀번호확인" />
		<input type="button" value="비밀번호확인" id="pwCheck"/><br/>
	</td>
</tr>
<tr>
	<td>성별</td>
	<td> 
		<input type="radio" name="mgender" id="mgender" value="01" checked /> 여자
      	<input type="radio" name="mgender" id="mgender" value="02" /> 남자
    </td>
</tr>
<tr>
	<td>생년월일</td>
	<td>		
		<input type="text" name="mbirth" id=mbirth 
		       placeholder="년(4자)" maxlength="4" style="width:50px"/>
		<select name="mbirth1" id="mbirth1"></select>
        <select name="mbirth2" id="mbirth2"></select>
	</td>
</tr>
<tr>
	<td>핸드폰</td>
	<td>
		<select name="mhp" id="mhp">
        	<option value="010">010</option>
        	<option value="011">011</option>
        	<option value="016">016</option>
        	<option value="017">017</option>		        	
         </select>
         - <input type="text" name="mhp1" id="mhp1" size="2" maxlength="4" />
         - <input type="text" name="mhp2" id="mhp2" size="2" maxlength="4" />
	</td>
</tr>
<tr>
	<td>전화번호</td>
	<td>
		<select name="mtel" id="mtel">
        	<option value="02">02</option>
        	<option value="031">031</option>
        	<option value="041">041</option>
        	<option value="051">051</option>
        	<option value="061">061</option>	        			       
         </select>
		- <input type="text" name="mtel1" id="mtel1" size="2" maxlength="4" />
		- <input type="text" name="mtel2" id="mtel2" size="2" maxlength="4" />
	</td>
</tr>
<tr>
	<td>이메일</td>
	<td>		
		<input type="text" name="memail"  id="memail" style="width:100px"/>
		@ <input type="text" name="memail1" id="memail1" style="width:100px" placeholder="직접입력" />
		<select name="memail2" id="memail2">
        	 <option value="1" selected>직접입력</option>
       		 <option value="naver.com">naver.com</option>	       	   
      		 <option value="gmail.com">gmail.com</option>
      		 <option value="daum.net">daum.net</option>	       	   
         </select>
	</td>
</tr>
<tr>
 	<td>주소</td>
 	<td>
 		<input type="text" name="mzonecode" id="mzonecode" placeholder="우편번호" style="width:50px" maxlength="6" >
 		<input type="button" name="zonecode" id="zonecode" value="우편번호 찾기"><br>	 	
 		<input type="text" name="mroadaddress" id="mroadaddress" placeholder="도로명주소" style="width:250px"><br>	 	
 		<input type="text" name="mroadaddressdetail" id="mroadaddressdetail" placeholder="도로명주소 상세주소" style="width:250px"><br>	 	
 		<input type="text" name="mjibunaddress" id="mjibunaddress" placeholder="지번주소" style="width:250px">
 	</td>
</tr>	 
<tr>
	<td>취미</td>
	<td> 
		<input type="checkbox" name="mhobby" value="01" />알고리즘		      
        <input type="checkbox" name="mhobby" value="02" />코딩
        <input type="checkbox" name="mhobby" value="03" />분석설계<br>
        <input type="checkbox" name="mhobby" value="04" />데이터베이스
        <input type="checkbox" name="mhobby" value="05" />스크립트
    </td>
</tr>	 
<tr>
	<td>소개글</td>
	<td>
		<textarea name="minfo" id="minfo" rows="5" cols="50">내 소개글					
		</textarea>
	</td>
 </tr>
 <tr>
	<td>사진</td>
	<td> 
		<input type="file" name="mphoto"  /><br>
    </td>
</tr>
<tr>
	<td colspan="2"> 			
		<button type="button" id="btn">보내기</button>
		<button type="reset">다시 </button>	
	</td>				
</tr>
</table>				 		        		     
</form>	
</body>
</html>