
public class Employee extends Person{
	private int eid;
	private String dept;
	private long salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int age, String contact,int eid,String dept,long salary,String address) {
		super(name, age, contact,address);
		this.eid=eid;
		this.dept=dept;
		this.salary=salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public void display()
	{
		super.display();
		System.out.println("Eid :"+eid);
		System.out.println("Department :"+dept);
		System.out.println("salary :"+salary);
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", dept=" + dept + ", salary=" + salary + "]";
	}

}
