package classic50;

/**
 * 每对兔子从出生第三个月后不停生一对兔子
 * 规律：1、1、2、3、5、8
 * @author zjz
 *
 */
public class Test01 {
	public static void main(String[] args) {
//		计算12个月
		long arr[] = new long[12];
		arr[0]=arr[1]=1;
		System.out.println("第1个月"+arr[0]+"对兔子。");
		System.out.println("第2个月"+arr[1]+"对兔子。");
		for (int i = 2; i < arr.length; i++) {
			arr[i]=arr[i-1]+arr[i-2];
			System.out.println("第"+(i+1)+"个月"+arr[i]+"对兔子。");
		}
	}

}
