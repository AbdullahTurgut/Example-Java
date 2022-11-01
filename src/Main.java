import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //primitive types
        byte age = 30;
        long viewsCount = 2_134_255_626L;
        float price = 10.99f;
        char letter = 'A';
        boolean isEligible = false;

        //references type
        Date now = new Date();
        //sout -> short key
        //System.out.println(now);

        String message = "Hello \"Abdullah\" ";
        String message2 = "c:\\Windows\\...";
        //System.out.println(message);
        //System.out.println(message2);

        int[] numbers = { 1, 8, 7, 5 ,9};
        Arrays.sort(numbers);
        //System.out.println(numbers.length);
        //System.out.println(numbers); dizinin adresini döndürür
        //System.out.println(Arrays.toString(numbers));


        int[][] numbers2= new int[2][3];
        //System.out.println(Arrays.deepToString(numbers2));
        int[][] numbers3= { { 1,2,3 } , { 4,5,6 }};
        //System.out.println(Arrays.deepToString(numbers3));


        //final -> const doesnt change the value
        final float Pi = 3.14F;

        int result = Math.round(1.1F);
        //System.out.println(result);

        //0 ile 100 arasında sayı döndürür
        double result2 = Math.random() * 100 ;
        int resultInt= (int) Math.round(Math.random() * 100 );
        //System.out.println(result2);
        //System.out.println(resultInt);

        String percent = NumberFormat.getPercentInstance().format(0.1);
        //System.out.println(percent);

        Scanner scanner = new Scanner(System.in);
        //System.out.print("Name: ");
        String Name = scanner.nextLine().trim();
        //System.out.println("You are " + Name);
    }
}