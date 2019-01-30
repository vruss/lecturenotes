import java.io.*;
import java.util.*;

public class FileReader {

	private static String HITCHHIKER_FILE = "hitch1.txt";

	public static void main(String[] args) {

		Map<String, Integer> wordCountMap = new TreeMap<>();
		List<String> lineList = new ArrayList<>();
		FileReader fileReader = null;
		
		try {
			fileReader = new FileReader(HITCHHIKER_FILE);
			BufferedReader hitchReader = new BufferedReader(fileReader);

			String line;
			while ((line = hitchReader.readLine() != null)) {
				lineList.add(line);
				Scanner lineScanner = new Scanner(line);
				while(lineScanner.hasNext()) {
					String word = lineScanner.next();
					Integer wordCount = wordCountMap.get(word);
					if(wordCount == null) {
						wordCountMap.put(word, 1);
					}
					else {
						wordCountMap.put(word, wordCount + 1);
					}
				}
			}
		} catch (IOException e) {
			System.err.println(e);
		}		
		System.out.println(wordCountMap.get("the"));
	}
}