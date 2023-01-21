public class TabUtils {
    public  int[] compareTab(int[] t1, int[]t2)throws Exception{
        int[] t3 = new int[t1.length];
        if(t1.length == t2.length){
            for (int i =0,j=0 ;i< t1.length && i< t2.length;i++){
            if(t1[i]!=t2[i]){
                t3[i]=1;
            }else{
                t3[i]=0;
            }
            }
        }else {
            throw new Exception("Les deux tableaux n'ont pas les memes dimensions");
        }
        return t3;
    }
}
