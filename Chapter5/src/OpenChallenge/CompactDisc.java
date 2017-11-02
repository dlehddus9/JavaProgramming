package OpenChallenge;

public class CompactDisc extends Product {
    private String albumtitle;
    private String singer;

    public void show(int k) {
        System.out.println("상품설명");
        explain=sc.next();
        System.out.println("생산자");
        make=sc.next();
        System.out.println("가격");
        price=sc.nextInt();
        System.out.println("앨범 제목");
        albumtitle=sc.next();
        System.out.println("가수");
        singer=sc.next();
        id=k;
    }
    public void showup() {
        super.showup();
        System.out.print("앨범 제목>>");
        System.out.println(albumtitle);
        System.out.print("가수>>");
        System.out.println(singer);
        System.out.println();
    }

}
