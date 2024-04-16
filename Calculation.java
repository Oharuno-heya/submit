package javaskillcheck5classbasic;

/**
 * Javaプログラム　5章実力確認問題　5‐2
 */
class Calculation {
	/** 入力された1つ目の数値1*/
	int num1;
	/* 入力された2つ目の数値1**/
	int num2;
	/** 入力された演算子*/
	String ope;
	/** 2つの整数を演算子で計算した結果*/
	int res = 0;
	/** 入力された数値１を変数num1に代入するメソッド。*/
	void number1(int pnum1) {
		num1 = pnum1;
	}
	/**
 	 * 入力された数値2を変数num2に代入するメソッド。
	 */
	void number2(int pnum2) {
		num2 = pnum2;
	}
	/**
 	 * 入力された演算子を変数opeに代入するメソッド。
   	 */
	void operant(String pope) {
		ope = pope;
	}
	/**
 	 * 入力された演算子の種類の応じて計算結果を変数resに代入するメソッド。
   	 */
	void calc() {
		if(ope.equals("+")) {
			res = num1 + num2;
		}else if (ope.equals("-")) {
			res = num1 - num2;
		}else if (ope.equals("*")) {
			res = num1 * num2;
		}else if (ope.equals("/")) {
			res = num1 / num2;
		}
	}
	/**
 	 * 変数resを出力
	 */
	void show(){
	System.out.println("計算結果：" + res);
	}
}
