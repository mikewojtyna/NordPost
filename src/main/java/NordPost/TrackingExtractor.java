package NordPost;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class TrackingExtractor {
	public static List<String> extract(Path csvFile) throws IOException {
		return Files.readAllLines(csvFile);
	}
}