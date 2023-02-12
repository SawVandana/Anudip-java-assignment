package datamambers.java;
public class Tmain {

	public static void main(String[] args) {
		Person p=new Person("Anisha",40,"0987456123","Ranchi");
		p.display();
		//Person p=new Person();
		//p.setName("Anisha");
		//p.setAge(20);
		//ro display info
		System.out.println("........Employee........");
		Employee emp=new Employee("Vandana",23,"Bokaro",2125,"Testing Department",450000,"Jharkhand");
		//Employee emp=new Employee("Vandana",23,"WB","7894561231",100,"IT",20000);
		emp.display();
	}
}
