package a.b.c.prac1;

public class StringBuffer_p {
	
	public static String getBoaradSelectAllQuery() {
	StringBuffer sb=new StringBuffer();
	System.out.println("\n start sb >>> : "+sb.hashCode());
	
	sb.append(" SELECT 								\n");
	sb.append("      A.BNUM 		BNUM 			\n");
	sb.append("		,A.BSUBJECT  	BSUBJECT 		\n");
	sb.append("		,A.BWRITER  	BWRITER 		\n");
    sb.append("		,A.BPW  		BPW   			\n");	    	    	    
    sb.append("		,A.BMEMO  		BMEMO			\n");
    sb.append("		,A.BPHOTO  		BPHOTO			\n");	 
    sb.append("		,A.DELETEYN  	DELETEYN		\n");	
    sb.append("		,TO_CHAR(A.INSERTDATE, 'YYYY-MM-DD')  INSERTDATE	\n");
    sb.append("		,TO_CHAR(A.UPDATEDATE, 'YYYY-MM-DD')  UPDATEDATE	\n");	   
    sb.append("	FROM 								\n");
    sb.append("		 MVC_BOARD A 					\n");
    sb.append("	WHERE A.DELETEYN = 'Y'				\n");
    sb.append("	ORDER BY 1 DESC  					\n");
    
    System.out.println("\n end sb >>> : "+sb.hashCode());
    // append�� ������ �Һ��� ������ ������ ����̴�.
    // String.concat(String)�� ���, 
    // VELOG + _POSTING�� �ϸ�
    // VELOG �ּ� �ϳ�, _POSTING �ּ� �ϳ�
    // VELOG_POSTING �ϳ� �ּҰ� �����.
    // StringBuffer Ŭ������ append �޼��带 ����ϸ�,
    // �ش� �ּҸ� �����ϸ鼭 ������ �߰� �� �� �ִ�.
    return sb.toString();	
    // toString() �� ����ϴ� ����
    // String Ŭ������ String Buffer Ŭ������ �ٸ��� ������
    // �� ��ȯ�� ������־�� �Ѵ�.
}	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sqlQuery=StringBuffer_p.getBoaradSelectAllQuery();
		System.out.println("sqlQuery \n "+sqlQuery);
	}
}
