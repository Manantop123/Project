package Thread;

public class threadbasic extends Thread {
	

	public void run() {
			System.out.println("i am manan");
			}
	public static void main(String[] args) {
		threadbasic t1 = new threadbasic();
		t1.start();
	}
}
