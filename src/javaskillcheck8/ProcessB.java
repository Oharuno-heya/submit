package javaskillcheck8;

/**
 * ProcessBのクラス
 * @param name 名前
 * @param age 年齢
 */
public class ProcessB implements Process{
	/** 名前 */
	private String name;
	/** 年齢 */
	private int age;
	/**
	 * 名前がが5～20文字かつ年齢が30~60歳かを確認し、真偽値を返す
	 * @return 名前の文字数が5～20文字かつ年齢が30～60歳のとき、trueを返す。
	 */
	public boolean check(String name, int age) {
		this.name = name;
		this.age = age;
		return (name.length() >= 5 && name.length() <= 20 && age >= 30 && age <= 60);
	}
	/**
	 * 出力
	 */
	public void run() {
		System.out.println("名前：" +name);
		System.out.println("年齢：" + age);
	}
}