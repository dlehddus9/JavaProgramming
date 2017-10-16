public class test {
    public static boolean isNumber(String str) {

        //먼저 유효성 체크 검사부터....
        if(str==null || str.equals(""))
            return false;


        //이제부터 실제 변수의 문자열을 하나하나 확인해보는 식....
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch<'0' || ch>'9') {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="123";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));

        str = "1234o";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));
    }
}
