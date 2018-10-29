package NordPost;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class LoadBring {

    public static ArrayList<String> load() throws IOException {
        String tracking = "00370726203877283728";
        Connection connect = Jsoup.connect("https://tracking.bring.com/tracking.html?q=" + tracking);
        Document document = connect.get();

        String PackageNumber = Jsoup.parse(String.valueOf(document.getElementById("sporing-detailscolumn-kollinummer"))).text();
        String ShipmentNumber = Jsoup.parse(String.valueOf(document.getElementById("sporing-detailscolumn-shipmentNumber"))).text();
        String NumberOfPackages = Jsoup.parse(String.valueOf(document.getElementById("sporing-detailscolumn-antallkolli"))).text();
        String SenderReference = Jsoup.parse(String.valueOf(document.getElementById("sporing-detailscolumn-avsendersreferanse"))).text();
        String ProductName = Jsoup.parse(String.valueOf(document.getElementById("sporing-detailscolumn-produktnavn"))).text();
        String Weight = Jsoup.parse(String.valueOf(document.getElementById("sporing-detailscolumn-weight"))).text();
        String Measurements = Jsoup.parse(String.valueOf(document.getElementById("sporing-detailscolumn-dimension"))).text();

        String Sender = Jsoup.parse(String.valueOf(document.getElementById("sporing-detailscolumn-consignor-full"))).text();
        String Recipient = Jsoup.parse(String.valueOf(document.getElementById("sporing-detailscolumn-recipient-full"))).text();
        String DeliveryAddress = Jsoup.parse(String.valueOf(document.getElementById("sporing-detailscolumn-deliveryAddress-full"))).text();


        String LatestStatusDate = Jsoup.parse(String.valueOf(document.getElementsByClass("sporing-sendingandkolli-latestevent-date"))).text();
        // String LatestStatus2 = Jsoup.parse(String.valueOf(document.getElementsByClass("sporing-sendingandkolli-latestevent-text"))).text(); // cała klasa
        String LatestStatus = Jsoup.parse(String.valueOf(document.getElementsByClass("sporing-sendingandkolli-latestevent-text")))// tu wywołuję substringa
                .toString().substring(100, Jsoup.parse(String.valueOf(document.getElementsByClass("sporing-sendingandkolli-latestevent-text"))).toString().indexOf(".") + 1);

        // String LatestStatusSubstring = LatestStatus.toString().substring(100,Jsoup.parse(String.valueOf(document.getElementsByClass("sporing-sendingandkolli-latestevent-text"))).toString().indexOf(".")+1);


        ArrayList<String> Answer = new ArrayList<>();
        Answer.add(0, PackageNumber);
        Answer.add(1, ShipmentNumber);
        Answer.add(2, NumberOfPackages);
        Answer.add(3, SenderReference);
        Answer.add(4, ProductName);
        Answer.add(5, Weight);
        Answer.add(6, Measurements);
        Answer.add(7, Sender);
        Answer.add(8, Recipient);
        Answer.add(9, DeliveryAddress);
        Answer.add(10, LatestStatusDate);
        Answer.add(11, LatestStatus);


        //System.out.println(Answer);



       /* Elements allLI = document.select("li");
        for (Element elem : allLI) {
            System.out.println(elem.text());*/
return Answer;

    }}

