import java.util.Scanner;

public class Estagiarios extends Professores {

    public Estagiarios(String nome, String cpf, Integer numeroRegistro, String orgaoLotacao, Double salario) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
    }

    @Override
    public double aumentoSalario() {
        return 0;
    }
    public void reembolsoDespesas() {
    Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE O VALOR A SER REEMBOLSADO: ");
    double valorDespesas = entrada.nextDouble();
        System.out.println("VOCÊ RECEBERÁ R$ " + valorDespesas + " EM REEMBOLSO.");
        System.out.println("NO TOTAL, SEU PRÓXIMO PAGAMENTO SERÁ DE R$" + (getSalario() + valorDespesas));
}
    @Override
    public void mostrarInfos() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " +getCpf());
        System.out.println("Número de registro:" + getNumeroRegistro());
        System.out.println("Órgão de Lotação: " + getOrgaoLotacao());
        System.out.println("Salário: " + getSalario());
        System.out.println("Nível de graduação: " + getNivelGraduacao());
        System.out.println("Disciplinas Ministradas: " + getDisciplinaMinistrada());
        System.out.println("Quantidade de alunos: " + getQuantidadeAlunos());
        System.out.println("Quantidade de turmas: " + getQuantidadeTurmas());
        System.out.println("Quantidade de estagiários: " + getquantidadeEstagiarios());
    }
}
