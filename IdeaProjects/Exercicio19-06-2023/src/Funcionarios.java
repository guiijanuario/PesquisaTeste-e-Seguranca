public abstract class Funcionarios {

    private String nome;
    private String cpf;
    private int numeroRegistro;
    private String orgaoLotacao;
    private double salario;

    public Funcionarios(String nome, String cpf, int numeroRegistro, String orgaoLotacao, Double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroRegistro = numeroRegistro;
        this.orgaoLotacao = orgaoLotacao;
        this.salario = salario;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getCpf() {

        return cpf;
    }

    public void setCpf(String cpf) {

        this.cpf = cpf;
    }

    public int getNumeroRegistro() {

        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getOrgaoLotacao() {
        return orgaoLotacao;
    }

    public void setOrgaoLotacao(String orgaoLotacao) {
        this.orgaoLotacao = orgaoLotacao;
    }

    public double getSalario() {

        return salario;
    }

    public void setSalario(double salario) {

        this.salario = salario;
    }

    public double aumSalario() {
        double aumentoSalario = salario * 0.1;
        salario = salario + aumentoSalario;
        System.out.println("O novo valor do salário é de R$ " +salario);
        return salario;

    }

    public void informacaoDados(){
        System.out.println("----------------------------------------------------");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Número de Registro do(a) " + getNome() + "é: " + getNumeroRegistro());
        System.out.println("Órgão de Lotação do(a) funcionário é " + getOrgaoLotacao());
        System.out.println("O salário do(a) funcionário é: " + getSalario());
    }

    public abstract double aumentoSalario();

    public abstract double aumentoDoSalario();

    public abstract void mostrarInfos();
}
