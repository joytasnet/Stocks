public class Stock{
	String code;
	String name;
	String lastPrice;

	public Stock(String code,String name,String lastPrice){
		this.code = code;
		this.name = name;
		this.lastPrice = lastPrice;
	}

	public void showInfo(){
		System.out.printf("%s %s %s%n",this.code,this.name,this.lastPrice);
	}
}
