ackage jaavaskillcheckclassfunction;
import java.util.ArrayList;
import java.util.List;

/**
 * 6章　実力確認問題　6‐2
 */
public class Person {
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
	public Person(String name, int ages, String address, String tel) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.tel = tel;
	}
	/**
 	 *
   	 */
	public void setAge(Object age) {
		if (age instanceof String) {
            		this.age = Integer.parseInt((String) age);
       		} else if (age instanceof Integer) {
            		this.age = (int) age;
        	}
    	}
	/**
	 * Listを出力
	 */
	public void show() {
		System.out.println("私の名前は" + name + "です。");
		if (age == 0) {
			System.out.println("私の名前は" + ages + "です。");
		} else {
			System.out.println("私の名前は" + age + "です。");
		}
		System.out.println("私の名前は" + address + "です。");
		System.out.println("私の名前は" + tel + "です。");
	}
}
