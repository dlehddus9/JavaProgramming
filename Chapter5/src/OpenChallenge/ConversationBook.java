package OpenChallenge;

public class ConversationBook extends Book{
    private String language;

    public void show(int k) {
        System.out.println("상품 설명");
        explain=sc.next();
        System.out.println("생산자");
        make=sc.next();
        System.out.println("가격");
        price=sc.nextInt();
        System.out.println("책 제목");
        booktitle=sc.next();
        System.out.println("저자");
        author=sc.next();
        System.out.println("언어");
        language=sc.next();
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
        System.out.print("상품 설명>>");
        System.out.println(explain);
        System.out.print("ISBN>>");
        System.out.println(isbn);
        System.out.println();

    }
}
