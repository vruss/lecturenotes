 Lektion 3
## sträva allt efter läsbarhet tänk inte på att det är mindre effektivt.
omvandling från text till annan form kallas parsning.

lägg hela readen i try blocket.
Scanner kastar inget om den avbryts under inläsningen då blir bara hasNext() = false;
dela upp i olika metoder.
namnet på metoden ska ofta indikera returtypen.
ex getWordCountMap() alternativt kan vi döpa den till exakt det den gör.
1. läs fil.
List<String> readLinesFromFiles(String file);
for(String lines: lines) //läser in alla element i lines
2. läser ord.
Map<String,Integer> wordCountMap = getWordCountMap(words);
Använd keySet för att hämta alla nycklar i mappen.
Detta fungerar för att keySet är "itterable" se oracle docs.
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
