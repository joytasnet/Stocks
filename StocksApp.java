import java.util.*;
import java.io.*;
public class StocksApp{
	public static void main(String[] args) throws Exception{
		ArrayList<Stocks> list = new ArrayList<>();

		FileInputStream fis = new FileInputStream("stocks_2017-08-16.csv");
		InputStreamReader isr = new InputStreamReader(fis, "utf-8");
		BufferedReader br = new BufferedReader(isr);
		String labels = br.readLine();
		String[] labelParams = labels.split(",", -1);

		String line;
		while((line = br.readLine()) != null){
			String[] params = line.split(",",-1);
			Stocks stock = new Stocks(params[0],params[1],params[6]);
			list.add(stock);
		}
		br.close();
		System.out.printf("%s,%s,%s%n",labelParams[0],labelParams[1],labelParams[6]);
		showList(list);
	}
	static void showList(ArrayList<Stocks> list){
		for(Stocks stock:list){
			stock.showInfo();
		}
	}
}
class Stocks{
	String code;
	String name;
	String lastPrice;
	Stocks(String code, String name, String lastPrice){
		this.code = code;
		this.name = name;
		this.lastPrice = lastPrice;
	}
	void showInfo(){
		System.out.printf("%s %s %s%n",code,name,lastPrice);
	}
}
