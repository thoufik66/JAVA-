public class MaxOfThree {
    public static void main(String[] args) {
        int a = 5, b = 12, c = 8;
        if(a >= b && a >= c)
            System.out.println("Greatest: " + a);
        else if(b >= a && b >= c)
            System.out.println("Greatest: " + b);
        else
            System.out.println("Greatest:"+c);}
}