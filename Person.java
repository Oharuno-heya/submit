ackage jaavaskillcheckclassfunction;

/**
 * 6章　実力確認問題　6‐2
 */
class Person {
	/**　名前の変数　*/
	private String name;
	/** 年齢の変数（String型） */
	private	String ages;
	/** 名前の変数（int型） */
	private	int age;
	/** 住所の変数 */
	private	String address;
	/** 電話番号の変数 */
	private	String tel;
	/**
	 * 名前、年齢、住所、電話番号の変数を初期化するコンストラクタ
	 */
	public Person() {
		name = "";
		ages = "";
		age = 0;
		address = "";
		tel = "";
	}
	/**
	 * 名前、年齢（String型）、住所、電話番号を変数に代入
	 * @param name 人物名
	 * @param ages 年齢（String型で入力された文字列）
	 * @param address 住所
	 * @param tel 電話番号
	 */
	public void setList(String name, String ages, String address, String tel) {
		this.name = name;
		this.ages = ages;
		this.address = address;
		this.tel = tel;

		System.out.println("私の名前は" + name + "です。");
		System.out.println("私の名前は" + ages + "です。");
		System.out.println("私の名前は" + address + "です。");
		System.out.println("私の名前は" + tel + "です。");
	}
	/**
	 * 名前、年齢（int型）、住所、電話番号を変数に代入
	 * @param name 人物名
	 * @param ages 年齢（int型で入力された数値）
	 * @param address 住所
	 * @param tel 電話番号
	 */
	public void setList(String name, int age, String address, String tel) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.tel = tel;

		System.out.println("私の名前は" + name + "です。");
		System.out.println("私の名前は" + age + "です。");
		System.out.println("私の名前は" + address + "です。");
		System.out.println("私の名前は" + tel + "です。");
	}
	/**
	 * Listを出力
	 */
	public void show() {
		System.out.println("私の名前は" + name + "です。");
		System.out.println("私の名前は" + ages + "です。");
		System.out.println("私の名前は" + address + "です。");
		System.out.println("私の名前は" + tel + "です。");
	}
}
