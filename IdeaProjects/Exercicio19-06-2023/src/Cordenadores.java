import java.util.List;
import java.util.Scanner;

public class Cordenadores extends Funcionarios{

    private List<String> profSupervisionados;
    public Cordenadores(String nome, int cpf, Integer numeroRegistro, String orgaoLotacao, Double salario) {
        super(nome, String.valueOf(cpf), numeroRegistro, orgaoLotacao, salario);
        this.profSupervisionados = profSupervisionados;
    }

    public void adicionaProfessor(){
        String novoProfessor = " ";
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < this.profSupervisionados.size() && i < 5; i++){
            System.out.println("DIGITE O NOME DO PROFESSOR PARA INCLUIR NA LISTA: ");
            novoProfessor = entrada.next();
            this.profSupervisionados.add(novoProfessor);
        }
        System.out.println("LISTA DE PROFESSORES SUPERVISIONADOS: " + this.profSupervisionados);

    }

    public void reembolsoDespesas() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITE O VALOR A SER REEMBOLSADO: ");
        double valorDespesas = entrada.nextDouble();
        System.out.println("VOCÊ RECEBERÁ R$ " + valorDespesas + " EM REEMBOLSO.");
        System.out.println("NO TOTAL, SEU PRÓXIMO PAGAMENTO SERÁ DE R$" + (getSalario() + valorDespesas));
    }
    @Override
    public double aumentoSalario() {
        double aumentoSalario = getSalario() * 0.05;
        setSalario(getSalario() + aumentoSalario);
        System.out.println("O novo valor do salário é de R$ " +getSalario());
        return getSalario();
    }

    @Override
    public double aumentoDoSalario() {
        return 0;
    }

    @Override
    public void mostrarInfos() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " +getCpf());
        System.out.println("Número de registro:" + getNumeroRegistro());
        System.out.println("Órgão de Lotação: " + getOrgaoLotacao());
        System.out.println("Salário: " + getSalario());
        System.out.println("Professores Supervisionados: " + profSupervisionados);
    }

}
