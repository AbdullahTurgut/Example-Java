public class ControlFlow {
    public static void main(String[] args) {
        int temp = 32;
        if(temp>30){
            System.out.println("It's a hot day");
            System.out.println("Drink water");
        }
        else if(temp > 20)
            System.out.println("Beautiful day");
        else
            System.out.println("Cold day");

        int income = 120_000;
        boolean hasHighIncome= (income > 100_000);

        int income2 = 120000;
        String className = income2 > 100000 ? "First Class" : "Economy";

        String role = "admin";
        switch (role){
            case "admin":
                System.out.println("You're admin");
                break;
            case "moderator":
                System.out.println("You're moderator");
                break;
            default:
                System.out.println("You're guest");
                break;
        }


    }
}
