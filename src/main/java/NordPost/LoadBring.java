package NordPost;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class LoadBring {

    public static void load() throws IOException {
        String tracking = "00370726203877283728";
        Connection connect = Jsoup.connect("https://tracking.bring.com/tracking.html?q=" + tracking);
        Document document = connect.get();

        String PackageNumber= Jsoup.parse(String.valueOf(document.getElementById("sporing-detailscolumn-kollinummer"))).text();
        String ShipmentNumber= Jsoup.parse(String.valueOf(document.getElementById("sporing-detailscolumn-shipmentNumber"))).text();
        String NumberOfPackages= Jsoup.parse(String.valueOf(document.getElementById("sporing-detailscolumn-antallkolli"))).text();
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
                .toString().substring(100,Jsoup.parse(String.valueOf(document.getElementsByClass("sporing-sendingandkolli-latestevent-text"))).toString().indexOf(".")+1);

       // String LatestStatusSubstring = LatestStatus.toString().substring(100,Jsoup.parse(String.valueOf(document.getElementsByClass("sporing-sendingandkolli-latestevent-text"))).toString().indexOf(".")+1);





        System.out.println(PackageNumber);
        System.out.println(ShipmentNumber);
        System.out.println(NumberOfPackages);
        System.out.println(SenderReference);
        System.out.println(ProductName);
        System.out.println(Weight);
        System.out.println(Measurements);
        System.out.println(Sender);
        System.out.println(Recipient);
        System.out.println(DeliveryAddress);
        System.out.println(LatestStatusDate);
        System.out.println(LatestStatus);

        }






       /* Elements allLI = document.select("li");
        for (Element elem : allLI) {
            System.out.println(elem.text());*/



    }

