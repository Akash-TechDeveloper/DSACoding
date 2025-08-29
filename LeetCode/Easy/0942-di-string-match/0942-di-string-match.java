class Solution {
    public int[] diStringMatch(String s) {
        int j=0;
        int d=s.length();
        int x=0;
        int arr[] = new int [d+1];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='I'){
                arr[x]=j;
                j++;
            }
            else {
                arr[x]=d;
                d--;
            }
            x++;
        }
        if(s.charAt(s.length()-1)=='D'){
            arr[x]=d;
        }
        else arr[x]=j;
        return arr;
    }
}