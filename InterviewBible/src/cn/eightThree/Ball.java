package cn.eightThree;

public class Ball implements Rollable {

	private String name;

	public String getName() {
		return name;
	}

	public Ball(String name) {
		this.name = name;
	}

	public void play() {
		ball = newBall("Football");
		System.out.println(ball.getName());
	}

}
