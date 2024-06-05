package exception9;

/**
 * ProcessAクラス
 */
public class ProcessA implements ProcessInterface {
	/** 名前 */
	private String name;
	/** 年齢 */
	private int age;
	/**
	 * 名前が10文字未満かつ年齢が140歳以下かを確認して、真偽値を返す
  	 * @param name 名前
    	 * @param age 年齢
	 * @return 名前が10文字未満かつ0歳以上140歳未満のとき、Trueを返す。
	 */
	public boolean check(String name, int age) throws CustomException {
		this.name = name;
		this.age = age;
		if (name.length() >= 10 || age < 0 || age > 140) {
			CustomException e = new CustomException();
			throw e;
		} else {
			return true;
		}
	}
	/**
	 * 出力
	 */
	public void run() throws CustomException {
		if (System.out.checkError()) {
			CustomException e = new CustomException();
			throw e;
		} else {
			System.out.println("私の名前は" + name + "です。年齢は" + age + "です。");
		}
	}
}

