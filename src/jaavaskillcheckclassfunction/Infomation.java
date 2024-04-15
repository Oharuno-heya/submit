package jaavaskillcheckclassfunction;

class Person {
	private String name;
	private	String ages;
	private	int age;
	private	String address;
	private	String tel;

	public Person() {
		name = null;
		ages = null;
		age = 0;
		address = null;
		tel = null;
	}
	public void setName (String name) {
		this.name = name;
		System.out.println("私の名前は" + name + "です。");
	}
	public void setAge (String ages) {
		this.ages = ages;
		System.out.println("私の名前は" + ages + "です。");
	}
	public void setAge (int age) {
		this.age = age;
		System.out.println("私の名前は" + age + "です。");
	}
	public void setAddress (String address) {
		this.address = address;
		System.out.println("私の名前は" + address + "です。");
	}
	public void setTel (String tel) {
		this.tel = tel;
		System.out.println("私の名前は" + tel + "です。");
	}

}

public class Infomation {

	public static void main(String[] args) {
		Person per1 = new Person();
		per1.setName("山田");
		per1.setAge("23");
		per1.setAddress("東京都大田区");
		per1.setTel("090‐0000-0000");

		Person per2 = new Person();
		per2.setName("田中");
		per2.setAge(20);
		per2.setAddress("埼玉県上尾市");
		per2.setTel("070‐1111-2222");

		Person per3 = new Person();
		per3.setName("国光");
		per3.setAge(29);
		per3.setAddress("山梨県笛吹市");
		per3.setTel("080‐4444-5555");
	}

}
