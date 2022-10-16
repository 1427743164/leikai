public class leetcode748 {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        String ans = "";
        List<String> ansList = new ArrayList<>();
        Integer minLength = Integer.MAX_VALUE;
        int[] shortestCompletingWordChars = new int[26];
        for (char ch : licensePlate.toCharArray()) {
            if (Character.isLetter(ch)) {
                shortestCompletingWordChars[Character.toLowerCase(ch) - 'a']++;
            }
        }
        for (String word : words) {
            int[] temp = shortestCompletingWordChars.clone();
            for (char wordChar: word.toCharArray()) {
                if (temp[Character.toLowerCase(wordChar) - 'a'] > 0) {
                    temp[Character.toLowerCase(wordChar) - 'a']--;
                }
            }
            boolean checkflag = true;
            for (int i = 0; i < 26; i++) {
                if (temp[i] > 0) {
                    checkflag = false;
                    break;
                }
            }

            if (checkflag && word.length() < minLength) {
                minLength = Math.min(minLength, word.length());
                ansList.add(word);
            }
        }

        for (String t : ansList) {
            if (t.length() == minLength) {
                ans = t;
                break;
            }
        }

        return ans;
    }
}

