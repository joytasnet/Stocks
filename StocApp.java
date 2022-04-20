import java.util.*;
import java.io.*;
public class StocksApp{
	public static void main(String[] args){
		ArrayList <Stocks> stocksList = new ArrayList <Stocks>();//リスト作成

		FileInputStream fis = new FileInputStream("stocks_2017-08-16.csv");//ファイル読み込み
		InputStreamReader isr = new InputStreamReader(fis,"utf-8");
		BufferedReader br = new BufferedReader(isr);

		String line;
		while(true){
			if((line=br.readLine())!=null){
				String[] param = line.sprit(",");//カンマ区切りで読み込み
				Stocks s = new Stocks(param[0],param[1],param[2]);//インスタンス生成
				stocksList.add(s);
			}
		}
		br.close();
		Stocks.showInfo();
	}
}
//Stock Class
class Stocks{
//Field
	String code;
	String name;
	String lastPrice;
//Constructor
	public Stocks(String code,String name,String lastPrice){
		this.code=code;
		this.name=name;
		this.lastPrice=lastprice;
	}
//Mefthod
	public void showInfo(ArrayList<Stock> stock){
		System.out.printf("コード,銘柄名,終値");
			System.out.printf("%s%s%s%n",this.ncode,this.name,this.lastPrice);
	}
}
