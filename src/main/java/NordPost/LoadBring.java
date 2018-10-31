package NordPost;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.ArrayList;

public class LoadBring {

	public static TrackingDocument load(String tracking) throws
		IOException {
		return parseTrackingDocument(tracking);
	}

	private static TrackingDocument parseTrackingDocument(String
								       tracking) throws IOException {
		Connection connect = Jsoup.connect("https://tracking.bring" +
			".com/tracking.html?q=" + tracking);
		Document document = connect.get();

		String PackageNumber = Jsoup.parse(String.valueOf(document
			.getElementById("sporing-detailscolumn-kollinummer")))
			.text();
		String ShipmentNumber = Jsoup.parse(String.valueOf(document
			.getElementById("sporing-detailscolumn-shipmentNumber" +
				""))).text();
		String NumberOfPackages = Jsoup.parse(String.valueOf(document
			.getElementById("sporing-detailscolumn-antallkolli")))
			.text();
		String SenderReference = Jsoup.parse(String.valueOf(document
			.getElementById
				("sporing-detailscolumn-avsendersreferanse")))
			.text();
		String ProductName = Jsoup.parse(String.valueOf(document
			.getElementById("sporing-detailscolumn-produktnavn")))
			.text();
		String Weight = Jsoup.parse(String.valueOf(document
			.getElementById("sporing-detailscolumn-weight")))
			.text();
		String Measurements = Jsoup.parse(String.valueOf(document
			.getElementById("sporing-detailscolumn-dimension")))
			.text();

		String Sender = Jsoup.parse(String.valueOf(document
			.getElementById("sporing-detailscolumn-consignor-full" +
				""))).text();
		String Recipient = Jsoup.parse(String.valueOf(document
			.getElementById("sporing-detailscolumn-recipient-full" +
				""))).text();
		String DeliveryAddress = Jsoup.parse(String.valueOf(document
			.getElementById("sporing-detailscolumn-deliveryAddress" +
				"-full"))).text();


		String LatestStatusDate = Jsoup.parse(String.valueOf(document
			.getElementsByClass
				("sporing-sendingandkolli-latestevent-date")))
			.text();
		// String LatestStatus2 = Jsoup.parse(String.valueOf(document
		// .getElementsByClass
		// ("sporing-sendingandkolli-latestevent-text"))).text(); //
		// cała
		// klasa
		String LatestStatus = Jsoup.parse(String.valueOf(document
			.getElementsByClass
				("sporing-sendingandkolli-latestevent-text")))
			// tu wywołuję substringa
			.toString().substring(100, Jsoup.parse(String.valueOf
				(document.getElementsByClass
					("sporing-sendingandkolli-latestevent" +
						"-text"))).toString().indexOf
				(".") + 1);

		// String LatestStatusSubstring = LatestStatus.toString()
		// .substring(100,Jsoup.parse(String.valueOf(document
		// .getElementsByClass
		// ("sporing-sendingandkolli-latestevent-text"))).toString()
		// .indexOf(".")+1);

		TrackingDocument trackingDocument = new TrackingDocument();
		trackingDocument.setPackageNumber(PackageNumber);
		trackingDocument.setShipmentNumber(ShipmentNumber);
		trackingDocument.setNumberOfPackages(NumberOfPackages);
		trackingDocument.setSenderReference(SenderReference);
		trackingDocument.setProductName(ProductName);
		trackingDocument.setWeight(Weight);
		trackingDocument.setMeasurements(Measurements);
		trackingDocument.setSender(Sender);
		trackingDocument.setRecipient(Recipient);
		trackingDocument.setDeliveryAddress(DeliveryAddress);
		trackingDocument.setLatestStatusDate(LatestStatusDate);
		trackingDocument.setLatestStatus(LatestStatus);

		return trackingDocument;
	}
}

