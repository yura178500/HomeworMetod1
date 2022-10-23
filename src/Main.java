public class Main {
    public static void printSeason(int year) {
        if (year <= 0 || year > 4000) {
            System.out.println("Некорректное значение года");
                return;}}
    public static void main (String[]args){

        int year = 2024;
        if ((year % 4 == 0) && year % 100 != 0) {
            System.out.println(year + "   Весокосный год");
        } else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
            System.out.println(year + "   Весокосный год");
        } else {
            System.out.println(year + "   Не весокосный год");
        }
    }
    }
