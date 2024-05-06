package Arrays;

import java.util.HashMap;

/**
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
 *
 * Each letter in magazine can only be used once in ransomNote.
 *
 *
 *
 * Example 1:
 *
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 * Example 2:
 *
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 * Example 3:
 *
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 */
public class RansomNote {

    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "ab";
        System.out.println(canConstruct1(ransomNote,magazine));
    }

    /**
     * Naive solution
     * @param ransomNote
     * @param magazine
     * @return
     */
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0;i<magazine.length();i++){
            char c =magazine.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }

        for(int i=0;i<ransomNote.length();i++){
            char c =ransomNote.charAt(i);
            if(map.containsKey(c) && map.get(c)>0){
                map.put(c,map.get(c)-1);
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static boolean canConstruct1(String ransomNote, String magazine) {
        int[] alpha = new int[26];
        for(char c : ransomNote.toCharArray()){
           int i=magazine.indexOf(c, alpha[c%26]);
           if(i==-1){
               return false;
           }
           alpha[c%26] = i+1;
        }
        return true;
    }


}
