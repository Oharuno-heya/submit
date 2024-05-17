package javaskillcheck8;

public class Times implements CalculateBase{
	private int x;
	private int y;

	public void calculate(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println(x + "*" + y + "=" + (x * y));
	}
}
