package cn.secondEdition.sixThree.four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class InputData {
	static private String s = "";

	static public void input() {
		BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
		try{
			s = bu.readLine();
		}catch(IOException e){
			
		}
	}
	
	static public int getInt(){
		input();
		return Integer.parseInt(s);
	}
}

class Result{
	void print(int d){
		System.out.println(d + "��ƽ����" + d * d);
		System.out.println(d + "������: " + d * d *d );
	}
}

public class PrintResult{
	public static void main(String[] args) {
		Result result = new Result();
		System.out.println("please input a integer: ");
		int a = InputData.getInt();
		result.print(a);
	}
}

