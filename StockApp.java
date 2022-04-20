import java.util.*;
import java.io.*;
public class StockApp{
	public static void main(String[] args) throws Exception{
		ArrayList<Stock> list = new ArrayList<>();
		FileInputStream fis = new FileInputStream("stocks_2017-08-16.csv");
		InputStreamReader isr = new InputStreamReader(fis,"utf-8");
		BufferedReader br = new BufferedReader(isr);

		String line;
		String title = br.readLine();
		String[] titleParams = title.split(",");
		String label = titleParams[0]+","+titleParams[1]+","+titleParams[6];
		while((line = br.readLine()) != null){
			String[] params = line.split(",");
			Stock s = new Stock(params[0],params[1],params[6]);
			list.add(s);
		}
		br.close();
		System.out.println(label);
		for(Stock stock : list){
			stock.showInfo();
		}
	}
}

class Stock{
	String code;
	String name;
	String lastPrice;

	Stock(String code,String name,String lastPrice){
		this.code = code;
		this.name = name;
		this.lastPrice = lastPrice;
	}

	void showInfo(){
		System.out.printf("%s %s %s%n",this.code,this.name,this.lastPrice);
	}

}

