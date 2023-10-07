import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
	public static void main(String[] args) {
		List<Integer> mapExample1 = Arrays.asList(1,2,3,4,5,6,7,8);
		List<Integer> mapExample2 = Arrays.asList(1,21,3,14,53);
		String[] strings = {"java","streams","kostal","map","filter","reduce"}; 
		
		//map example for multipling all numbers with 2
//		mapExample1.stream().map(x -> x*2).forEach(x -> System.out.print(x+" "));
		List<Integer> mapExampleList = mapExample1.stream().map(x -> x*2).collect(Collectors.toList());
		
		//filter example: filter even numbers
//		mapExample1.stream().filter(x -> x%2==0).forEach(x -> System.out.print(x+" "));
		
		//reduce example: multiply all numbers of list
		int res = mapExample1.stream().reduce(1,(ans,x) -> ans*x);
		
		//sort the strings according to their last char
		Stream.of(strings).sorted((str1,str2) -> Character.compare(str1.charAt(str1.length()-1),str2.charAt(str2.length()-1))).forEach(System.out::println);		
	}
}
