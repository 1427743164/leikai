
public class leetcode804 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] mos = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for (String word : words) {
            StringBuilder builder = new StringBuilder();
            for (char c : word.toCharArray()) {
                builder.append(mos[c - 'a']);
            }
            set.add(builder.toString());
        }
        return set.size();
    }
}




