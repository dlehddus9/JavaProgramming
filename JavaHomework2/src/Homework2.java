// 65~90 A~Z  97~122 a~z
public class Homework2 {
    public static void main(String[] args) {
        int count =0;
        String a = "abcdefg hij jj";

        int big[] = new int[26];
        int small[] = new int[26];
        String splitStr[] = a.split("\\s+");
        for(int i=0; i<splitStr.length; i++)
        {

            System.out.print(splitStr[i] +" ");
        }
        System.out.println();
        System.out.println("단어 의 갯수는"+splitStr.length);

        System.out.println("a~Z 까지의 갯수 출력");


        for(int k=65 ; k<=90 ; k++) //A~Z
        {
            for(int j=0 ; j<a.length(); j++) //String a 의길이
            {
                if(a.charAt(j)==k) {
                    big[k-65]++;
                }
            }

        }
        for(int k=97 ; k<=122 ; k++) //a~z
        {

            for(int j=0 ; j<a.length(); j++) //String a 의길이
            {
                if(a.charAt(j)==k) {
                    small[k-97]++;
                }
            }

        }
        for(int i=0 ; i<=25 ; i++)
        {
            System.out.print((char)(i+97) +" : " +small[i]+" ");
            System.out.print((char)(i+65) +" : " +big[i]+" ");
            System.out.println("합은 "+(int)(small[i]+big[i]) +" 입니다.");
        }


    }
}
