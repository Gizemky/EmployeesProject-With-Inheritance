
public class Employee {                                             //Super class

	private String name;
	private String last_name;
	private int id;
	


public Employee (String name, String last_name,int id) {
	
	this.name = name;
	this.last_name = last_name;                                 //We created constructor

	this.id = id;
}


public void show_information() {
	
	System.out.println("Employee Information");
	System.out.println("Employee Name : "+ name);
	System.out.println("Employee Last Name : "+ last_name);             
	System.out.println("Employee Id : "+ id);
}


public String getname() {
	return name;
}
public void setname(String name) {
	this.name = name;
}

public String getlast_name() {
	return last_name;
}
public void setlast_name(String last_name) {
	this.last_name = last_name;
}

public int getid() {
	return id;
}
public void setid(int id) {
	this.id = id;
}

}



