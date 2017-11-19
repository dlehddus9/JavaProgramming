package quiz;

// 65~90 A~Z  97~122 a~z
// a,n 포함하는단어(A,N 둘다 ㄱㅊ)
// 65:A 97:a
// 78 :N  110 : n
public class Test01 {
    public static void main(String[] args) {
        int count =0;
        String a = "The World Wide Web (abbreviated as the Web or WWW) is a system of Internet servers that supports hypertext to access several Internet protocols on a single interface Almost every protocol type available on the Internet is accessible on the Web. This includes e-mail, FTP, Telnet, and Usenet News. In addition to these, the World Wide Web has its own protocol: HyperText Transfer Protocol, or HTTP. These protocols will be explained later in this handout. The World Wide Web provides a single interface for accessing all these protocols. This creates a convenient and user-friendly environment. It is no longer necessary to be conversant in these protocols within separate, command-level environments. The Web gathers together these protocols into a single system. Because of this feature, and because of the Web's ability to work with multimedia and advanced programming languages, the World Wide Web is the fastest-growing component of the Internet. The operation of the Web relies primarily on hypertext as its means of information retrieval. HyperText is a document containing words that connect to other documents. These words are called links and are selectable by the user. A single hypertext document can contain links to many documents. In the context of the Web, words or graphics may serve as links to other documents, images, video, and sound. Links may or may not follow a logical path, as each connection is programmed by the creator of the source document. Overall, the WWW contains a complex virtual web of connections among a vast number of documents, graphics, videos, and sounds. Producing hypertext for the Web is accomplished by creating documents with a language called HyperText Markup Language, or HTML. With HTML, tags are placed within the text to accomplish document formatting, visual features such as font size, italics and bold, and the creation of hypertext links. Graphics may also be incorporated into an HTML document. HTML is an evolving language, with new tags being added as each upgrade of the language is developed and released. The World Wide Web Consortium, led by Web founder Tim Berners-Lee,  coordinates  the  efforts of   standardizing HTML. The World Wide Web consists of files, called pages or home pages, containing links to documents and resources throughout the Internet. The Web provides a vast array of experiences including multimedia presentations, real-time collaboration, interactive pages, radio and television broadcasts, and the automatic \\\"push\\\" of information to a client computer. Programming languages such as Java, JavaScript and Visual Basic are extending the " + "capabilities of the Web. An increasing amount of information on the Web is served dynamically from content stored in databases. The Web is therefore not a fixed entity, but one that is in a constant state of flux.";





        String splitStr[] = a.split("\\s+"); //splitStr[] 에 단어 하나하나 다 담음
        for(int i=0; i<splitStr.length; i++)
        {

            System.out.print(splitStr[i] +" ");
        }



        System.out.println();
        System.out.println("단어 의 갯수는"+splitStr.length);

        for(int i =0 ; i < splitStr.length ; i++) //449
        {
             for(int k=0 ; k<splitStr[i].length() ; k++)
             {
                 if(splitStr[i].charAt(k)==65 || splitStr[i].charAt(k)==97) //a 가 포함되나 체크
                 {
                     System.out.println(splitStr[i]);for(int j=0 ; j<splitStr[i].length() ; j++)
                     {
                         if(splitStr[i].charAt(j)==78 || splitStr[i].charAt(j)==110) //n 이 포함되나 체크
                         {
                             count++;
                             j=splitStr[i].length();
                             k=splitStr[i].length();
                             System.out.println(splitStr[i]);


                         }
                     }
                 }
             }
        }
        System.out.println("a 와 n 을 포함하는 단어의 갯수는"+count+ "  개입니다.");









    }
}