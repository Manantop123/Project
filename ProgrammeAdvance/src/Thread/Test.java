package Thread;

public class Test implements Runnable {
	@Override 
	public void run() {
		System.out.println("i am manan");
	}
	public static void main(String[] args) {
		Test t1 = new Test();
		Thread th = new Thread(t1);
		th.start();
		
	}	
}