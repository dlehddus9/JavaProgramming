package ex07;

import java.io.IOException;
import java.io.InputStreamReader;

public class Test07 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);

        System.out.println("문자를 입력하세요.");
        int c=isr.read();
        while(c!=-1)
        {
            char d=(char)c;
            System.out.println(d);
            c=isr.read();

            if(c=='\n')
            {
                //int array[]=
            }
        }

    }
}
