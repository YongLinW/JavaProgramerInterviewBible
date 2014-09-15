package cn.eightOne;

import java.io.IOException;

public class GarbageTest {
	/**
	 * @paramargs
	 * @throwsIOException
	 */
	public static void main(String[] args) throws IOException {
		try {
			gcTest();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("has exited gcTest!");
		System.in.read();
		System.in.read();
		System.out.println("out begin gc!");
		for (int i = 0; i < 100; i++) {
			System.gc();
			System.in.read();
			System.in.read();
		}

//		Scanner cin = new Scanner(System.in);
//		System.out.println("������������֣�");
//		String name = cin.nextLine();
//		System.out.println("�������������");
//		int age = cin.nextInt();
//		System.out.println("��������ǣ�" + name + " " + "��������ǣ�" + age);
	}

	private static void gcTest() throws IOException {
		System.in.read();
		System.in.read();
		Person p1 = new Person();
		System.in.read();
		System.in.read();
		Person p2 = new Person();
		p1.setMate(p2);
		p2.setMate(p1);
		System.out.println("before exit gctest!");
		System.in.read();
		System.in.read();
		System.gc();
		System.out.println("exit gctest!");
	}

	private static class Person {
		byte[] data = new byte[20000000];
		Person mate = null;

		public void setMate(Person other) {
			mate = other;
		}
	}
}
