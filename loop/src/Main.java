public class Main {
    public static void main(String[] args){
        int counter =0,sum=0;
        for(int i=1 ; i<=1000;i++){
            if(counter >= 5){
                break;
            }
            else if(i%3==0 && i % 5==0){
                sum+=i;
                counter ++;
                System.out.println("Found number is "+ i);

            }
        }
        System.out.println("La somme est "+ sum);
    }
}
