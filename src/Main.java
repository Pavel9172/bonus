public class Main {
    public static void main(String[] args) {
        int balance = 100; // начальный баланс
        int deposit = 11000; // пополнение счета
        int bonus = deposit / 100;
        int tog = balance + deposit + bonus;

        System.out.println(" Итоговая сумма вместе с бонусом " + tog);
        System.out.println(" Бонус " + bonus);
    }
}
