import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class readUtils {
    public static List<String> getTestData(String filename) throws FileNotFoundException {
        List<String> records = new ArrayList<>();
        BufferedReader file = new BufferedReader(new FileReader(filename));
        file.lines().forEach(records::add);
        return records;
    }
}
