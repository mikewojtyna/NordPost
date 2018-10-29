package NordPost;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;


public class CSV {


    public static void CsvMaker () throws IOException, FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File("test.csv"));
        StringBuilder sb = new StringBuilder();
        sb.append("PackageNumber");
        sb.append(',');
        sb.append("ShipmentNumber");
        sb.append(',');
        sb.append("NumberOfPackages");
        sb.append(',');
        sb.append("SenderReference");
        sb.append(',');
        sb.append("ProductName");
        sb.append(',');
        sb.append("Weight");
        sb.append(',');
        sb.append("Measurements");
        sb.append(',');
        sb.append("Sender");
        sb.append(',');
        sb.append("Recipient");
        sb.append(',');
        sb.append("DeliveryAddress");
        sb.append(',');
        sb.append("LatestStatusDate");
        sb.append(',');
        sb.append("LatestStatus");
        sb.append('\n');


        sb.append(LoadBring.load().get(0));
        sb.append(',');
        sb.append(LoadBring.load().get(1));
        sb.append(',');
        sb.append(LoadBring.load().get(2));
        sb.append(',');
        sb.append(LoadBring.load().get(3));
        sb.append(',');
        sb.append(LoadBring.load().get(4));
        sb.append(',');
        sb.append(LoadBring.load().get(5));
        sb.append(',');
        sb.append(LoadBring.load().get(6));
        sb.append(',');
        sb.append(LoadBring.load().get(7));
        sb.append(',');
        sb.append(LoadBring.load().get(8));
        sb.append(',');
        sb.append(LoadBring.load().get(9));
        sb.append(',');
        sb.append(LoadBring.load().get(10));
        sb.append(',');
        sb.append(LoadBring.load().get(11));

        sb.append('\n');

        pw.write(sb.toString());
        pw.close();
        System.out.println("done!");
    }



}