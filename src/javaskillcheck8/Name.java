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
	private boolean tf;
	/**
	 * 入力された名前と年齢を変数に代入するインスタンス
	 * @param n　名前を示す文字列
	 * @param a　年齢を示す数値
	 */
	public ProcessA(String n, int a ) {
		name = n;
		age = a;
	}
	/**
	 * 名前がが10文字未満かつ年齢が140歳以下かを確認する条件式
	 */
	public void check() {
		if (name.length() < 10 && age >= 0 && age <= 140) {
			tf = true;
		} else {
			tf = false;
		}
	}
	/**
	 * 変数ｔｆをメインクラスに返す
	 * @return tf checkメソッドの条件式の真偽
	 */
	public boolean re() {
		return tf;
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
	private boolean tf;
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
			tf = true;
		} else {
			tf = false;
		}
	}
	/**
	 * 変数ｔｆをメインクラスに返す
	 */
	public boolean re() {
		return tf;
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

		System.out.println("名前を入力して下さい。");
		System.out.println("年齢を入力して下さい。");

		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		String str = br.readLine();
		int a = Integer.parseInt(str);

		Process[] pro = new Process[2];
		pro[0] = new ProcessA(n, a);
		pro[0].check();
		pro[1] = new ProcessB(n, a);
		pro[1].check();

		boolean pa = pro[0].re();
		boolean pb = pro[1].re();

		for (int i = 0; i <pro.length; i++) {
			if (pa = true) {
				System.out.println(i + 1);
				pro[i].run();
			}
			if (pb = true) {
				System.out.println(i + 1);
				pro[i].run();
			}
		}
	}
}
