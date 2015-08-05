package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RandomTest {
	private static ArrayList<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {

		/*
		 * int[] t2={1,2,3}; int[] t1={1,3,2}; Arrays.sort(t1);
		 * System.out.println(t2); System.out.println(myequals(t1,t2));
		 */

		long count = 0l;
		for (int k = 0; k < 10; k++) {
			int[] tem1 = cr();
			int[] tem2 = cr();
			Arrays.sort(tem1);
			Arrays.sort(tem2);

			while (!myequals(tem1, tem2)) {
				tem1 = cr();
				tem2 = cr();
				Arrays.sort(tem1);
				Arrays.sort(tem2);
				count++;
				if (count == 10000 || count == 10 || count == 100
						|| count == 100000 || count == 10000000
						|| count == 100000000 || count == 1000000000) {
					System.out.println(count);
				}
			}
			for (int i = 0; i < tem1.length; i++) {
				System.out.print(tem1[i] + "-");
			}
			System.out.println("-");
			for (int i = 0; i < tem2.length; i++) {
				System.out.print(tem2[i] + "-");
			}
			System.out.println(count);
			count=0;
		}
	}

	public static int[] cr() {
		int[] tem = new int[7];
		Random random = new Random();

		for (int i = 0; i < 33; i++) {
			list.add(i);
		}

		for (int i = 0; i <= 6; i++) {
			int index = random.nextInt(list.size());
			tem[i] = list.get(index);
			list.remove(index);

		}
		list.removeAll(list);
		return tem;
	}

	public static boolean myequals(int[] a, int[] b) {
		for (int i = 0; i != (a.length < b.length ? a.length : b.length); i++)
			if (a[i] != b[i])
				return false;
		return true;
	}

}
