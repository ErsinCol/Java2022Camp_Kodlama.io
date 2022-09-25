package classes;

public class demo_class {

	public static void main(String[] args) {
		CustomerManager customerManager1= new CustomerManager(); // stack-heap-garbageCollector
		CustomerManager customerManager2 = new CustomerManager();
		customerManager1 = customerManager2;
		customerManager1.create();
		customerManager1.read();
		customerManager1.update();
		customerManager1.delete();

	}

}
