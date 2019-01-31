# Lektion 3
## sträva alltid efter läsbarhet tänk inte på att det är mindre effektivt.
* Omvandling från text till annan form kallas parsning.

* Scanner kastar inget om den avbryts under inläsningen då blir bara hasNext() = false;

* namnet på metoden ska ofta indikera returtypen.
ex getWordCountMap() alternativt kan vi döpa den till exakt det den gör.
List<String> readLinesFromFiles(String file);
 
* for(String lines: lines) //läser in alla element i lines
 

Map<String,Integer> wordCountMap = getWordCountMap(words);
Använd keySet för att hämta alla nycklar i mappen.
Detta fungerar för att keySet är "iterable", medans map inte är det. se oracle docs.

'''java
Set<String> wordSet = wordCountMap.keySet();
for(String word: wordSet)
{
    int count = wordCountMap.keySet();
    toplist.put(count,word);

}
Set<Integer> top = toplist.keySet();
for(Integer count : topCountSet)
{
    System.out.println("Ord: " + toplist.get.(count) + " förekommer " + count + " gånger");
}
'''
 
 
OutputStream - OS - datakälla
             - OS - funktioner
    -writer - datakälla
            - funktioner
InputStream

'''java
FileOutputStream fos = new FileOutputStream(toplistobjekt.obj);
ObjectOutPutStream oos = new ObjectOutputStream;
'''
skriva objekt till fil
object streams bör stängas
kontrollera om det gick bra att läsa in en fil??
printwriter för att skriva till filer.
'''java
printWriter out = new PrintWriter(topListFileName);
