# 株価表示アプリを作ろう

# 添付してあるcsvデータを読み込み以下の出力が得られる処理を作成せよ

## 実行例
コード,銘柄名,終値  
1301-T 極洋 3350.00  
1305-T ETFTPX 1672.00  
.  
.  
.  

## Stockクラスを作成する
フィールド  
String code  
String name  
String lastPrice  

コンストラクタ  
引数３つ  

メソッド  
void showInfo(){}  

## 注意点
splitする際に第２引数に-1を設定すること
例) line.split(",",-1)


