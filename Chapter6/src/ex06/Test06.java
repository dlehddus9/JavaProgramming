package ex06;

import java.io.InputStreamReader;

public class Test06 {
    public static void main(String[] args) throws Exception{

        int a=0;
        InputStreamReader isr = new InputStreamReader(System.in);

        System.out.println("Please enter a piece of data : ");
        int byteData = isr.read();

        while(byteData != -1) {
            char c =(char)byteData;
            //System.out.println("Byte :" +c);
            if(c>=65 && c<=96)
            {
                a++;
            }
            byteData = isr.read();

            if(byteData ==-1) {
                System.out.println("Done!");
                break;
            }
        }
        System.out.println(" 대문자 갯수는" +a+ "입니다.");

    }
}
