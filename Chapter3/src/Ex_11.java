//배열과 반복문을 이용하여 프로그램을 작성해보자. 키보드에서 정수로 된 돈의 액수를 입력받아 오만원권, 만원권,천원권,500원짜리 동전,100워짜리도 동전, 50원짜리 동전, 10워짜리 동전,1원짜리 동전이 각 몇개로 변환 되는지 출력하라.
//예를 들어 65370이 입력되면 오만 원권 1매, 만원권 1매, 천원권 5매, 100원짜리 동전3개, 50원짜리 동전 1개 10원짜리 동전 2개이다. 이때 반드시 다음의 배열을 사용하고 반복문을 작성하라.
// int unit[] = {50000,10000,1000,500,100,50,10,1}; 환산할 돈의 종류


import java.util.Scanner;

public class Ex_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int unit[] = {50000,10000, 1000,500,100,50,10,1}; //unit 의 0  , 1 ,2 .... 배열순서대로들어감
        int unit1[] = {50000,10000, 1000,500,100,50,10,1};
        System.out.println("돈을 입력해주세요");
        int money=sc.nextInt(); //65370 을 받았다고가정

        for(int i=0; i<unit.length ; i++)
        {
            unit[i]=money/unit1[i];


        }
        for(int i=0; i<unit.length; i++)
        {
            System.out.println(unit1[i]+" : "+ unit[i]);
        }








    }
}
