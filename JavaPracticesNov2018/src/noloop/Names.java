package noloop;

public class Names {

	private int i;
	public void p1000() {
		p300();
		p300();
		p300();
		p100();
	}

	public void p300() {
		p100();
		p100();
		p100();
	}

	public void p100() {
		p30();
		p30();
		p30();
		p10();
	}

	public void p30() {
		p10();
		p10();
		p10();
	}

	public void p10() {
		p3();
		p3();
		p3();
		p1();
	}

	public void p3() {
		p1();
		p1();
		p1();
	}

	public void p1() {
		System.out.println("Aaron " + ++i);
	}

	public static void main(String[] args) {
		new Names().p1000();
	}

}
