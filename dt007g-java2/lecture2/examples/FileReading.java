import java.io.*;
import java.util.*;

public class FileReading {

	private static String HITCHHIKER_FILE = "hitch1.txt";

	public static void main(String[] args) {

		Integer topListLength = 0;

		if (args.length >= 2) {
			if (args[0].equals("top")) {
				String value = args[1];
				topListLength = Integer.parseInt(value);
			}
		}

		List<String> words = readWordsFromFiles(HITCHHIKER_FILE);
		Map<String, Integer> wordCountMap = getWordCountMap(words);

		TreeMap<Integer, String> toplist = new TreeMap<>();
		Set<String> wordSet = wordCountMap.keySet();
		for (String word : wordSet) {
			Integer count = wordCountMap.get(word);
			toplist.put(count, word);
		}


		Set<Integer> topCountSet = toplist.descendingKeySet();
		int topListLineCount = 0;
		for (Integer count : topCountSet) {
			if (topListLineCount >= topListLength)
				break;
			System.out.println("Ord: " + toplist.get(count) + " förekommer: " + count + " gånger");
			topListLineCount++;
		}
	}

	private static List<String> readWordsFromFiles(String filename) {
		List<String> wordList = new ArrayList<>();
		Scanner fileScanner = null;

		try {
			File file = new File(filename);
			fileScanner = new Scanner(file);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String word;
		while (fileScanner.hasNext()) {
			word = fileScanner.next();
			wordList.add(word);
		}
		return wordList;
	}

	private static Map<String, Integer> getWordCountMap(List<String> words) {
		Map<String, Integer> wordCountMap = new TreeMap<>();

		for (String word : words) {
			Integer wordCount = wordCountMap.get(word);
			if (wordCount == null) {
				wordCountMap.put(word, 1);
			} else {
				wordCountMap.put(word, wordCount + 1);
			}
		}
		return wordCountMap;
	}
}