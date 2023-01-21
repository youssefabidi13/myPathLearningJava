public class TabUtils {
    public  int[] compareTab(int[] t1, int[]t2){
        int[] t3 = new int[t1.length];
        for (int i =0,j=0 ;i< t1.length && i< t2.length;i++){
            if(t1[i]!=t2[i]){
                t3[i]=1;
            }else{
                t3[i]=0;
            }
        }
        return t3;
    }
}
