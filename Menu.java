public class Menu {

    Pizza mushroomPizza = new Pizza("Грибная", 550);
    Pizza cheesePizza = new Pizza("Сырная", 400);
    Pizza europeanPizza = new Pizza("Европейская", 629);
    Pizza superPepperoniPizza = new Pizza("Супер Пепперони", 729);
    Pizza pepperoniPizza = new Pizza("Пепперони", 620);

    public static void menu() {
        System.out.println("            Меню");
        System.out.println();
        System.out.println("Пицца                Стоимость");
        System.out.println();
        System.out.println("Грибная              550 рублей");
        System.out.println("Сырная               400 рублей");
        System.out.println("Европейская          629 рублей");
        System.out.println("Супер Пепперони      729 рублей");
        System.out.println("Пепперони            620 рублей");
        System.out.println();
    }
}
