
public class atv8 {

    public static int Dado6(int min, int max) {
        // Generate random int value from 50 to 100
        System.out.println("\nNumero randomico de " + min + " ate " + max + ":\n");

        // Math.random(); Generate random number from 0 to 1 (double)
        // range+min: generate numbers between max and min, including
        // them;
        // (int) Force to convert into an integer
        int range = max - min + 1;
        int random_num = (int) (Math.random() * range) + min;
        return random_num;
    }

    public static void main(String[] args) {
        int min = 1;
        int max = 6;

        System.out.println(Dado6(min, max));
        

    }
}
