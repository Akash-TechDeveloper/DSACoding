class Solution {
    public int finalValueAfterOperations(String[] op) {
        int x=0;
        for(String s : op){
            if(s.charAt(1)=='+') x++;
            else x--;
        }
        return x;
    }
}