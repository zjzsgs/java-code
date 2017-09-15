package classic50;
/**
 * 求101-200之间的素数
 * 素数只有两个因子 1和本身
 * @author zjz
 *
 */
public class Test02 {
	public static void main(String[] args) {
		test1();
//		另一种方法
		test2();
	
		
	}

	private static void test1() {
		int num=0;
		int n=0;
		for(int i=101;i<=200;i++){
			int m=0;
			for (int j = 1; j <= i; j++) {
				n=i%j;
				if(n==0){
					m++;
				}
			}
			if(m==2){
				System.out.println(i);
				++num;
			}
			
		}
		System.out.println(num);
	}

	private static void test2() {
		int num=0;
		int i,j;
		for (i = 101; i < 201; i++) {
			for (j = 2; j < i; j++) {
				if(i%j==0){
					break;
				}
			}
			if(i==j){
				System.out.println(i);
				num++;
			}
		}
		System.out.println(num);
	}
}
