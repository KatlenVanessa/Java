public class empregado2 {
    private String nome;
    private int ID;
    private double salario;

    
    public empregado2(String nome, int ID, double salario) {
        setNome(nome);
        setID(ID);
        setSalario(salario);
    }

    
    public void exibir() {
        System.out.printf("O funcionário %s, de número %d recebe %.2f por mês", getNome(), getID(), getSalario());
    }

    //Just assigns the arguments on the right parameters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //Just returns the parameters
    public String getNome() {
        return nome;
    }

    public int getID() {
        return ID;
    }

    public double getSalario() {
        return salario;
    }

}
