
public class Manager extends Employee {

	
	private int e_s_a_p;               //employee subordinate to the authorized person
	
	public Manager(String name, String last_name, int id, int e_s_a_p ) {        //constructor tanýmladýk.
		super(name, last_name, id);                                              // super class'tan miras özelliði ile bazý bilgileri aldýk.
		
		this.e_s_a_p = e_s_a_p;                           //yönetici altýnda kaç çalýþanýn olduðunu belirten deðiþken.
		
		
	}


public int gete_s_a_p() {
	return e_s_a_p;
}
public void sete_s_a_p(int e_s_a_p) {
	this.e_s_a_p = e_s_a_p;
}



public void show_information() {
	
	super.show_information();                                               //super class'ta var olan bilgileri ve sonradan eklediðimiz deðiþkenin bilgilerini göstermek için kullandýðýmýz metod.
	
	System.out.println("Number of employees reporting to the authorized person : "+ e_s_a_p);
}

public void raise (int fee) {
	
	System.out.println (getname () + " increased the salary of the employees by " + fee + "TL");  //yönetici için zam bilgisi tanýmladýðýmýz metod.
}









}
