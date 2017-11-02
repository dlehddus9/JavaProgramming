package OpenChallenge;

public class Book extends Product {
    protected int isbn; //ISBN
    protected String author; //저자
    protected String booktitle; //책 제목

    public void show(int k) {
        System.out.println("상품설명");
        explain=sc.next();
        System.out.println("생산자");
        make=sc.next();
        System.out.println("가격");
        price=sc.nextInt();
        System.out.println("책 제목");
        booktitle=sc.next();
        System.out.println("저자");
        author=sc.next();
        System.out.println("ISBN");
        isbn=sc.nextInt();
        id=k;
    }

    public void showup() {
        super.showup();
        System.out.print("책 제목>>");
        System.out.println(booktitle);
        System.out.print("저자>>");
        System.out.println(author);
        System.out.print("ISBN>>");
        System.out.println(isbn);
        System.out.println();
    }
}
