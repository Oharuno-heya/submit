package javaskillcheck5classbasic;

/**
 * Javaプログラム　5章　実力確認問題5‐1　
 */
class Goods {
/** name:商品名の文字列を代入する変数。*/
	String name;
/** price:商品価格の数値を代入する変数。*/
	int price;
/** tax:消費税率を示す変数 */
	int tax = 10;
/** calc:税込み価格を計算し代入する変数。*/
	int calc;
/** 
 *setGoodsメソッド：入力された商品名を変数nameに代入する。
 */
	void setGoods(String pname) {
		name = pname;
	}
/** 
 *nameを出力する
 */
	void showName() {
		System.out.println(name);
	}
/** 
 *setPriceメソッド:入力された商品価格をpriceに代入し、変数calcで税込み価格を計算する
 */
	void setPrice(int pprice) {
		price = pprice;
		calc = price + (price * tax / 100);
	}
/**
 * Priceの値とcalcを出力する
 */
	void showPrice() {
		System.out.println(price);
		System.out.println("購入額：" + calc);
	}
}
