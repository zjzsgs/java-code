package date;

import java.util.Date;

public class Date01 {
	public static void main(String[] args) {
		Date d1 = new Date();//直接得到的日期 可读性较差 
		System.out.println(d1);//Thu Aug 31 14:04:10 CST 2017
		System.out.println(d1.toString());//Thu Aug 31 14:07:05 CST 2017
		System.out.println(d1.getTime());//long 1504159674430		
		System.out.println(System.currentTimeMillis());//==new Date().getTime() 理论上
		Date d2 = new Date(5000);//5秒之后
		System.out.println(d2);//Thu Jan 01 08:00:05 CST 1970
		Date d3 = new Date(0);
		System.out.println(d3);//Thu Jan 01 08:00:00 CST 1970 ==d1
	}

}
