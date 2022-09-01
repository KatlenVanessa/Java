import java.util.Scanner;
public class imc {
    public static double quadrado(double altura){
        return altura *altura;
    }
    public static double calcImc(double peso, double altura){
        double imc = peso/quadrado(altura);
        return imc;
    }

    public static void main(String[] args){
        double peso,altura,imc;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o peso em kilos:");
        peso = entrada.nextDouble();
        System.out.println("Digite a altura em metros:");
        altura = entrada.nextDouble();
        imc = calcImc(peso, altura);
        System.out.printf("Seu Indice de Massa Corporal: %2.2f", imc);
        entrada.close();

    }
}
