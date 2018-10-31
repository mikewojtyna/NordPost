package NordPost;

import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;


public class CSV {
	public static void CsvMaker(Path targetFile, List<String>
		trackingNumbers) throws IOException {
		try (Writer writer = new FileWriter(targetFile.toFile())) {
			StatefulBeanToCsv csvWriter = new
				StatefulBeanToCsvBuilder(writer)
				.withApplyQuotesToAll(false).build();
			List<TrackingDocument> trackingDocuments =
				trackingNumbers.stream().map
					(CSV::loadTrackingDocument).collect
					(Collectors.toList());
			csvWriter.write(trackingDocuments);
		}
		catch (CsvRequiredFieldEmptyException |
			CsvDataTypeMismatchException e) {
			throw new RuntimeException(e);
		}
	}

	private static TrackingDocument loadTrackingDocument(String
								     trackingNumber) {
		try {
			return LoadBring.load(trackingNumber);
		}
		catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}