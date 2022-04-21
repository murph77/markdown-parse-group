import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.*;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testTestFile() throws IOException{
        String fileName = Files.readString(Path.of("/Users/steve/Documents/School Work/Spring 22/CSE 15L/Lab 3/test-file.md"));

        ArrayList<String> listOfLinks = new ArrayList<>();
        listOfLinks = MarkdownParse.getLinks(fileName);

        List<String> expectedLinks = new ArrayList<String>();
        expectedLinks = List.of("https://something.com", "some-thing.html");

        assertEquals(expectedLinks, listOfLinks);

    }
}

