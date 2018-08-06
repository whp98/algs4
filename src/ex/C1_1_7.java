package ex;

public class C1_1_7 {
	public static void main(String[] args) {
		// 用于计算平方根的代码
		double t = 9.0;
		while (Math.abs(t - 9.0 / t) > .001)
			t = (9.0 / t + t) / 2.0; // 最为核心的代码语句
		System.out.printf("%.5f\n", t);

		// 自己实现相同的功能
		// 完善功能代码块
		{
			double wht = 2;
			double res = wht;
			double xx = wht;
			while (Math.abs(res - xx / res) > 0.00001)
				res = (xx / res + res) / 2;
			System.out.printf("%.8f\n", res);
		}

		// 这个代码是用来计算数字的求和
		// 1+2+3+...+n
		{
			int sum = 0;
			for (int i = 1; i < 101; i++)
				for (int j = 0; j < i; j++)
					sum++;
			System.out.println(sum);
		}
		
		//简单求和问题求和次数由for中的条件决定
		{
			int sum = 0;
			for (int i = 1; i < 1000; i *= 2)
				for (int j = 0; j < 1000; j++)
					sum++;
			System.out.println(sum);
		}

	}
}
