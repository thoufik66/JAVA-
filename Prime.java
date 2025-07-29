public class Prime {
    public static void main(String[] args) {
        int num = 7;
        int count = 0;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
                break;
            }
        }

        if (count == 0 && num > 1)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
}
}