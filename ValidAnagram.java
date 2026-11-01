class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length() )
          return false;

        int freq[] = new int[26];

        for(Character ch :s.toCharArray()){
            freq[ch - 'a'] += 1;
        }

        for(Character ch : t.toCharArray()){
            freq[ch - 'a'] -= 1;
        }
       

       for(int counters : freq){
        if(counters != 0){
            return false;
        }
       }

         return true;
        
    }
}
