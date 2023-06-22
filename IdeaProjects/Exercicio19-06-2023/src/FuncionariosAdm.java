import java.util.Scanner;

public class FuncionariosAdm extends Funcionarios{

    public String funcaoAdministrativa;
    public String senioridade;
    public FuncionariosAdm(String nome, int cpf, Integer numeroRegistro, String orgaoLotacao, Double salario) {
        super(nome, String.valueOf(cpf), numeroRegistro, orgaoLotacao, salario);
        this.funcaoAdministrativa = funcaoAdministrativa;
        this.senioridade = senioridade;
    }

    public String getFuncaoAdministrativa() {
        return funcaoAdministrativa;
    }

    public void setFuncaoAdministrativa(String funcaoAdministrativa) {
        this.funcaoAdministrativa = funcaoAdministrativa;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }

    @Override
    public double aumentoSalario() {
        return 0;
    }

    @Override
    public double aumentoDoSalario() {
        double aumentoSalario = getSalario() * 0.1;
        setSalario(getSalario() + aumentoSalario);
        System.out.println("O novo valor do salário é de R$ " +getSalario());
        return getSalario();

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
        System.out.println("Função administrativa: " + funcaoAdministrativa);
        System.out.println("Senioridade: " + senioridade);
    }


}



