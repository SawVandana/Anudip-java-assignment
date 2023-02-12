
public class Person {
//instance var
	private String name;
	  private int age;
	  private String contact;
	  private String address;
	  //parameterized constructor
	  public Person(String name, int age, String contact,String address) {
		super();
		this.name = name;
		this.age = age;
		this.contact = contact;
		this.address=address;
	}
	  //default constructor
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	//getter,setter methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Address:"+address);
		System.out.println("Contact:"+contact);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", contact=" + contact + "]";
	}
}
