public class thisMetodo {

    public static void main(String[] args) {
        String nome = "Neil Peart";
        int ID = 2112;
        double salario = 1000000;

        funcionario chefe, secretaria; 
        chefe = new funcionario(nome, ID, salario);
        chefe.exibir();//invocando método
        System.out.println("\n");
        secretaria = new funcionario();
        secretaria.exibir();//invocando método

    }
}