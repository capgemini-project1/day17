package labAssignment8;

	import java.util.Date;
	import java.util.concurrent.Executors;
	import java.util.concurrent.ScheduledExecutorService;
	import java.util.concurrent.TimeUnit;

public class Ex1 {

		public static void main(String[] args) {
			ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
			service.scheduleAtFixedRate(new Test(), 0, 10, TimeUnit.SECONDS);
		}

	}

	class Test implements Runnable{
		@Override
		public void run() {
			System.out.println(new Date());
		}
	}


