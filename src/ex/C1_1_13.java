package ex;

/*
 * 编写矩阵转置代码
 * 参数为a[][] 返回值同样是a[][]
 */
public class C1_1_13 {
	public static void main(String[] args) {
		int[][] a = {{1,4,7},{2,5,8},{10,2,1}};
		print(a);
		System.out.println();
		print(func(a));
	}
	
	
	//二维数组的转置功能
	public static int[][] func(int[][] a) {
		int x = a.length;
		int y = a[0].length;
		int[][] b = new int[y][x];
		for(int i = 0; i<x; i++)
			for(int j = 0; j<y; j++)
				b[j][i] = a[i][j];
		return b;
	}
	
	//打印二维数组功能
	public static void print(int[][] a) {
		int x = a.length;
		int y = a[0].length;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print("\t" + a[i][j]);
			}
			System.out.println();
		}
	}
}
