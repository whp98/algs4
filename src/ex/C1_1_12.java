package ex;
//没有啥意义的代码，只是跑跑看看结果
public class C1_1_12 {
	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i < 10; i++)
			a[i] = 9 - i;
		for (int i = 0; i < 10; i++)
			a[i] = a[a[i]];
		for (int i = 0; i < 10; i++)
			System.out.println(i);
		System.out.println(a);
	}
}
