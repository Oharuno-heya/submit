package javaskillcheck8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ProcessA,ProcessBを持つインターフェイス
 */
interface Process {
	void check();
	void run();
	boolean re();
}

/**
 * ProcessAクラス
 */
class ProcessA implements Process{
	/** 入力され名前を表すた文字列 */
	private String name;
	/** 入力された年齢を表す数値 */
	private int age;
	/** 入力された値の真偽値を定義 */
	private boolean ba;

	/**
	 * 入力された名前と年齢を変数に代入するインスタンス
	 * @param n　名前を示す文字列
	 * @param a　年齢を示す数値
	 */
	public ProcessA(String n, int a) {
		name = n;
		age = a;
	}
	/**
	 * 名前がが10文字未満かつ年齢が140歳以下かを確認する条件式
	 */
	public void check() {
		if (name.length() < 10 && age >= 0 && age <= 140) {
			ba = true;
		} else {
			ba = false;
		}
	}
	/**
	 * 変数ｔｆをメインクラスに返す
	 * @return ba checkメソッドの条件式の真偽
	 */
	public boolean re() {
		return ba;
	}
	/**
	 * 指定された文字列を出力する
	 */
	public void run() {
		System.out.println("私の名前は" + name + "です。年齢は" + age + "です。");
	}
}

/**
 * ProcessBのクラス
 */
class ProcessB implements Process{
	/** 入力され名前を表すた文字列 */
	private String name;
	/** 入力された年齢を表す数値 */
	private int age;
	/** 入力された値の真偽値を定義 */
	private boolean bb;
	/**
	 * 入力された名前と年齢を変数に代入するインスタンス
	 * @param n　名前を示す文字列
	 * @param a　年齢を示す数値
	 */
	public ProcessB (String n, int a) {
		name = n;
		age = a;
	}
	/**
	 * 名前がが5～20文字かつ年齢が30~60歳かを確認する条件式
	 */
	public void check() {
		if (name.length() >= 5 && name.length() <= 20 && age >= 30 && age <= 60) {
			bb = true;
		} else {
			bb = false;
		}
	}
	/**
	 * 変数ｔｆをメインクラスに返す
	 */
	public boolean re() {
		return bb;
	}
	/**
	 * 指定された文字列を出力する
	 */
	public void run() {
		System.out.println("名前：" +name);
		System.out.println("年齢：" + age);
	}
}

/**
 * 8章実力確認問題8－２　メインクラス
 */
public class Name {
	/**
	 *　入力された名前と年齢を整理して出力する
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException{

		System.out.println("名前と年齢をを入力して下さい。");

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		/**　BafferedReaderで入力された値を代入するための配列nとages、aを定義　*/
		String[] n = new String[2];
		String[] ages = new String[2];
		int[] a = new int[2];
		/**　配列nとagesに入力された値を代入。String型のages配列をint型のa配列に変換。　*/
		for (int i = 0; i < 2; i++) {
			n[i] =  br.readLine();
			ages[i] =  br.readLine();
			a[i] = Integer.parseInt(ages[i]);
		}
		/** インターフェイスProcessの配列を定義。 */
		Process[] pro = new Process[2];
		/** ProcessAとProcessBクラスのオブジェクトを作成し、checkメソッドを呼び出す。 */
		for (int i = 0; i < pro.length; i++) {
		pro[0] = new ProcessA(n[i], a[i]);
		pro[0].check();
		boolean pa = pro[0].re();
		System.out.println(1);
		pro[0].run();

		pro[1] = new ProcessB(n[i], a[i]);
		pro[1].check();
		boolean pb = pro[1].re();
		System.out.println(2);
		pro[1].run();
		}
	}
}
