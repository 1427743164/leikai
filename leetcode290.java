public class leetcode290 {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split("\\s+");
        if(pattern.length() != words.length){
            return false;
        }
        Map<Character,String> charToStr=new HashMap<>();
        Map<String,Character> strToChar=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char currC=pattern.charAt(i);
            String currS=words[i];
            if(charToStr.containsKey(currC) && !currS.equals(charToStr.get(currC))){
                return false;
            }
            if(strToChar.containsKey(currS) && currC!=strToChar.get(currS)){
                return false;
            }
            charToStr.put(currC,currS);
            strToChar.put(currS,currC);
        }
    return true;
    }   
}