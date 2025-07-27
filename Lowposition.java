package LOOPS;

public class Lowposition {
    public static void main(String[] args) {
        int pos=1;
        int ASCII=65;
        for(char ch='a';ch<='z';ch++){
            System.out.println(ch+"="+pos++ +"="+ASCII++);
        }
    }
}
