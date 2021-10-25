package assignment;

public class ThreadDemo extends Thread {
	MultiplicationTable table;

	ThreadDemo(MultiplicationTable table) {
		this.table = table;
	}

	@Override
	public void run() {
		// System.out.println("Inside thread method");
		// System.out.println("Number of active thread: " +Thread.activeCount());
		System.out.println("Current Thread :" + Thread.currentThread());
		table.printTable();
	}

	public static void main(String[] args) {
		MultiplicationTable table = new MultiplicationTable();
		// System.out.println("No of active threads: " +Thread.activeCount());
		System.out.println("Current Thread :" + Thread.currentThread());
		ThreadDemo t1 = new ThreadDemo(table);
		t1.start();
		for (int i = 2; i <= 40; i = i + 2) {
			System.out.println("Even number : " + i);
		}
	}

}
