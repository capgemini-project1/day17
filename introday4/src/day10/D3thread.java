package day10;

public class D3thread {
	public static void main(String[] args) throws Exception {
		Runnable r = () -> {
			try {
				Thread.currentThread().setName("New thread");
				Thread.sleep(20000);
				System.out.println(Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		Thread t = new Thread(r);
		t.start();
		System.out.println(Thread.currentThread().getName());
	}
}
