package ex11;

import java.util.Scanner;

// 1 : 가위
// 2 : 바위
// 3: 보
public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int comsu=0;
        int insu=0;

        while (true)
        {
            System.out.println("가위 : 1 바위 : 2 보:3");
            insu=sc.nextInt();
            comsu=(int)(Math.random()*3)+1;

            System.out.println(comsu);
            System.out.println(insu);
            if(comsu==1){
                if(insu==1){
                    System.out.println("무승부");

                }
                else if(insu==2) {
                    System.out.println("사용자가 이겼습니다.");
                }
                else {
                    System.out.println("컴퓨터가 이겼습니다.");
                }
            }
            else if(comsu==2) {
                if(insu==1) {
                    System.out.println("컴퓨터가 이겼습니다.");
                }
                else if(insu==2) {
                    System.out.println("무승부");
                }
                else {
                    System.out.println("사용자가 이겼습니다.");
                }
            }
            else {
                if(insu==1) {
                    System.out.println("사용자가 이겼습니다.");
                }
                else if(insu==2) {
                    System.out.println("컴퓨터가 이겼습니다.");
                }
                else {
                    System.out.println("무승부");
                }
            }
        }
    }
}
