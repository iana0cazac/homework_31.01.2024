import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("We are very happy to find you here!! " +
               "\nPlease, introduce your name: ");
        String userName = scanner.next();
        System.out.println("User, your name: " + userName);
        System.out.println("We want to check if your are human :), answer please the next questins: " +
                "\n2 + 2 = ");
                int userAnswer1 = scanner.nextInt();
                if (userAnswer1 == 4){
                System.out.println("Congratulation, the Answer is right!");
        }else {
         System.out.println("The Antwort is wrong :(");}

        System.out.println("One more time: " + "\n2 - 2 = ");
        int userAnswer2 = scanner.nextInt();
        if (userAnswer2 == 0){
            System.out.println("Congratulation, the Answer is right!");
        }else{
        System.out.println("The Antwort is wrong :(");}

        System.out.println("Last time: " + "\n2 * 2 = ");
        int userAnswer = scanner.nextInt();
        if (userAnswer == 4){
            System.out.println("Congratulation, the Answer is right!");
        }else
        System.out.println("The Antwort is wrong :(");}


}








