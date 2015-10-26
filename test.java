package email;

import java.util.ArrayList;
import java.util.List;

public class test {


  public static List<String> wordList = new ArrayList<String>();;

  public static void main(String args[]) {
    int count =0;
    
    wordList.add("2015-10-10");
   wordList.add("2015-11-10");
   
    count = wordList.size();
    if (count ==1 ) {
    System.out.println(wordList.get((0)));
    } else if (count >= 2) {
      System.out.println(wordList.get(0) + " AND " + wordList.get(wordList.size()-1));
    }
    
    
  }
  
}
