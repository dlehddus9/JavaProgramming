import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {
        int total=0;
        System.out.println("아무거나입력하세요 -1 입력시 종료");
        Scanner sc = new Scanner(System.in);
        String array[] = new String[20];

        for(int i=0 ; i<array.length;i++)
        {
            System.out.println(+i+1+"번째 수를 입력하세요");
            array[i]=sc.next();
            if(array[i].equals("-1"))
            {
                break;
            }
            try {
                int k = Integer.parseInt(array[i]);
                total = k + total;
                if (k == -1)
                    total = total + 1;
            }
            catch(NumberFormatException e)
            {
                array[i]="0";
            }
        }
        System.out.println(total);
    }
}
