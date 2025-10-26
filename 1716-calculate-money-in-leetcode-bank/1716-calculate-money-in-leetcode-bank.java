class Solution {
    public int totalMoney(int n) {
        int day=0,bank=0,start=1;
        while(n!=0){
            day+=(bank+start);
            if(start%7==0){
                start=1;
                bank++;  
            }
           else{ start++;
           
           } n--;
        } 
    
        return day;
    }
}