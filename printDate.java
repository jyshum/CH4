public class printDate {

    public static void main(String[] arg) {
        String day = "Monday";
        int date = 22;
        String month = "July";
        int year = 2019;
        printAmerican(day, date, month, year);
        newLine();
        printEuropean(day, date, month, year);
    }

    public static void printAmerican(String day, int date, String month, int year) {
        System.out.print(day + ", " + month + " "+  date + ", " + year);
    }

    public static void printEuropean(String day, int date, String month, int year) {
        System.out.print(day + " " + month + " " + date + " " + year);
    }

    public static void newLine() {
        System.out.println();
    }
}


