public class PrintZakaz {

    public static void printZakaz(Menu pizza, Zakaz zakaz) {
        System.out.println();
        System.out.println("                           Ваш заказ");
        System.out.println();
        if (zakaz.mushroomPizzaNumber != 0)
            System.out.println("Пицца " + pizza.mushroomPizza.name + "             " + pizza.mushroomPizza.price + " рублей " + "* " + zakaz.mushroomPizzaNumber + " шт.     " + (pizza.mushroomPizza.price * zakaz.mushroomPizzaNumber) + " рублей");
        if (zakaz.cheesePizzaNumber != 0)
            System.out.println("Пицца " + pizza.cheesePizza.name + "              " + pizza.cheesePizza.price + " рублей " + "* " + zakaz.cheesePizzaNumber + " шт.     " + (pizza.cheesePizza.price * zakaz.cheesePizzaNumber) + " рублей");
        if (zakaz.europeanPizzaNumber != 0)
            System.out.println("Пицца " + pizza.europeanPizza.name + "         " + pizza.europeanPizza.price + " рублей " + "* " + zakaz.europeanPizzaNumber + " шт.     " + (pizza.europeanPizza.price * zakaz.europeanPizzaNumber) + " рублей");
        if (zakaz.superPepperoniPizzaNumber != 0)
            System.out.println("Пицца " + pizza.superPepperoniPizza.name + "     " + pizza.superPepperoniPizza.price + " рублей " + "* " + zakaz.superPepperoniPizzaNumber + " шт.     " + (pizza.superPepperoniPizza.price * zakaz.superPepperoniPizzaNumber) + " рублей");
        if (zakaz.pepperoniPizzaNumber != 0)
            System.out.println("Пицца " + pizza.pepperoniPizza.name + "           " + pizza.pepperoniPizza.price + " рублей " + "* " + zakaz.pepperoniPizzaNumber + " шт.     " + (pizza.pepperoniPizza.price * zakaz.pepperoniPizzaNumber) + " рублей");
        System.out.println();
        System.out.println("Сумма заказа: " + zakaz.sum + " рублей");
        System.out.println();
    }
}
