class Solution {
    public long minTime(int[] skills, int[] mana) 
    {
        long ans[][]=new long[mana.length][skills.length+1];
        ans[0][0]=0;
        for(int i=1;i<=skills.length;i++)
        {
            ans[0][i]=ans[0][i-1]+skills[i-1]*mana[0];
        }
         
        for(int i=1;i<mana.length;i++)
        {
           long next=ans[i-1][skills.length];
           long curr=0;
            for(int j=skills.length-2;j>=0;j--)
            {
                curr=next-(mana[i]*skills[j]);
                if(curr<ans[i-1][j+1])
                {
                    long extra=ans[i-1][j+1]-curr;
                    next=curr+extra;
                }
                else next=curr;
            }
            ans[i][0]=next;
            for(int x=1;x<=skills.length;x++)
            {
                ans[i][x]=ans[i][x-1]+(mana[i]*skills[x-1]);
            }
        
        }
        return ans[mana.length-1][skills.length];
        
    }
}