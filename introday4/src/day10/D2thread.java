package day10;

public class D2thread {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
	
		Runnable r1 = () -> System.out.println("Hello WOrld");
		Thread.currentThread().setName("NEW thread");
		System.out.println(Thread.currentThread().getName());
		
		Thread t = new Thread(r1);
	
		t.start();
		
		
		System.out.println("Helloo!!");
		System.out.println(Thread.currentThread().getName());
	
		
}
}
