package NordPost;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class App {
	public static void main(String[] args) throws IOException {
		// this code produces the same results as previous version
		List<String> trackingNumbers = Arrays.asList("CS833958785NO");
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
