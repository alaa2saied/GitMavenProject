import java.util.ArrayList;
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<String> word = new ArrayList<>();
        word.add(0,"apple");
        word.add(1,"car");
        word.add(2,"dog");
        word.add(3,"bat");
        word.add(4,"elephant");
        for (int i=0 ; i<word.size() ; i++ ){
            for (int j=i+1 ; j<word.size() ;j++){
                if (word.get(j).length() < word.get(i).length() ){
                    String temp;
                    temp = word.get(i);
                    word.set(i,word.get(j));
                    word.set(j,temp);
                    break;
                }
            }
        }
        for (int i=0 ; i<word.size() ; i++ ){
            for (int j=i+1 ; j<word.size() ;j++){
                //to compare ascii code of word
                if (word.get(i).compareTo(word.get(j)) > 0 && (word.get(j).length() == word.get(i).length()) ){
                    String temp;
                    temp = word.get(i);
                    word.set(i,word.get(j));
                    word.set(j,temp);

                    break;
                }
            }
        }
        for (int i=0 ; i<word.size();i++){
            System.out.println(word.get(i));
        }
    }
}
