package day9;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;


public class D3streamdemo {
	 

		public static void main(String[] args) {
			
			IntStream.range(1, 10)
					.filter(input -> input % 2 == 0)
					.forEach(System.out::println);
			
			
			// even number
			System.out.println("From Collections");
			List<Integer> list = Arrays.asList(212, 425, 34, 721, 564, 62);
			list.stream()
				.filter(input -> input % 2 == 0)
				.forEach(System.out::println);
			
			
		}
	}


