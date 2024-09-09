public class Multiples {
    public static void main(String[] args) {
        int i = 1000;
        int multiples = 0;

        while (i > 0) {
            boolean divisBy3 = i % 3 == 0;
            boolean divisBy5 = i % 5 == 0;

            if (divisBy3 || divisBy5) {
                multiples += 1;
            }
            i -= 1;
        }

        System.out.println(multiples);
    }
}
