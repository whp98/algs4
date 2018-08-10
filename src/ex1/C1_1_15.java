package ex1;

import java.sql.Array;
import java.util.Arrays;

/*
 * 
 * 实现histogram()
 * 接受一个整数a[]和一个整数M为参数并且返回一个大小为M的数组
 * 其中第i个元素的值为整数i在参数数组中出现的次数
 * 如果a[]中的值均在0 - M-1之间则返回数组的和应该等于a.length
 *
 */
public class C1_1_15 {
	public static void main(String[] args) {
		int[] t = { 4, 5, 4, 5, 6, 66, 1, 11, 5, 56, 6 };
		int[] s = { 4, 5, 6, 8, 9, 6, 4, 1, 4, 6, 9 };
		int[] a = histogram(s, 10);
		System.out.println(Arrays.toString(a));
		
	}

	public static int[] histogram(int[] a, int M) {
		int[] arry = new int[M];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < M; j++) {
				if (j == a[i])
					arry[j]++;
			}
		}
		return arry;
	}
}
