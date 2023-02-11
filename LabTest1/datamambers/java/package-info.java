package datamambers.java;
//Creating Employee class  
class EmployeeDetails {  
  //Creating properties of Employee class  
int emp_id, salary;  
String name, address, age, mobilenumber;  

//Getter and setters for getting and setting properties  
public int getEmp_id() {  
  return emp_id;  
}  
public void setEmp_id(int emp_id) {  
  this.emp_id = emp_id;  
}  
public int getSalary() {  
  return salary;  
}  
public void setSalary(int salary) {  
  this.salary = salary;  
}  
public String getName() {  
  return name;  
}  
public void setName(String name) {  
  this.name = name;  
}  
public String getAddress() {  
  return address;  
}  
public void setAddress(String address) {  
  this.address = address;  
}  
public String getAge() {  
  return age;  
}  
public void setAge(String department) {  
  this.age = department;  
}  
public String getMobilenumber() {  
  return mobilenumber;  
}  
public void setMobilenumber(String mobilenumber) {  
  this.mobilenumber = mobilenumber;  
}  

//Overriding toString() method  
@Override  
public String toString() {  
  return "Employee [emp_id = " + emp_id + ", salary = " + salary + ", name = " + name + ", address = " + address  
          + ", age = " + age + ", mobilenumber = " + mobilenumber + "]";  
  }  
    
}  