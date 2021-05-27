package day13_conditional_statesmets;

public class NiceDayOrNo {
    public static void main(String[] args) {
        int temp = 57;
        if (temp >= 70) {
            System.out.println("It is a beautiful day");
            System.out.println("Lets code Java");
        } else {
            System.out.println("It is kind of cold today\nStay home and code Java");
        }
        System.out.println();
        // salesAmount = 2000; if salesAmount <= 1000, bonus 50$, else 100$
        double bonus = 0.0;
        double salesAmount = 2000.55;
        if (salesAmount <= 1000) {
            bonus = 50.0;
            System.out.println("Good job, you qualified for bonus! " + bonus);
        } else {
            bonus = 100.0;
            System.out.println("Great job,you are qualified for full bonus " + bonus);
        }
        System.out.println("Your total bonus: $ " + bonus);

    }
}
