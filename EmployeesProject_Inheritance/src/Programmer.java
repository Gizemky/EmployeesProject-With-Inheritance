
public class Programmer extends Employee {

private String skills;                       

public Programmer(String name, String last_name, int id, String skills) {

  super(name, last_name, id);
  
  this.skills = skills;
		
}

public String getskills() {
	return skills;
}
public void setskills(String skills) {
	this.skills = skills;
}

public void format(String OS) {                    //OS= Operating System
	      
	
	System.out.println(getname() + " is " + " loading " +OS );                                      
}


public void show_information() {
	
	super.show_information();
	
	System.out.println("Employee Skills : " +skills) ;
	
}

}
