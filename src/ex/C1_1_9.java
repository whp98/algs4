package ex;

//实现从整数转换为二进制的字符串的形式
public class C1_1_9 {
	public static void main(String[] args) {
		int N = 10;
		// 直接使用标准库的方法实现整数到二进制字符串的转换
		System.out.println(Integer.toBinaryString(N));

		// 使用简洁的实现来完成目的
		{
			String s = "";
			for (int n = N; n > 0; n /= 2)
				s = (n % 2) + s;
			System.out.println(s);
		}
	}
}
