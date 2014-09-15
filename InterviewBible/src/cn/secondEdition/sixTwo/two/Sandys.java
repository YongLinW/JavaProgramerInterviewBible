package cn.secondEdition.sixTwo.two;

public class Sandys {

	private int court;
	
	public static void main(String[] args) {
		Sandys s = new Sandys(99);
		System.out.println(s.court);
		

	}

	public Sandys(int ballcount) {
		court = ballcount;
	}
}
