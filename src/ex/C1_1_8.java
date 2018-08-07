package ex;

//这里主要是演示类型的自动转换的方式
public class C1_1_8 {
	public static void main(String[] args) {
		// 输出的是char
		System.out.println('b');
		// 输出的是int 发生了类型自动装换
		System.out.println('b' + 'c');
		// 使用类型强制转换
		System.out.println((char) ('a' + 4));
	}
}
