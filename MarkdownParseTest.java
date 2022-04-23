import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParseTest {
    Path fileName = Path.of(args[0]);
    String content = Files.readString(fileName);
    ArrayList<String> links = getLinks(content);

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void parseTest() {
        String[] expected = new String[2];
        expected[0] = "http://something.com";
        expected[1] = "some-page.html";
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(expected, links);
    }
}
