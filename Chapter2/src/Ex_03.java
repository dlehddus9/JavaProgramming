//키보드에서 정수로 된 돈의 액수를 입력받아 오만원권,만원권, 천원권 500원 짜리 동전,100원짜리 동전, 50워짜리동전 10원짜리 동전 1원짜리 동전 각 몇개로 변환 되는지 출력하라.
// 예를들어, 65370이 입력되면 오만원권 1매,만원권 1매,천원권 5매,100원짜리 동전3개, 50원짜리 동전 1개, 10원짜리 동전2개이다.


import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        int a; //오만원권
        int b; //만원권
        int c; //천원권
        int d; //100원짜리
        int e; //50원짜리
        int f; //10원짜리
        int g; //1원짜리
        Scanner sc= new Scanner(System.in);
        System.out.println("돈 액수를 입력해주세요");
        int k=sc.nextInt(); ///돈을 입력받음
        a=k/50000; //5만원권 1장 a=1
        k=k-a*50000; //15370
        b= (k)/10000; // 15370 // 10000 = 1 b=1
        k=k-b*10000; //5370
        c= k/1000; //5370/1000 =5,  c=5
        k=k-c*1000; //370
        d=k/100; // 370/100=3 , d=3
        k=k-d*100; //k=70
        e=k/50; // 70/50 =1 e=1
        k=k-e*50; //20
        f=k/10; //20/10=2 f=2
        k=k-f*10;
        g=k/1;

        System.out.print("50000원 :" +a+" 10000원 :"+b+" 1000원 : "+c+ " 100원 :"+d+" 50원 :"+e+" 10원 :"+f+ " 1원 :" +g+"입니다.");





    }
}
