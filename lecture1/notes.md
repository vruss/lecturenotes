# Föreläsningsanteckningar

## Föreläsning 2

### -Återanvändbarhet

### -Enkel programkod

### -Namn

C++ exempel:
* Collections (i c++)
	* std::vector<T>
	* std::list<T>
	* std::map<Key, Value>
* Filhantering (i c++)
	* ifstream
	* ofstream
* Texthantering

I c++ använder vi vector, i Java använder vi ArrayList. <> kallas för diamond operator.

```java
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
```

De klasser i Java I/O som förstår text är Reader och Writer, de som förstår binär data är InputStream och OutputStream.
* Reader 
	* Reader (Datakälla)
	* Reader (Funktioner)

StringTokenizer klassen kan användas för att hämta ut det man vill ha ur en sträng. Klassen Scanner kan också göra det.

```java
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
```