package ex1;

/*
 * 实现静态方法lg()
 * 接受参数N返回不大于log2N的最大整数
 * 
 */
public class C1_1_14 {
	public static void main(String[] args) {
		System.out.println(lg(4));
	}

	public static int lg(int N) {
		int x = 1;
		int count = 0;
		while (x * 2 <= N) {
			x *= 2;
			count++;
		}
		return count;
	}
}
