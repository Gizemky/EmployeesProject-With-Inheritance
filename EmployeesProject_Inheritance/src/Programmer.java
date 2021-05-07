
public class Programmer extends Employee {

private String skills;                       // Yaz�l�mc� i�in yeteneklerini g�steren bir de�i�ken tan�mlad�k.

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
	      
	
	System.out.println(getname() + " is " + " loading " +OS );       //yaz�l�mya format y�kleme   metodu tan�mlad�k.                                
}


public void show_information() {
	
	super.show_information();
	
	System.out.println("Employee Skills : " +skills) ;
	
}

}
