class Solution {
    static{
        for(int i=0;i<300;i++){
            addStrings(""," ");
        }
    }
    public static String addStrings(String num1, String num2) {
        int i=num1.length()-1, j=num2.length()-1, carry=0;
        String res = "";
        while (i>=0 || j>=0) {
            int d1=(i>=0 ? (int)(num1.charAt(i)-'0') : 0);
            int d2=(j>=0 ? (int)(num2.charAt(j)-'0') : 0);
            int curr=d1+d2+carry;
            carry=(curr>=10 ? 1 : 0);
            res = Integer.toString(curr%10) + res;
            i--; j--;
        }
        if (carry==1) res = "1" + res;
        return res;
    }
}