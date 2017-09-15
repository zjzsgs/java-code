package date;

import java.util.Calendar;
import java.util.Date;

public class TestDate {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();//单例模式
		System.out.println(c);
		Date d = c.getTime();//得到日期对象
		System.out.println(d);
		Date d2 = new Date(0);//1970
		System.out.println(d2);
		c.setTime(d2);
		System.out.println(c);		
	}
}
