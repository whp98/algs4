package ex;

public class C1_1_4 {
	public static void main(String[] args) {
		double a = 0, b = 0, c = 0;
		// if(a > b)then c = 0;
		// 错误原因是Java没有then可以使用
		// if a > b{
		// c =0;
		// }
		// 错误原因是条件必须使用括号来包含
		if (a > b)
			c = 0;
		// if(a>b)c=0 else b= 0;
		// 错误原因是if中的语句没有分号结尾
		System.out.println("a=" + a + "  b=" + b + "  c=" + c);
	}
}
