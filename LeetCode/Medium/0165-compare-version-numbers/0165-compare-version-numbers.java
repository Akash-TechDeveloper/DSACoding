class Solution {
    static{
        for(int i=0;i<300;i++) compareVersion("1","1"); 
    }
    public static int compareVersion(String version1, String version2) {
        String [] v1 = version1.split("\\.");
        String [] v2 = version2.split("\\.");
        int n1 = v1.length;
        int n2 = v2.length;
        int i = 0;
        while(i < n1 || i < n2){
            int num = 0;
            if (i < n1) {
                num = Integer.parseInt(v1[i]);
            }
            int num2 = 0;
            if (i < n2) {
                num2 = Integer.parseInt(v2[i]);
            }
             i++;
            if(num<num2) return -1;
            else if (num>num2) return 1;
           
        }
        return 0;
    }
}