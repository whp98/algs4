package ex;
/*
 * 编写程序实现判断两个double是否都位于0.0和1.0之间
 */
public class C1_1_5 {
	public static void main(String[] args) {
		func(0.5, 0.7);
		func(0.2, 3.0);
	}
	public static void func(double a, double b) {
		if(a<1.0 && a>0.0 && b<1.0 && b>0.0) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}
