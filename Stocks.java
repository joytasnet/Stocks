import java.util.*;
import java.io.*;
public class Stocks{
	public static void main(String[] args) throws Exception{
		ArrayList<Stock> list = new ArrayList<>();
		FileInputStream fis = new FileInputStream("stocks_2017-08-16.csv");
		InputStreamReader isr =new InputStreamReader(fis,"utf-8");
		BufferedReader br =new BufferedReader(isr);

		String labels =br.readLine();
		String line;
		String[] label =labels.split(",",-1);
		Stock l =new Stock(label[0],label[1],label[6]);
		while((line =br.readLine()) !=null){
			String[] params=line.split(",",-1);
			Stock s = new Stock(params[0],params[1],params[6]);
			list.add(s);
		}
		br.close();

		l.showInfo();
		showList(list);
	}
	static void showList(ArrayList<Stock> list){
		for(Stock s:list){
			s.showInfo();
		}
	}
}
class Stock{
	String code;
	String name;
	String lastPrice;
	Stock(String code,String name,String lastPrice){
		this.code=code;
		this.name=name;
		this.lastPrice=lastPrice;
	}
	void showInfo(){
		System.out.printf("%s%s%s%n",this.code,this.name,this.lastPrice);
	}
}
