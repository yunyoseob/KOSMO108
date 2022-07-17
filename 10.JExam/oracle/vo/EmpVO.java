package a.b.c.oracle.vo;

public class EmpVO {

	/*
	�����ȣ		EMPNO		NUMBER
	����̸�		ENAME		VARCHAR2
	�����å		JOB			VARCHAR2
	��������ȣ	MGR			VARCHAR2
	�Ի���		HIREDATE	DATE
	�޿�			SAL			NUMBER
	����			COMM		NUMBER
	�μ���ȣ		DEPTNO		NUMBER
	*/

	// �÷��� --> ������ : �ҹ���
	// ������Ÿ�� NUMBER, VARCHAR2, DATE -> ���δ� ���ڿ��� �Ѵ�. String
	
	// empno : �������, ��Ʈ��,  �������̼� ���̵� 
	private String empno;
	private String ename;
	private String job;
	private String mgr;
	private String hiredate;
	private String sal;
	private String comm;
	private String deptno;
	
	// ��¥ �˻� ���� �߰� 
	private String fromdate;
	private String todate;
	
	// constructor
	public EmpVO() {
		
	}
	
	public EmpVO(	String empno, String ename, 
					String job, String mgr, 
					String hiredate, String sal, 
					String comm, String deptno) {		
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}
	
	// getter 
	public String getEmpno() {
		return empno;
	}
	public String getEname() {
		return ename;
	}
	public String getJob() {
		return job;
	}
	public String getMgr() {
		return mgr;
	}
	public String getHiredate() {
		return hiredate;
	}
	public String getSal() {
		return sal;
	}
	public String getComm() {
		return comm;
	}
	public String getDeptno() {
		return deptno;
	}
	
	// setter
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setMgr(String mgr) {
		this.mgr = mgr;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public void setSal(String sal) {
		this.sal = sal;
	}
	public void setComm(String comm) {
		this.comm = comm;
	}
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

	// ��¥ �˻� ���� getter setter �Լ� �߰� 
	public String getFromdate() {
		return fromdate;
	}

	public String getTodate() {
		return todate;
	}

	public void setFromdate(String fromdate) {
		this.fromdate = fromdate;
	}

	public void setTodate(String todate) {
		this.todate = todate;
	}
}