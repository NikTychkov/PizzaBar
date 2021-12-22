import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        Menu.menu();

        System.out.println("Новый заказ");
        System.out.println();

        Scanner touchScreen = new Scanner(System.in);

        String button = touchScreen.nextLine();
        if (button.equals("Новый заказ")) {
            Zakaz newZakaz = new Zakaz();
            System.out.println("Пожалуйста, выберите пиццу согласно меню");
            newZakaz.sdelatZakaz(menu);
            PrintZakaz.printZakaz(menu, newZakaz);
            System.out.println("Вернуться к заказу                 Завершить заказ");
            while (true) {
                button = touchScreen.nextLine();
                if (button.equals("Завершить заказ")) break;
                {
                    if (button.equals("Вернуться к заказу")) {
                        System.out.println("Пожалуйста, выберите пиццу согласно меню");
                        newZakaz.sdelatZakaz(menu);
                        PrintZakaz.printZakaz(menu, newZakaz);
                        System.out.println("Вернуться к заказу                 Завершить заказ");
                    }
                }
            }
        }
    }
}
