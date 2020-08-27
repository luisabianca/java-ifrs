public class exercicio6 {
    public static void main(String[] args) {
        double salFixo, comissao, salFinal, vendas;

        System.out.println("Digite o valor do salario fixo: ");
        salFixo = Double.parseDouble(System.console().readLine());

        System.out.println("Digite o valor das vendas do mes: ");
        vendas = Double.parseDouble(System.console().readLine());

        comissao = vendas * 4 / 100;
        salFinal = salFixo + comissao;

        System.out.print("O valor da sua comissao eh: ");
        System.out.println(comissao);

        System.out.print("O valor do salario final eh: ");
        System.out.println(salFinal);
    }
}