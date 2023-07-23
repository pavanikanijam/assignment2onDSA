public class Solution {
    int sum=0;
    public int totalNQueens(int num) {
        boolean[] a1=new boolean[num];
        boolean[] a2= new boolean[2*num-1];
        boolean[] a3=new boolean[2*num-1];
        task(0, num,a1,a2,a3);
        return sum;
    }
    public void task(int x, int num, boolean[] a1, boolean[] a2, boolean[] a3) {
        if (x==num) {
            sum++;
            return;
        }
        for(int i=0;i<num;i++) 
        {
            if(!a1[i]&&!a2[i+x]&&!a3[num-1-x+i]) 
            {
                a1[i]=a2[i+x]=a3[num-1-x+i]=true;
                task(x+1,num,a1,a2,a3);
                a1[i]=a2[i+x]=a3[num-1-x+i]=false;
            }
        }
    }
}
