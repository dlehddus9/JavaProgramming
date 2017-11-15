package ex03;

import java.util.Calendar;

public class Test03 {
    public static void main(String[] args) {

        Calendar now = Calendar.getInstance(); //현재 날짜와 시간 정보를 가지고 생성

        int hourOfDay = now.get(Calendar.HOUR_OF_DAY);
        //System.out.println(hourOfDay);
        if(hourOfDay>=4 && hourOfDay <=12) {
            System.out.println("Good Morning");
        }
        else if(hourOfDay <=18) {
            System.out.println("Good Afternoon");
        }
        else {
            System.out.println("Good Night");
        }
    }
}
