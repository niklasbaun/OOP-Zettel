import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class IOStreams {

    public static Stream<String> words(String path) throws IOException {
        //open file
        Stream<String> lines = Files.lines(Paths.get(path));
        //split lines into words
        Stream<String> words = lines.flatMap(line -> Stream.of(line.split(" ")));
        //close file
        lines.close();

        return words;


    }
}
