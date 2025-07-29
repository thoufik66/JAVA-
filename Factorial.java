class Factorial {
    int fact(int n) {
        if(n == 0 || n == 1)
            return 1;
        else
            return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        int num = 5;
        System.out.println("Factorial of " + num + " is " + f.fact(num));
}
}