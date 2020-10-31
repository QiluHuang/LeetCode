package oAPI;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class AdaLovelaceDay {

    public static int getDate(int year) {
        Calendar calendar = new GregorianCalendar();  // 定义一个日历，变量作为年初
        calendar.set(Calendar.YEAR, year); /// 设年初的日期为1月1日
        calendar.set(Calendar.MONTH, Calendar.OCTOBER); /// 设年初的日期为1月1日
        calendar.set(Calendar.DAY_OF_WEEK_IN_MONTH, 2);   // 第几周
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);

        return calendar.get(Calendar.DATE);
    }

    public static void main(String[] args) {
        for (int i = 2016; i < 2031; i++) {
            System.out.println("YEAR: " + i + "  Date: " + getDate(i));
        }
    }
}
