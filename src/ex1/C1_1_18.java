package ex1;

public class C1_1_18 {
	public static void main(String[] args) {
		long start=System.currentTimeMillis(); //获取开始时间
		System.out.println(3/2);
		System.out.println(mystery(2, 5));
		System.out.println(mystery(3, 11));
		System.out.println(mystery(2, 3));
//		System.out.println(new_mystery(2, 3));
//		System.out.println(new_mystery(2, 4));
		for(int i = 0; i <= 100 ;i++) {
			System.out.println(new_mystery(2, i));
		}
		long end=System.currentTimeMillis(); //获取结束时间
		System.out.println("程序运行时间： "+(end-start)+"ms");  
		
	}

	// 可以从结果看出mystery可以用来算乘法返回值为a*b
	public static int mystery(int a, int b) {
		if (b == 0)
			return 0;
		if (b % 2 == 0)
			return mystery(a + a, b / 2);
		return mystery(a + a, b / 2) + a;
	}

	//更改代码后明显不知道计算的是什么
	public static int new_mystery(int a, int b) {
		if (b == 0)
			return 1;
		if (b % 2 == 0)
			return mystery(a * a, b / 2);
		return mystery(a * a, b / 2) * a;
	}
}
