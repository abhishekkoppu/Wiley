import java.util.Arrays;

public class Anagram {
    public boolean isAnagram(String s, String s1){

        if(s.length()!=s1.length()) return false;

        s=s.toLowerCase();
        s1=s1.toLowerCase();

        char[] c=s.toCharArray();
        char[] c1=s1.toCharArray();

        Arrays.sort(c);
        Arrays.sort(c1);
        return Arrays.equals(c,c1);

    }
    public static void main(String[] args) {
        Anagram anagram=new Anagram();
        String s="hello123";
        String s1="olleh213";
        System.out.println(anagram.isAnagram(s,s1)?s+ " is the Anagram of "+s1: s+" is not Anagram of"+ s1);
    }
}
