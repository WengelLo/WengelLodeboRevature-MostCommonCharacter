import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        char maxappearchar = ' ';
        //String[] splitChar = str.split(" ");
        for(char c: str.toCharArray()){
            Integer count = charCount.get(c);
              if ( count == null )
              {
                  count = 0;
              }       

              charCount.put(c, count + 1);
            
        }

        int maxValueInMap=(Collections.max(charCount.values()));  // This will return max value in the Hashmap    
            for (Entry<Character, Integer> entry : charCount.entrySet())
            {  
                if (entry.getValue()==maxValueInMap)
                {
                    System.out.println("the max char is : " + entry.getKey() + "  and displayed  " +maxValueInMap+ "  times");     // Print the key with max value
                    maxappearchar = entry.getKey();
                }

            }
            return maxappearchar;
    }
}
