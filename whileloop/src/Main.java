public class Main {
    public static void main(String[] args){
        System.out.println(sumDigits(18));
    }
    public static int sumDigits(int number){
        if(number<10){
            return -1;
        }
            int sum=0;
            while(number>0){
                int r;
                r=number%10;
                number=number/10;
                sum+=r;
            }
            return sum;

    }
}
