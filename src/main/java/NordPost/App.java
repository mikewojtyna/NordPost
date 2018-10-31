package NordPost;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class App {
	public static void main(String[] args) throws IOException {
		// that's how you can use the new version
		List<String> trackingNumbers = Arrays.asList("CS833958785NO",
			"CS833948284NO", "CS833952054NO");
		// If you want to get all tracking numbers from ask.csv file
		// uncomment the following line
		// trackingNumbers = readAllTrackingNumbers();
		CSV.CsvMaker(Paths.get("result.csv"), trackingNumbers);
	}

	private static List<String> readAllTrackingNumbers() throws
		IOException {
		return TrackingExtractor.extract(Paths.get("ask.csv"));
	}
}
