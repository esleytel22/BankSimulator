

import java.util.concurrent.Semaphore;


public class Teller extends Thread {

		int numberOfTeller;
		int counter;

		public Teller(int numberOfTeller) {
			this.numberOfTeller = numberOfTeller;
			this.counter = 0;
		}	

		Semaphore tellerSemaphore = new Semaphore(numberOfTeller, true);

		public void tellerSimulator() throws InterruptedException {
			while (!Customer.customerQueue.isEmpty()) {
				if (tellerSemaphore.availablePermits() == 0) {
					Thread.sleep(100);
					tellerSemaphore.release();
				} else {
					tellerSemaphore.acquire();
					System.out.println(Customer.customerQueue.poll() + " starts being served");
				}
			}
		}

		public void run() {
			try {
				tellerSimulator();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}