import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Assignment2 {

	public static void main(String args[]) {
		// Driver driver = new Driver(90, 23);
		Scanner scan = new Scanner(System.in);
		System.out.print("Mean inter-arrival time: " );
		int avgInterarrivalTime = scan.nextInt();
   	 
		System.out.print("Mean service time: ");
		int avgServiceTime = scan.nextInt();
    	
		System.out.print("Number of tellers: ");
		int numTeller = scan.nextInt();
    	
		System.out.print("Length of simulation: ");
		int lenSim = scan.nextInt();
     	
		Random_Int_Mean g = new Random_Int_Mean();
		Customer customer = new Customer(10);
		Teller teller = new Teller(3);
		//Thread tellerThread = new Thread(teller);
	//	Thread customerThread = new Thread(customer);
		teller.start();
		
		while(true)
        {
            try { 
                Thread.sleep((g.random_int(avgInterarrivalTime / 10)) * 10); // Sleep until next person gets in
            }catch (InterruptedException e){}
            
            
            
           
            
        	System.out.println((g.random_int(avgInterarrivalTime / 10)) * 10 + "  ave");
        	System.out.println((g.random_int(avgServiceTime / 10))*10 + "  serve");
            
           
        	customer.start();
          
            	
            	
            	
            	
            	
            
            }
            
        
		
		
		
		

//		try {
//			customer.join();
//			teller.join();
//		} catch (InterruptedException e) {
//			// TODO: handle exception
//		}
//
	}
}