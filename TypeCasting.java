public class TypeCasting {
    public static void main(String[] args) {
        int i = 10;
        float f = i; 
        double d = f; 

        double d2 = 15.75;
        int i2 = (int) d2;

        System.out.println("int to float: " + f);
        System.out.println("float to double: " + d);
        System.out.println("double to int: "+i2);
}
}
