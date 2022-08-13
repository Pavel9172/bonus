public class Main {
    public static void main(String[] args) {
        int balance = 100; // начальный баланс
        int deposit = 110000; // пополнение счета
        int bonus = deposit / 100;
        int result = balance + deposit + bonus;

        System.out.println(" Итоговая сумма вместе с бонусом " + result);
        System.out.println(" Бонус " + bonus);
    }
}
