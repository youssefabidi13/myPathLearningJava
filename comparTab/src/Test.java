public class Test {
    public static void main(String[] args) {
        int[] t1 = {1,2,3,4,5};
        int[] t2 = {5,4,3,2,1,0};
        TabUtils tabUtils = new TabUtils();
        int[] t3 = null;
        try{
            t3= tabUtils.compareTab(t1,t2);
            for (int i =0;i< t3.length;i++){
                System.out.println("t3["+i+"] = "+ t3[i]);
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
