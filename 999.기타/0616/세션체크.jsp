<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, 
									   minimum-scale=1.0, user-scalable=no, target-densityDpi=medium-dpi">
		<title>�Խ��� �۸��</title>
<%
			HttpSession hs = request.getSession(true);
			String i_no = (String)hs.getAttribute("i_no");
			boolean sessionBool = false;
			sessionBool = i_no==null;
			if(sessionBool){
%>
		<script type="text/javascript">
			alert("������ ����Ǿ����ϴ�. �ٽ� �α��� ���ּ���");
			location.href="/index.jsp";
		</script>
<%
	}else{
		
		// ����¡�� ������
		String total = (String)request.getAttribute("total");
		String curPage = (String)request.getAttribute("curPage");	
		
		// ������ȸ �� ������ ������ ������
		BmBoardVO searchVO = (BmBoardVO)request.getAttribute("bbvo");
		String startDate = searchVO.getStartDate();
		String endDate = searchVO.getEndDate();
		String bm_category = searchVO.getBm_category();
		String searchFilter = searchVO.getSearchFilter();
		String keyword = searchVO.getKeyword();
		
		List<NmNoticeVO> nList = (List<NmNoticeVO>)request.getAttribute("nList");
		NmNoticeVO nnvo = null;
		
		EmCommonVO ecvo = (EmCommonVO)request.getAttribute("ecvo");
		
%>