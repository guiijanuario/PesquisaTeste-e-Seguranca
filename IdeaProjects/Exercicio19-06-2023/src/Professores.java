import java.util.Scanner;

public abstract class Professores extends Funcionarios {
    private String nivelGraduacao;
    private String disciplinaMinistrada;
    private int quantidadeAlunos;
    private int quantidadeTurmas;
    private int quantidadeEstagiarios;

    Scanner entrada = new Scanner(System.in);

    public int getquantidadeEstagiarios(){
        if(quantidadeEstagiarios <= 2){

        } else{
            System.out.println("Inválido");
        }
        return quantidadeEstagiarios;
    }
    public Professores(String nome, String cpf, Integer numeroRegistro, String orgaoLotacao, double salario) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
        this.nivelGraduacao = this.nivelGraduacao;
        this.disciplinaMinistrada = this.disciplinaMinistrada;
        this.quantidadeAlunos = quantidadeAlunos;
        this.quantidadeTurmas = quantidadeTurmas;
    }

    public String getNivelGraduacao() {
        return nivelGraduacao;
    }

    public void setNivelGraduacao(String nivelGraduacao) {
        this.nivelGraduacao = nivelGraduacao;
    }

    public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }

    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }

    public int getQuantidadeTurmas() {
        return quantidadeTurmas;
    }

    public void setQuantidadeTurmas(int quantidadeTurmas) {
        this.quantidadeTurmas = quantidadeTurmas;
    }

    @Override
    public double aumentoDoSalario() {
        double aumentoSalario = getSalario() * 0.1;
        setSalario(getSalario() + aumentoSalario);
        System.out.println("O novo valor do salário é de R$ " +getSalario());
        return getSalario();
    }
    @Override
    public double aumentoSalario() {
        return this.aumSalario() * 0.10;
    }


    public int adicionarTurma(){
        return this.quantidadeTurmas++;
    }

    protected void adicionarProfessor() {
    }

    public abstract void mostrarInfos();
}
