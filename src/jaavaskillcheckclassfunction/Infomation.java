package jaavaskillcheckclassfunction;

/**
 * 6章　実力確認問題　6‐2
 */
class Person {
	/**
	 * 名前の変数
	 */
	private String name;
	/**
	 * 年齢の変数（String型）
	 */
	private	String ages;
	/**
	 * 名前の変数（int型）
	 */
	private	int age;
	/**
	 * 住所の変数
	 */
	private	String address;
	/**
	 * 電話番号の変数
	 */
	private	String tel;

	/**
	 * 名前、年齢、住所、電話番号の変数を初期化するコンストラクタ
	 */
	public Person() {
		name = null;
		ages = null;
		age = 0;
		address = null;
		tel = null;
	}
	/**
	 * 名前を受け取り、出力するメソッド
	 * @param name 人物名
	 */
	public void setName (String name) {
		this.name = name;
		System.out.println("私の名前は" + name + "です。");
	}
	/**
	 * 年齢をString型で受け取り、出力するメソッド
	 * @param ages 年齢（String型で入力された文字列）
	 */
	public void setAge (String ages) {
		this.ages = ages;
		System.out.println("私の名前は" + ages + "です。");
	}
	/**
	 * 年齢をint型で受け取り、出力するメソッド
	 * @param age 年齢（int型で入力された数値）
	 */
	public void setAge (int age) {
		this.age = age;
		System.out.println("私の名前は" + age + "です。");
	}
	/**
	 * 住所を受け取り、出力するメソッド
	 * @param address 住所
	 */
	public void setAddress (String address) {
		this.address = address;
		System.out.println("私の名前は" + address + "です。");
	}
	/**
	 * 電話番号を受け取り、出力するメソッド
	 * @param tel 電話番号
	 */
	public void setTel (String tel) {
		this.tel = tel;
		System.out.println("私の名前は" + tel + "です。");
	}
}

public class Infomation {
/**
 * 入力された名前、年齢、住所、電話番号をリスト化し、出力する
 * @param args
 */
	public static void main(String[] args) {
		/**
		 * 1つ目のオブジェクト
		 */
		Person per1 = new Person();
		per1.setName("山田");
		per1.setAge("23");
		per1.setAddress("東京都大田区");
		per1.setTel("090‐0000-0000");

		/**
		 * 2つめのオブジェクト
		 */
		Person per2 = new Person();
		per2.setName("田中");
		per2.setAge(20);
		per2.setAddress("埼玉県上尾市");
		per2.setTel("070‐1111-2222");

		/**
		 * 3つめのオブジェクト
		 */
		Person per3 = new Person();
		per3.setName("国光");
		per3.setAge(29);
		per3.setAddress("山梨県笛吹市");
		per3.setTel("080‐4444-5555");
	}
}
