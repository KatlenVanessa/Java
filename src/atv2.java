import java.util.Scanner;

public class atv2 {
    public static int delta(int a, int b, int c) {
        int result;
        result = (b*b)-(4*a*c);
        return result;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a,b,c;
        System.out.println("Insira os coeficientes: ");
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();
        entrada.close();
        System.out.println("Delta da equacao: " + delta(a, b, c));


    }
}
