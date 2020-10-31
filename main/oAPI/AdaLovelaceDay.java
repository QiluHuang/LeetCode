package oAPI;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class AdaLovelaceDay {

    public static int getDate(int year) {
        Calendar calendar = new GregorianCalendar();  // ����һ��������������Ϊ���
        calendar.set(Calendar.YEAR, year); /// �����������Ϊ1��1��
        calendar.set(Calendar.MONTH, Calendar.OCTOBER); /// �����������Ϊ1��1��
        calendar.set(Calendar.DAY_OF_WEEK_IN_MONTH, 2);   // �ڼ���
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);

        return calendar.get(Calendar.DATE);
    }

    public static void main(String[] args) {
        for (int i = 2016; i < 2031; i++) {
            System.out.println("YEAR: " + i + "  Date: " + getDate(i));
        }
    }
}
