package ex12;

import java.io.IOException;
import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Player 1 의 이름을 입력하세요 :");
        String a=sc.next();
        System.out.println("Player 2 의 이름을 입력하세요 :");
        String b=sc.next();
        Person a1= new Person(a); //이름입력받아 perosn 에전달;
        Person b1= new Person(b);
        while(true) {
            a1.show();
            b1.show();
        }
    }
}
