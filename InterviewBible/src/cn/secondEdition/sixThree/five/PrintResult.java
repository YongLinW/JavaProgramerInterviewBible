package cn.secondEdition.sixThree.five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class InputData {
	static private String s = "";

	static public void input() {
		BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
		try {
			s = bu.readLine();
		} catch (IOException e) {

		}
	}

	static public int getInt() {
		input();
		return Integer.parseInt(s);
	}
}

class Result {
	void print(int d) {
		if(((d - 1) & (d)) == 0 && (d != 0)){
			System.out.println("是2的阶次");
		}
		else{
			System.out.println("不是2的阶次");
		}
	}
}

public class PrintResult {
	public static void main(String[] args) {
		Result result = new Result();
		System.out.println("please input a integer: ");
		int a = InputData.getInt();
		result.print(a);
	}
}
