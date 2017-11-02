package OpenChallenge;

import java.util.Scanner;

public class ProductInfo {
    public static int i=0;
    public static int k=0;
    public static int j=0;
    public static void main(String[] args) {

        Book book[] = new Book[10];
        CompactDisc com[] = new CompactDisc[10];
        ConversationBook con[] = new ConversationBook[10];
        for(int i=0 ; i<10 ;i++)
        {
            book[i]=new Book();
            com[i]=new CompactDisc();
            con[i]=new ConversationBook();
        }
        int a,b;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            if(i+j+k==9)
                break;
            System.out.println("상품 추가(1),모든 상품 조회(2),끝내기(3)");
            a=sc.nextInt();


            switch (a){
                case 1:
                    System.out.println("상품 종류 책(1),음악cd(2),회화책(3)");
                    b=sc.nextInt();
                    if(b==1) {
                        book[i].show(i + j + k);
                        i++;
                    }
                    if(b==2) {
                        com[j].show(i+j+k);
                        j++;
                    }
                    if(b==3){
                        con[k].show(i+j+k);
                        k++;
                    }
                    break;
                case 2:

                    for(int m=0 ; m<i ; m++)
                     {
                        book[m].showup();
                    }
                    for(int m=0 ; m<j ; m++)
                    {
                        com[m].showup();
                    }
                    for(int m=0 ; m<k ; m++)
                    {
                        con[m].showup();
                    }

                    break;
                case 3: System.exit(0);
                    break;
                default: System.out.println("잘못입력하셨습니다.");
                    break;
            }
        }
    }
}