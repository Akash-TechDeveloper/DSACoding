class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> ans = new ArrayList<>();
        String f = "qwertyuiop";
        String s = "asdfghjkl";
        String t = "zxcvbnm";
        for(String x : words){
             if(isinrow(x,f) || isinrow(x,s) || isinrow(x,t))
         ans.add(x);
       } 
       return ans.toArray(new String[0]);
    }
    private boolean isinrow(String s,String row){
      for(char c:s.toCharArray()){
        if(row.indexOf(Character.toLowerCase(c))==-1){
            return false;
        }
      }
      return true;
    }
        
}