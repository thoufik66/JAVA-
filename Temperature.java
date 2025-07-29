public class Temperature{
    public static void main(String[] args) {
        double celsius = 25.00;
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + "C = " + fahrenheit + "F");

        fahrenheit = 98.6;
        celsius = (fahrenheit - 32) * 5/9;
        System.out.println(fahrenheit + "F = " + celsius +"C");
}
}