package app;

public class Main {
    public static void main(String[] args) {
        // Оголошуємо змінні для першого товару
        String product1 = "smartphone";
        double price1 = 1215.34; // Ціна одного смартфона
        int quantity1 = 10; // Кількість проданих смартфонів
        int days1 = 5; // Кількість днів продажу

        // Розраховуємо загальну суму продажів та середньоденну
        double totalSales1 = calculateTotalSales(price1, quantity1);
        double salesByDay1 = calculateSalesByDay(totalSales1, days1);

        // Оголошуємо змінні для другого товару
        String product2 = "laptop";
        double price2 = 1498.12; // Ціна одного ноутбука
        int quantity2 = 7; // Кількість проданих ноутбуків
        int days2 = 7; // Кількість днів продажу

        // Розраховуємо загальну суму продажів та середньоденну
        double totalSales2 = calculateTotalSales(price2, quantity2);
        double salesByDay2 = calculateSalesByDay(totalSales2, days2);

        // Виводимо результати
        System.out.printf("Product No 1: %s,\ntotal sales for %d days is EUR %.2f,\nsales by day is EUR %.2f.%n",
                product1, days1, totalSales1, salesByDay1);

        System.out.printf("Product No 2: %s,\ntotal sales for %d days is EUR %.2f,\nsales by day is EUR %.2f.%n",
                product2, days2, totalSales2, salesByDay2);
    }

    // Функція для розрахунку загальної суми продажів
    public static double calculateTotalSales(double price, int quantity) {
        return price * quantity;
    }

    // Функція для розрахунку середньоденних продажів
    public static double calculateSalesByDay(double totalSales, int days) {
        return totalSales / days;
    }
}

