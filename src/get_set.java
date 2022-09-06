public class get_set {
    public static void main(String[] args) {
        String nome = "Neil Peart";
        int ID = 2112;
        double salario = 1000000;

        empregado1 chefe = new empregado1();

        chefe.setNome(nome);
        chefe.setID(ID);
        chefe.setSalario(salario);

        chefe.exibir();
    }

}
