package cn.programCode.six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

public class GetNameTest {
	/**
	 * @paramargs
	 */
	public static void main(String[] args) {
		// InputStream ips
		// =GetNameTest.class.getResourceAsStream("/com/huawei/interview/info.txt");
		// ����һ��ע�͵Ĵ������һ�еĴ��붼���ԣ���Ϊinfo.txt��GetNameTest����ͬһ�����棬���ԣ���������������·����ʽ
		Map results = new HashMap();
		InputStream ips = GetNameTest.class
				.getResourceAsStream("info.txt");
		BufferedReader in = new BufferedReader(new InputStreamReader(ips));
		String line = null;
		try {
			while ((line = in.readLine()) != null) {
				dealLine(line, results);
			}
			sortResults(results);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static class User {
		public String name;
		public Integer value;

		public User(String name, Integer value) {
			this.name = name;
			this.value = value;
		}

		@Override
		public boolean equals(Object obj) {
			// ����Ĵ���û��ִ�У�˵����treeset����������ʱ������ʹ�õ�equals������
			boolean result = super.equals(obj);
			System.out.println(result);
			return result;
		}
	}

	private static void sortResults(Map results) {
		TreeSet sortedResults = new TreeSet(new Comparator() {
			public int compare(Object o1, Object o2) {
				User user1 = (User) o1;
				User user2 = (User) o2;
				/*
				 * ���compareTo���ؽ��0������Ϊ����������ȣ��µĶ��󲻻����ӵ�������ȥ
				 * ���ԣ�����ֱ��������Ĵ��룬������Щ������ͬ�����������ʹ�ӡ��������
				 */
				// returnuser1.value-user2.value;
				// returnuser1.value<user2.value?-1:user1.value==user2.value?0:1;
				if (user1.value < user2.value) {
					return -1;
				} else if (user1.value > user2.value) {
					return 1;
				} else {
					return user1.name.compareTo(user2.name);
				}
			}
		});
		Iterator iterator = results.keySet().iterator();
		while (iterator.hasNext()) {
			String name = (String) iterator.next();
			Integer value = (Integer) results.get(name);
			if (value > 1) {
				sortedResults.add(new User(name, value));
			}
		}
		printResults(sortedResults);
	}

	private static void printResults(TreeSet sortedResults) {
		Iterator iterator = sortedResults.iterator();
		while (iterator.hasNext()) {
			User user = (User) iterator.next();
			System.out.println(user.name + ":" + user.value);
		}
	}

	public static void dealLine(String line, Map map) {
		if (!"".equals(line.trim())) {
			String[] results = line.split(",");
			if (results.length == 3) {
				String name = results[1];
				Integer value = (Integer) map.get(name);
				if (value == null)
					value = 0;
				map.put(name, value + 1);
			}
		}
	}
}
