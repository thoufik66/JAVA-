package LOOPS;

public class SummationOdd {
    public static void main(String[] args) {
        int a=5;
        int sum=0;
        for(int i=1;i<=a;i++){
            if(i%2!=0){
                sum=sum+i;
            }

        }
        System.out.println(sum);

    }
}
