package javka;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class scraping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String url = "https://pl.fuelo.net/gasstation/id/35642?lang=en";
		
		try {
			
			final Document doc = Jsoup.connect(url).get();
			
			//for (Element row : doc.select("table.table.table-hover.table-simple tr")) { 
			for ( int i = 0; i<4; i++ ) {
				Element row = doc.select("table.table.table-hover.table-simple tr").get(i);
						
				if (row.select("td:nth-of-type(2)").text().equals("")) {
					continue;
				}
				
				else {
					final String rusticker = row.select("td:nth-of-type(2)").text();
					final String ticker;
					
					if (rusticker.equals("Бензин А95")) {
						ticker = rusticker.replace("Бензин А95", "Benzyna 95");
					} else if (rusticker.equals("Дизел")) {
						ticker = rusticker.replace("Дизел", "Diesel");
					} else {
						ticker = rusticker.replace("Пропан-Бутан", "LPG");
					}


					final String price = row.select("td:nth-of-type(3)").text();
				System.out.println(ticker + ".........." + price);
				}
			}
			
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
