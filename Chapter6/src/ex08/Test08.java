//못품
package ex08;


import java.util.Scanner;

public class Test08 {
    public static void main(String[] args)  {
        String a;
        String array[];
        Scanner sc = new Scanner(System.in);
        System.out.println("문장을 입력하세요");
        a=sc.nextLine();
        array=a.split(" ");
      /*  for(int i=0 ; i<array.length ; i++)
        {
            System.out.println(array[i]);
        }*/
        for(int i=0 ; i<array.length-1 ; i++)
        {
            if(array[i].compareTo(array[i+1])<0 )
            {
                String temp=array[i];
                array[i]=array[i+1];
                array[i+1]=temp;
            }
        }
        System.out.println(array[0]);



    }
}
