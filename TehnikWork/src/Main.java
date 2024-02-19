import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

    Battleground battleground1 = new Battleground(30, 30);
    Battleground battleground2 = new Battleground(50,50);
    Battleground battleground3 = new Battleground(100, 100);

    battleground1.name = "Battleground";

    Orki orki1 = new Orki(30,3);
    Orki orki2 = new Orki(50,5);
    Orki orki3 = new Orki(100,100);

        int randNumber = random.nextInt(1,100);
        System.out.println("Тип боевого поля и тип ваших орков определяет номер который вам совпаст.");
        System.out.println("1 до 30, игра на " + battleground1 + " с орками типа: " + orki1 +
                "\n30 до 50, игра на " + battleground2 + " с орками типа: " + orki2 +
                "\n50 do 100, игра на " + battleground3 + " с орками типа: " + orki3 + "\nВаш номер: " + randNumber);

        System.out.println("Название вашего поля боя: " + battleground1.name);
        orki1.toDisposeOnTheBattle();

        System.out.println("Ork1 has power of work: " + orki1.power);
        System.out.println("Ork2 has power of works: " + orki2.power);

        if (orki1.power > orki2.power){
            System.out.println("Ork1 is stronger than Ork2.");
        }   else {
            System.out.println("Ork2 is stronger that Ork1.");
        }









    }
}