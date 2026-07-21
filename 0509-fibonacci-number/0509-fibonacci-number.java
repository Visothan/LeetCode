class Solution {
    public int fib(int n) {
        int x=0,y=1;
        int z=0;
        if(n<=1)
        {
            return n;
        }
        for(int i=2;i<=n;i++)
        {
            z=x+y;
            x=y;
            y=z;
        }
        return z;
    }
}