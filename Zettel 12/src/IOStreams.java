import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class IOStreams {

    /**
     * method to read a file and put it into a Stream
     * @param path the path to the file
     * @return a Stream of the file
     * @throws IOException if sth went wrong
     */
    public static Stream<String> words(String path) throws IOException {
        //open file
        Path filepath = Paths.get(path);
        if (Files.isReadable(filepath)) {
            //readfile with Bufferedreader
            BufferedReader input = new BufferedReader(new FileReader(path));
            //read and put into Stream of words
            Stream<String> words = input.lines().flatMap(line -> Stream.of(line.split("\\S(?!\\S)")));
            return words;
        } else {
            throw new FileNotFoundException("File was not in the specified Location");
        }
    }

    Map<String, Integer> countWords(Stream<String> words) {
        Map<String, Integer> wordCount = new HashMap<>();
        words.forEach(word -> {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        });
        return wordCount;
    }

    public static void writeCountedWords(Map<String, Integer> countedWords, String filepath){

    }
}
