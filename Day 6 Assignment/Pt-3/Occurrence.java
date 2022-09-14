public class Occurrence {

    public int checkOccurrence(String s, char c){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c) count++;
        }
            return count;
    }


    public static void main(String[] args) {
        Occurrence occurrence=new Occurrence();
        String s="This program counts occurrence of char in a string";
        System.out.println(occurrence.checkOccurrence(s, 'a'));
    }
}
