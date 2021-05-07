import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
    Scanner scanner = new Scanner (System.in);
		
	System.out.println("Welcome to the employee program...");
		
		String transactions = "1 : Software Developer Transactions \n"
				     +"2 : Manager Transactions\n"
		                     +"q : Exit\n";
	
	System.out.println("************************************");
	
	System.out.println(transactions);
	 
	System.out.println("*************************************");
	
	
		
	   

while (true) {
		
		System.out.println("Please enter the transaction number : ");
		String operation = scanner.nextLine();
		
		
	if (operation.equals ("q")) {
			
            System.out.println("Exiting the program....");
			
			break;
			
			
		}
		
	else if (operation.equals("1")) {
			
			Programmer programmer = new Programmer("Gizem","KAYA",1,"JAVA - C++ ");
			
			String Programmer_Transactions = "1 : Programmer Informations\n" 
					                +"2 : Format\n"
					                +"q : Exit \n";
			System.out.println("************************************");
			
			System.out.println(Programmer_Transactions);
			 
			System.out.println("*************************************");
			
			while (true) {
				
				System.out.println("Please enter the programmer transaction number : ");
				String p_operation = scanner.nextLine();
				
				if (p_operation.equals("q")) {
					
					System.out.println("Exiting the programmer transaction....");
					
					break;
					
				}
				
				else if (p_operation.equals("1")) {
					
					programmer.show_information();
				}
				
				else if (p_operation.equals("2")) {
					
					System.out.println("Enter the operating system: ");
					String operating_system = scanner.nextLine();
					
					programmer.format(operating_system);
				}
				
				else {
					
					System.out.println("Invalid transaction!!");
					
				}
				
			}
			
    }
		
	else if (operation.equals("2")) {
			
			Manager manager = new Manager ("Serhat","AYYILDIZ",2,5);
			
			String Manager_Transactions =    "1 : Manager Informations\n" 
                                            +"2 : Raise\n"
                                            +"q : Exit \n";
			
            System.out.println("************************************");

            System.out.println(Manager_Transactions);

            System.out.println("*************************************");
            

            while (true) {

              System.out.println("Please enter the manager transaction number : ");
              String m_operation = scanner.nextLine();

              if (m_operation.equals("q")) {

              System.out.println("Exiting the program....");

              break;

              }

              else if (m_operation.equals("1")) {
            	  
                 manager.show_information();
              }

              else if (m_operation.equals("2")) {
            	  
            	  System.out.println("Enter the raise amount : ");
            	  int raise_amount = scanner.nextInt();
            	  scanner.nextLine();

                 manager.raise(raise_amount);
              }

             else {

             System.out.println("Invalid transaction!!");

             }

            }
	}
		
	else {
			
	System.out.println("Invalid transaction!!");
			
	}
		
}
}
}



