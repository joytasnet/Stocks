import java.util.*;
import java.io.*;
public class Stock{
	public static void main(String[] args)throws Exception{
		ArrayList<Stocks>list=new ArrayList<>();
		FileInputStream fis=new FileInputStream("stocks_2017-08-16.csv");
		InputStreamReader isr=new InputStreamReader(fis,"UTF-8");
		BufferedReader br= new BufferedReader(isr);
		String line;
		while((line=br.readLine())!=null){
			String[] params=line.split(",",-1);
			Stocks stocks=new Stocks(params[0],params[1],params[6]);
			list.add(stocks);
		}
		br.close();
		showInfo(list);
	}
	static void showInfo(ArrayList<Stocks>list){
		int count=0;
		for(Stocks s:list){
			if(count++==0){
				s.showInfo2();
			}else{
				s.showInfo();
			}
		}
	}
}
class Stocks{
	String code;
	String name;
	String lastPrice;
	Stocks(String code,String name,String lastPrice){
		this.code=code;
		this.name=name;
		this.lastPrice=lastPrice;
	}
	void showInfo(){
		System.out.printf("%s %s %s %n",this.code,this.name,this.lastPrice);
	}
	void showInfo2(){
		System.out.printf("%s,%s,%s%n",this.code,this.name,this.lastPrice);
	}
}
