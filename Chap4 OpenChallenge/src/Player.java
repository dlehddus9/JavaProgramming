public class Player {

    private String name;
    private String word;


    public void sayword(String word) {
        this.word=word;

    }
    public void succeed(String word) { //name 넘어오는게 마지막 글자 비교 word 첫번 째 글자 비교
        int lastIndex=word.length()-1; //아버지의 마지막 인덱스
        char lastChar = word.charAt(lastIndex); //아버지의 마지막글자 지
        char firstChar = this.word.charAt(0);
        if(lastChar!=firstChar)
        {
            System.out.print(this.name+"님이 젔습니다.");
            System.exit(0);
        }



    }
    public void setName(String name) {
        this.name=name;
    }
    public String getName() {
        return this.name;
    }

    public String getWord() {
        return this.word;
    }

}
