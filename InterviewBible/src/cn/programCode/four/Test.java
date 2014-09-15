package cn.programCode.four;

public class Test {
	public static void main(String[] args) {

		String str = "�й�aadf��111��bbb�Ƶ�zz����";
		int engishCount = 0;
		int chineseCount = 0;
		int digitCount = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= '0' && ch <= '9') {
				digitCount++;
			} else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				engishCount++;
			} else {
				chineseCount++;
			}
		}
		System.out.println(engishCount + " " + chineseCount  + " "+ digitCount);
	}
}
