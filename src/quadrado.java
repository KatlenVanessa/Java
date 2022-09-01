import java.util.Scanner;;

public class quadrado {

    public static int Quadrado(int num) {
        int quadrado;
        quadrado = num * num;
        return quadrado;

    }

    public static void main(String[] args) {

        int valor, res;

        Scanner entrada = new Scanner(System.in);
        System.out.println("\n Calcular o quadrado de: ");
        valor = entrada.nextInt();
        entrada.close();
        res = Quadrado(valor);
        System.out.printf("\n Quadrado de %d eh %d", valor, res);

    }

}
