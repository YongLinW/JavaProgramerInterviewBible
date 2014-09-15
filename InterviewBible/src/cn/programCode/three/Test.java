package cn.programCode.three;

public class Test {
	public static void main(String[] args) throws Exception {
		String str = "我a爱中华abc我爱传智def";
		String str1 = "我ABC汉";
		for (byte b : str.getBytes("GBK")) {
			System.out.println(b);
		}
		int num = trimGBK(str.getBytes("GBK"), 7);
		System.out.println(str.substring(0, num));
	}

	public static int trimGBK(byte[] buf, int n) {
		int num = 0;
		boolean bChineseFirstHalf = false;
		for (int i = 0; i < n; i++) {
			if (buf[i] < 0 && !bChineseFirstHalf) {
				bChineseFirstHalf = true;
			} else {
				num++;
				bChineseFirstHalf = false;
			}
		}
		return num;
	}
}
