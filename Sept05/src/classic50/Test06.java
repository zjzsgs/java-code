package classic50;

/**
 * 求两个数的最大公约数和最小公倍数
 * 最大公约数 辗转相除法
 * 最小公倍数 = m*n/最大公约数
 * 
 * @author zjz
 * 
 */
public class Test06 {
	public static void main(String[] args) {
		System.out.println("最大公约数：" + maxY(12, 16));
		System.out.println("最小公倍数：" + 12 * 16 / maxY(12, 16));
	}

	private static int maxY(int i, int j) {
		if (i < j) {
			int temp = i;
			i = j;
			j = temp;
		}
		if (i % j == 0) {
			return j;
		} else {
			i %= j;
			return maxY(j, i);
		}
	}
}
