public class Main {
    public static void main(String[] args) {

        int ticketCost = 15000;     // Стоимость билета
        int rublesAmount = 20;      // Количество рублей за 1 бонусную милю
        int bonusMiles;             // Количество бонусных миль

        bonusMiles = ticketCost / rublesAmount;

        System.out.println("За покупку авиабилета стоимостью " + ticketCost + " Вы получите " + bonusMiles + " миль.");

    }
}