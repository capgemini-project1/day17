package day9;
import java.util.Arrays;
import java.util.List;
public class D2streamdemo {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(200, 232,424, 121, 12, 36);
		
	
		int max = list.stream()
					.max((p1, p2) -> p1.compareTo(p2))
					.get();
		System.out.println(max);
		
		
		int min = list.stream()
						.min((p1, p2) -> p1.compareTo(p2))
						.get();
		System.out.println(min);
		
	}
}
