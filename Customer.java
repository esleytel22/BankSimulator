

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;




	public class Customer extends Thread {

		public static BlockingQueue<Integer> customerQueue = new LinkedBlockingQueue<Integer>();

		int numberOfCustomer;
		int countNumberOfCustomer;

		public Customer(int numberOfCustomer) {
			this.numberOfCustomer = numberOfCustomer;
			this.countNumberOfCustomer = 0;
		}

		public void customerSimulator() throws InterruptedException {
			while (countNumberOfCustomer <= numberOfCustomer) {

				customerQueue.add(countNumberOfCustomer);
				System.out.println("Customer: " + countNumberOfCustomer + " Arrives in Line");
				Thread.sleep(100);
				countNumberOfCustomer++;
			}
		}

		public void run() {
			try {
				customerSimulator();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


