package a.b.c.prac2.vo;

public class EmpVO_p {
	/*
	 * �����ȣ	EMPNO	NUMBER
	 * ����̸�	ENAME	VARCHAR2
	 * �����å	JOB		VARCHAR2
	 * ��������ȣ MGR		VARCHAR2
	 * �Ի��� 	HIREDATE	DATE
	 * �޿�		SAL		NUMBER
	 * ����		COMM	NUMBER
	 * �μ���ȣ	DEPTNO	NUMBER
	 * */
	
	// �÷��� --> ������ : �ҹ���
	// ������Ÿ�� NUMBER, VARCHAR2, DATE -> ���� �� ���ڿ��� �Ѵ�. String
	
	// empno : �������, ��Ʈ��, �������̼� ���̵�
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
	public EmpVO_p(){
		
	}
	
	public EmpVO_p(String empno, String ename, String job,
			String mgr, String hiredate, String sal,
			String comm, String deptno){
		this.empno=empno;
		this.ename=ename;
		this.mgr=mgr;
		this.hiredate=hiredate;
		this.sal=sal;
		this.comm=comm;
		this.deptno=deptno;
	}
	
	public String getEmpno() {
		return empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getMgr() {
		return mgr;
	}

	public void setMgr(String mgr) {
		this.mgr = mgr;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public String getSal() {
		return sal;
	}
	
	public void setSal(String sal) {
		this.sal = sal;
	}

	public String getComm() {
		return comm;
	}

	public void setComm(String comm) {
		this.comm = comm;
	}

	public String getDeptno() {
		return deptno;
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
