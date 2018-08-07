package ex;

//一种用于处理数字的递归算法
public class C1_1_16 {
	public static void main(String[] args) {
		System.out.println(exR1(45));
	}

	public static String exR1(int n) {
		if (n <= 0)
			return "";
		return exR1(n - 3) + n + exR1(n - 2) + n;
	}
}
