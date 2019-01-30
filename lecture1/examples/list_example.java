import java.util.*;

public class list_example {
	static int FIRST_ELEMENT = 0;
	static String MY_NAME = "Viktor";

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add(MY_NAME);
		System.out.println(stringList.get(FIRST_ELEMENT));
	}
}