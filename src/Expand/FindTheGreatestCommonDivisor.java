package Expand;

import java.util.Scanner;

/*
 * 这段代码用于求解合数的质因数
 * 
 */
//此方法最多可分解包含50个质数的合数，使用的方法是短除法
public class FindTheGreatestCommonDivisor {
	public static void main(String[] args) {
		System.out.println("输入所求正整数:");
		Scanner sc = new Scanner(System.in);
		Long n = sc.nextLong();
		long m = n;
		int flag = 0;
		//预制一个字符串数组用来存放质因数
		String[] str = new String[50];
		
		//用for循环遍历，来求解每一个质因数
		for (long i = 2; i <= n; i++) {
			//当被除余数为零时将这个数字储存到字符串数组中
			if (n % i == 0) {
				str[flag] = Long.toString(i);
				flag++;
				//将n变为除去刚刚符合的质因数
				n = n / i;
				//将数字变小然后重新测试是否是因数
				i--;
			}
		}
		//当因数小于两个时表示该数字是一个质数
		if (flag < 2)
			System.out.println(m + "为质数");
		else {
			//将结果写成 n = 因数1*因数2* ...的形式
			System.out.print(m + "=" + str[0]);
			for (int k = 1; k < flag; k++) {
				System.out.print("*" + str[k]);
			}
			System.out.println("\n" + m + "共有" + flag + "个质因数.");
		}
		sc.close();
	}
}
