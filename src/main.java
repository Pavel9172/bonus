public class main {
    public static void main(String[] args) {
        int balance = 100; // начальный баланс
        int deposit = 11000; // пополнение счета
        int bonus = deposit / 100;
        int itog = balance + deposit + bonus;

        System.out.println( " Итоговая сумма вместе с бонусом " + itog);
        System.out.println(" Бонус " +bonus);
    }
}
