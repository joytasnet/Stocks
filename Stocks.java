import java.util.*;
import java.io.*;
public class Stocks{
	public static void main(String[] args) throws Exception{
		//csvファイルのデータ読み込み
		ArrayList<Stock> stocks = new ArrayList<>();
		FileInputStream fis = new FileInputStream("stocks_2017-08-16.csv");
		InputStreamReader isr = new InputStreamReader(fis,"utf-8");
		BufferedReader br = new BufferedReader(isr);
		String line;
		while((line = br.readLine()) != null){
			String[] params = line.split(",",-1);
			stocks.add(new Stock(params[0],params[1],params[6]));
		}
		br.close();
		//内容表示
		showStocks(stocks);
	}
	static void showStocks(ArrayList<Stock> list){
		for(Stock stock:list){
			stock.showInfo();
		}
	}
}
