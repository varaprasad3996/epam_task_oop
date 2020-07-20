import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterGivenListOfStrings {
	public static void main(String[] args) {
		List<String> li = Arrays.asList("abc","","Abh","hello","xyz","def","java","arg","aaa");
		List<String> res = filterStrings(li);
		res.forEach(System.out::println);
	}

	static List<String> filterStrings(List<String> li) {
		return li.stream().filter(str -> str.startsWith("a") && str.length()==3)
						  .collect(Collectors.toList());
	}

}
