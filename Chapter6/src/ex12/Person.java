package ex12;

import java.io.IOException;
import java.io.InputStreamReader;

public class Person  {
    private String name;
    private int array[] =new int[3];
    private int same=0;
    InputStreamReader isr = new InputStreamReader(System.in);
    public Person(String name){
        this.name=name;
    }

    public void show() throws IOException {
        System.out.println(name+"님 차례입니다!!");
        System.out.println("Enter 를 누르시면 실행됩니다.");
        int c=isr.read();
        if(c=='\n')
        {
            for(int i=0 ; i<array.length ; i++)
            {
                array[i] = (int)(Math.random()*3)+1;
                System.out.println(array[i]);


            }
            for(int i=0; i<array.length-1; i++)
            {
                for(int j=i+1 ; j<array.length ; j++)
                {
                    if(array[i]==array[j])
                    {
                        same++;
                    }
                }
            }
            if(same==3)
            {
                System.out.println(name+"님이 이기셨습니다. ㅊㅋㅊㅋ");
                System.exit(0);
            }
            else {
                same=0;
            }
        }
    }
}
