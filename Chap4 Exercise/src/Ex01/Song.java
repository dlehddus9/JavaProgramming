package Ex01;

public class Song {
    private String title; //노래제목
    private String artist; // 가수
    private String album; //노래가 속한 앨범제목
    private String composer[]; // int a[] = new int[5]; 작곡가는 여려명 있을 수있다
    private int year; //노래가 발표된 연도
    private int track; //노래가 속한 트랙번호

    public Song() {

    }
    public Song(String title,String artist,String album,String composer[],int year, int track)
    {
        this.title=title;
        this.artist=artist;
        this.album=album;
        this.composer=composer;
        this.year=year;
        this.track=track;

    }
    public void show() {
        System.out.println("노래제목 :"+title);
        System.out.println("가수 :"+artist);
        System.out.println("앨범 :"+album);
        System.out.print("작곡가 :");
        for(String compo: composer) {
            System.out.print(compo +" " );
        }
        System.out.println();
        System.out.println("발표된 연도:"+year);
        System.out.println("트랙번호 :"+track);


    }


}
