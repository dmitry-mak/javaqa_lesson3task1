public class Main {
    public static void main(String[] args) {

        int ticketPrice = 13676; // ввод целочисленного значения цены билета
        int miles = ticketPrice / 20; // рассчет начисляемых бонусных миль

        // форматирование строки вывода:
        String result = String.format("За билет стоимостью %d рублей будет начислено %d бонусных милей", ticketPrice, miles);

        System.out.println(result); // вывод результата в консоль

    }
}