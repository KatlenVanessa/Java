import java.util.Scanner;

public class PrimeiraClasse {
    public static void main(String[] args) throws Exception {

        Aluno aluno1 = new Aluno();

        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        aluno1.nome = entrada.nextLine();

        System.out.print("Nota de Matematica:");
        aluno1.notaMat = entrada.nextDouble();

        System.out.print("Nota de Fisica: ");
        aluno1.notaFis = entrada.nextDouble();

        System.out.printf("O aluno \"%s\" tirou %2.2f em Matemática," + "%2.2f em Física e obteve média %2.2f\n", aluno1.nome, aluno1.notaMat , aluno1.notaFis, (aluno1.notaMat+aluno1.notaFis)/2);

        entrada.close();
    }
}
