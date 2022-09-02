import java.util.Scanner;

public class atv6 {
    public static float teste(float num1, float num2, float num3) {
        float result = Math.max(num1, num2);
        if (result > num3) {
            return result;
        } else {
            return num3;
        }

    }

    public static void main(String[] args) {
        float a, b, c;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira 3 numeros: ");
        a = entrada.nextFloat();
        b = entrada.nextFloat();
        c = entrada.nextFloat();
        entrada.close();
        System.out.println("Maior: " + teste(a, b, c));
    }
}
