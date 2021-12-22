import java.util.Scanner;

public class Zakaz {

    int sum = 0;
    int mushroomPizzaNumber = 0;
    int cheesePizzaNumber = 0;
    int europeanPizzaNumber = 0;
    int superPepperoniPizzaNumber = 0;
    int pepperoniPizzaNumber = 0;

    public void sdelatZakaz(Menu pizza) {
        Scanner console = new Scanner(System.in);
        while (true) {
            String button = console.nextLine();
            if (button.equals("Завершить выбор")) break; {

                if (button.equals(pizza.mushroomPizza.name)) {
                    mushroomPizzaNumber++;
                    System.out.println("Грибная: " + mushroomPizzaNumber + " шт." + "             Удалить 1 пиццу " + pizza.mushroomPizza.name);
                    System.out.println("Завершить выбор");
                    sum += pizza.mushroomPizza.price;
                }

                if (button.equals("Удалить 1 пиццу " + pizza.mushroomPizza.name)) {
                    mushroomPizzaNumber--;
                    System.out.println("Грибная: " + mushroomPizzaNumber + " шт." + "             Удалить 1 пиццу " + pizza.mushroomPizza.name);
                    System.out.println("Завершить выбор");
                    sum -= pizza.mushroomPizza.price;
                }

                if (button.equals(pizza.cheesePizza.name)) {
                    cheesePizzaNumber++;
                    System.out.println("Сырная: " + cheesePizzaNumber + " шт." + "              Удалить 1 пиццу " + pizza.cheesePizza.name);
                    System.out.println("Завершить выбор");
                    sum += pizza.cheesePizza.price;
                }

                if (button.equals("Удалить 1 пиццу " + pizza.cheesePizza.name)) {
                    cheesePizzaNumber--;
                    System.out.println("Сырная: " + cheesePizzaNumber + " шт." + "              Удалить 1 пиццу " + pizza.cheesePizza.name);
                    System.out.println("Завершить выбор");
                    sum -= pizza.cheesePizza.price;
                }

                if (button.equals(pizza.europeanPizza.name)) {
                    europeanPizzaNumber++;
                    System.out.println("Европейская: " + europeanPizzaNumber + " шт." + "         Удалить 1 пиццу " + pizza.europeanPizza.name);
                    System.out.println("Завершить выбор");
                    sum += pizza.europeanPizza.price;
                }

                if (button.equals("Удалить 1 пиццу " + pizza.europeanPizza.name)) {
                    europeanPizzaNumber--;
                    System.out.println("Европейская: " + europeanPizzaNumber + " шт." + "         Удалить 1 пиццу " + pizza.europeanPizza.name);
                    System.out.println("Завершить выбор");
                    sum -= pizza.europeanPizza.price;
                }

                if (button.equals(pizza.superPepperoniPizza.name)) {
                    superPepperoniPizzaNumber++;
                    System.out.println("Супер Пепперони: " + superPepperoniPizzaNumber + " шт." + "     Удалить 1 пиццу " + pizza.superPepperoniPizza.name);
                    System.out.println("Завершить выбор");
                    sum += pizza.superPepperoniPizza.price;
                }

                if (button.equals("Удалить 1 пиццу " + pizza.superPepperoniPizza.name)) {
                    superPepperoniPizzaNumber--;
                    System.out.println("Супер Пепперони: " + superPepperoniPizzaNumber + " шт." + "     Удалить 1 пиццу " + pizza.superPepperoniPizza.name);
                    System.out.println("Завершить выбор");
                    sum -= pizza.superPepperoniPizza.price;
                }

                if (button.equals(pizza.pepperoniPizza.name)) {
                    pepperoniPizzaNumber++;
                    System.out.println("Пепперони: " + pepperoniPizzaNumber + " шт." + "           Удалить 1 пиццу " + pizza.pepperoniPizza.name);
                    System.out.println("Завершить выбор");
                    sum += pizza.pepperoniPizza.price;
                }

                if (button.equals("Удалить 1 пиццу " + pizza.pepperoniPizza.name)) {
                    pepperoniPizzaNumber--;
                    System.out.println("Пепперони: " + pepperoniPizzaNumber + " шт." + "           Удалить 1 пиццу " + pizza.pepperoniPizza.name);
                    System.out.println("Завершить выбор");
                    sum -= pizza.pepperoniPizza.price;
                }
            }
        }
    }
}







