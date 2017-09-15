package classic50;
/**
 * 打印水仙花数
 * 153=1^3+5^3+3^3
 * @author zjz
 *
 */
public class Test03 {
	public static void main(String[] args) {
		test1();
		//三层for循环
		test2();
	}

	private static void test2() {
		for (int i = 1; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				for (int k = 0; k < 9; k++) {
					int sum=i*i*i+j*j*j+k*k*k;
					if(sum==(i*100+j*10+k)){
						System.out.println(sum);
					}
				}
			}
		}
	}

	private static void test1() {
		int l,m,n;
		int sum=0;
		for (int i = 100; i < 1000; i++) {
			l=i/100;// /100得百位数
			m=(i-100*l)/10;// 去掉百位/10得到十位数
			n=i%10;// %10得到个位数
			sum=l*l*l+m*m*m+n*n*n;
			if(sum==i){
				System.out.println(i);
			}
		}
	}

}
