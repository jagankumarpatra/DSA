class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < weights.length; i++) {
            char letter = (char) ('a' + i);
            hm.put(letter,weights[i]);
        }
        // String res = "";
         StringBuilder res = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            int no = 0;
            char[] ch = words[i].toCharArray();
            for (int c = 0; c < ch.length; c++) {
                // if (hm.containsKey(c)) {
                    no += hm.get(ch[c]);
                // }
            }
            no =no%26;
                          char mappedChar = (char) ('z' - no);
            res.append(mappedChar);

            // res+=hm.get(no);
        }
        return res.toString();
    }
}