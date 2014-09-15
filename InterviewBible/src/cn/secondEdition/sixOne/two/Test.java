package cn.secondEdition.sixOne.two;

public class Test {

	public static void main(String[] args) {
		Test t = new Test();
		t.first();
		
		System.out.println(".....................");
		
		char ch[] = {'H', 'e', 'l', 'l', 'o'};
		change(ch);
		System.out.println(ch);
	}
	
	public void first(){
		int i = 5;
		Value v = new Value();
		v.i = 25;
		second(v, i);
		System.out.println(v.i);
	}

	public void second(Value v, int i){
		i = 0;
		v.i = 20;
		Value val = new Value();
		v = val;
		System.out.println(v.i + " " + i);
	}
	
	public static void change(char ch[]){
		ch[0] = 'C';
	}
}

class Value{
	public int i = 15;
}
