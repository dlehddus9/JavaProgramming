//고유한 식별자, 상품설명,생산자,각격정보

package OpenChallenge;

import java.util.Scanner;

public class Product {
    Scanner sc = new Scanner(System.in);
    protected int id;
    protected String explain; //상품설명
    protected String make; //생산자
    protected int price; //가격

    public void showup() {
        System.out.print("상품ID>>");
        System.out.println(id);

        System.out.print("상품 설명>>");
        System.out.println(explain);

        System.out.print("생산자>>");
        System.out.println(make);

        System.out.print("가격>>");
        System.out.println(price);

    }

}
