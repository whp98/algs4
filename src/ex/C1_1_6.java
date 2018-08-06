package ex;

/*
 * 这是求费波那西数列的算法
 */
public class C1_1_6 {
	public static void main(String[] args) {
		int f = 0;
		int g = 1;
		for (int i = 0; i <= 15; i++) {
			System.out.println(f);
			f = f + g;
			g = f - g;
		}
	}
}
