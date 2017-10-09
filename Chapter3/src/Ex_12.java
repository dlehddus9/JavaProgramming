//반복문을 이용하여 369게임에서 박수를 쳐야 하는 경우의 수를 순서대로 화면에 출력해보자. 1부터 시작하며 99까지만 한다. 실행 사례는 다음 그림과 같다.
/*
3 박수한번
6 박수한번
33 박수두번
*/

public class Ex_12 {
    public static void main(String[] args) {
        for(int i=1 ; i<=99 ; i++)
        {
            int clap=0;
            int a=i/10;  //23 들어오면 a에 2 십의자리
            int b=i%10; //23 들어오면 b에 3  일의자리




            if(a%3==0 && a!=0)
            {
                clap++;
            }

            if(b%3==0 && b!=0)
            {
                clap++;
            }

            if(clap==1)
            {
                System.out.println(+i+" 박수짝");
            }
            else if(clap==2)
            {
                System.out.println(+i+" 박수짝짝");
            }
            else {
                System.out.println(+i+" 아무것도아니야");
            }
        }

    }
}
