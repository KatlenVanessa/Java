public class funcionario {
    private String nome;
    private int ID;
    private double salario;

    public funcionario() {
        System.out.println("Método construtor padrão invocado!");
    }

    public funcionario(String nome, int ID, double salario) {
        this();
        System.out.println(this);
        this.nome = nome;
        this.ID = ID;
        this.salario = salario;
    }

    public String toString() {
        return "Foi usado : System.out.println(this)";
    }

    public void exibir() {
        System.out.printf("O funcionário %s, de número %d recebe %.2f por mês", this.nome, this.ID, this.salario);
    }
}
