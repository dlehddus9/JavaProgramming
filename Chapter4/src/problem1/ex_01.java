package problem1;/*노래를 나타내는 Song이라는 클래스를 설계하라. Song클래스는 다음과 같은 필드를 갖는다.
        1.노래의 제목을 나타내는 title
        2.가수를 나타내는 artist
        3.노래가 속한 앨범 제목을 나타내는 album
        4.노래의 작곡가를 나타내는 composer, 작곡가는 여러 명 있을 수 있다.
        5.노래가 발표된 연도를 나타내는 year
        6.노래가 속한 앨범에서의 트랙 번호를 나타내는 track
        생성자는 기본생성자와 모든 필드를 초기화하는 생성자를 작성하고, 노래의 정보를
        화면에 출력하는 Show() 메소드도 작성하라. ABBA의 "Dancing Queen" 노래를 Song 객
        체로 생성하고 Show()를 이용하여 이 노래의 정보를 출력하는 프로그램을 작성하라*/
// int array[] = new int[];


class Song {
    private String title;
    private String artist;
    private String album;
    private String composer[];
    private int year;
    private int track; //앨범에서의 트랙번호

    Song() {
        this.title="제목없음";
        this.artist="아티스트 없음";
        this.album="앨범없음";
        this.composer=new String[]{"작곡가 없음"};
        this.year=0;
        this.track=0;

    }
    Song(String title,String artist, String album,String composer[], int year, int track) {
        this.title=title;
        this.artist=artist;
        this.album=album;
        this.composer=composer;
        this.year=year;
        this.track=track;
    }
    public void show() {
        System.out.println(title);
        System.out.println(artist);
        System.out.println(album);
        for(int i=0 ; i<composer.length;i++)
        {
            System.out.print(composer[i]+" ");
        }
        System.out.println();
        System.out.println(year);
        System.out.println(track);

    }

}

public class ex_01 {
    public static void main(String[] args) {
        Song s1=new Song();
        s1.show();
        System.out.println();
        String array[]={"a","b","c"};
        Song s2=new Song("Dancing queen","abba","mylove",array,2017,2);
        s2.show();

    }




}
