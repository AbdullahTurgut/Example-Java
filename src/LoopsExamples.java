import java.util.Scanner;

public class LoopsExamples {
    public static void main(String[] args){
        for(int i= 1; i <= 5; i++)
            System.out.println("Hello World -" + i);

        int i = 5;
        while (i > 0){
            System.out.println("Hello While World -" + i);
            i--;
        }
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while(!input.equals("quit")){
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if(input.equals("quit"))
                break;
            System.out.println(input);
        }

        do{
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if(input.equals("quit"))
                break;
            System.out.println(input);
        }while (!input.equals("quit"));


        String[] fruits = {"Apple", "Mango" , "Banana"};
        for (i=0;i<fruits.length;i++)
            System.out.println(fruits[i]);

        //foreach in java
        for(String fruit:fruits)
            System.out.println(fruit);


    }
}
