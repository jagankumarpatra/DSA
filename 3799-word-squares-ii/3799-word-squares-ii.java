class Solution {
    public List<List<String>> wordSquares(String[] words) {
        List<List<String>> al=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                       if (j == i) continue;
                for(int k=0;k<words.length;k++){
                                        if (k == i || k == j) continue;
                    for(int l=0;l<words.length;l++){
                          if (l == i || l == j || l == k) continue;
                      if (logicCheck(words[i], words[j], words[k], words[l])) {
                            List<String> square = new ArrayList<>();
                            square.add(words[i]); // top
                            square.add(words[j]); // left
                            square.add(words[k]); // right
                            square.add(words[l]); // bottom
                            al.add(square);
                        }
                    }
                }
            }
        }
         Collections.sort(al, (a, b) -> {
            for (int i = 0; i < 4; i++) {
                int cmp = a.get(i).compareTo(b.get(i));
                if (cmp != 0) return cmp;
            }
            return 0;
        });
        return al;
    }
    private boolean logicCheck(String tp, String lf, String rt, String bt){
        if(tp.charAt(0)==lf.charAt(0) && tp.charAt(3)==rt.charAt(0) && bt.charAt(0)==lf.charAt(3) && bt.charAt(3)==rt.charAt(3)){
            return true;
        }
        return false;
    }
}