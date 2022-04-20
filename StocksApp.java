import java.util.*;
import java.io.*;
public class StocksApp{
	public static void main(String[] args) throws Exception{
		ArrayList <Stocks> stocksList = new ArrayList <Stocks>();//リスト作成

		FileInputStream fis = new FileInputStream("stocks_2017-08-16.csv");//ファイル読み込み
		InputStreamReader isr = new InputStreamReader(fis,"utf-8");
		BufferedReader br = new BufferedReader(isr);

		String line;
		while((line=br.readLine())!=null){
				String[] param = line.split(",");//カンマ区切りで読み込み
				Stocks s = new Stocks(param[0],param[1],param[2]);//インスタンス生成
				stocksList.add(s);//リストに追加
		}
		br.close();
		showInfo(stocksList);
	}
	//Mefthod
	static void showInfo(ArrayList<Stocks> stocksList){
		System.out.printf("コード,銘柄名,終値");
		for(Stocks s : stocksList){
			s.outPrint(stocksList);
		}
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
		this.lastPrice=lastPrice;
	}
	public void outPrint(ArrayList<Stocks> stocksList){
		System.out.printf("%s%s%s%n",this.code,this.name,this.lastPrice);
	}
}
