import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class IOStreamsTest {

    @Test
    void words() throws FileNotFoundException {
    //check if the file is opened
    assertTrue(IOStreams.words("../Zettel 12/paleBlueDot.txt").count() > 0);
    //get content of the file
    Stream<String> content = IOStreams.words("../Zettel 12/paleBlueDot.txt");

    BufferedReader reader = new BufferedReader(new FileReader("../Zettel 12/paleBlueDot.txt"));
    Stream<String> compare = reader.lines().flatMap(line -> Stream.of(line.split(" ")));
    //check if the content is correct
    // doesn't work. Don't know how else to compare the streams
    assertEquals(compare, content);

    }

    @Test
    void countWords() throws IOException {
        //create a map with the words and their count
        Map<String, Integer> countedWords = IOStreams.countWords(IOStreams.words("../Zettel 12/theRaven.txt"));
        //check if the map is created
        assertNotNull(countedWords);
        //check if the map is not empty
        assertFalse(countedWords.isEmpty());
        //create correct map
        Map<String, Integer> correctMap = new HashMap<>();
        //fill map with each line of countedword file
        BufferedReader reader = new BufferedReader(new FileReader("../Zettel 12/countedWords.txt"));
        reader.lines().forEach(line -> {

            String[] split = line.split(" : ");
            correctMap.put(split[0], Integer.parseInt(split[1]));
        });
        //compare the map with the correct map

        //!!doesn't work because of the order of the words!!
        assertEquals(correctMap, countedWords);
        //!!doesn't work because of the order of the words!!

    }

    @Test
    void writeCountedWords() throws IOException {
        //create a map with the words and their count
        Map<String, Integer> countedWordsT = IOStreams.countWords(IOStreams.words("../Zettel 12/theRaven.txt"));
        //write the map to a file
        IOStreams.writeCountedWords(countedWordsT, "../Zettel 12/countedWordsT.txt");
        //check if the file is created
        assertTrue(IOStreams.words("../Zettel 12/countedWordsT.txt").count() > 0);
    }
}