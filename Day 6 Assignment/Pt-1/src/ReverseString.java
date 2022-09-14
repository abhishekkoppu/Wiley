public class ReverseString {

    public String reverseString(String s){
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        ReverseString reverse=new ReverseString();
        String s="This is a string";
        System.out.println(reverse.reverseString(s));
    }
}
