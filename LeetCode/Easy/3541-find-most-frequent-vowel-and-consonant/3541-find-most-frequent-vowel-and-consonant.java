class Solution {
    public int maxFreqSum(String s) {
        int max =0;int max1=0;
        int[] freq = new int[128];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                max=Math.max(max,++freq[ch]);
            }
            else{
                max1 = Math.max(max1,++freq[ch]);
            }
        }
        return max+max1;
    }
}