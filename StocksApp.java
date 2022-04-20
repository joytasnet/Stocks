import java.util.*;
import java.io.*;
public class StocksApp{
	public static void main(String[] args)throws Exception{
		ArrayList<Stock> list=new ArrayList<>();
		FileInputStream fis=new FileInputStream("stocks_2017-08-16.csv");
		InputStreamReader isr=new InputStreamReader(fis,"utf8");
		BufferedReader br=new BufferedReader(isr);
		String line;
		while((line=br.readLine())!=null){
			String stocks[]=line.split(",",-1);
			list.add(new Stock(stocks[0],stocks[1],stocks[6]));
		}
		for(Stock s:list){
			s.showInfo();
		}
	}
}
class Stock{
	String code;
	String brandname;
	String se;
	Stock(String code,String brandname,String se){
		this.code=code;
		this.brandname=brandname;
		this.se=se;
	}
	void showInfo(){
		System.out.printf("%s %s %s\n",this.code,this.brandname,this.se);
	}

}
