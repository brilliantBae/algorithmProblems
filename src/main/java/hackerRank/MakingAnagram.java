package hackerRank;

public class MakingAnagram {
    public static int decide(String a, String b){
        int match  = 0;
        for(int i=0; i < a.length(); i++){
            for(int j=0; j < b.length(); j++){
                if(a.charAt(i) == b.charAt(j)) match++;
            }
        }
        return a.length() + b.length() - match*2;
    }



}
