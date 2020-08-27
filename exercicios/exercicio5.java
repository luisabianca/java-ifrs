public class exercicio5 {
    public static void main(String[] args) {
        double salBase, novoSal, grat, imp;

        System.out.println("Digite o valor do salario: ");
        salBase = Double.parseDouble(System.console().readLine());

        grat = salBase * 5 / 100;
        imp = (salBase + grat) * 7 / 100;
        novoSal = (salBase + grat) - imp;

        System.out.print("O Novo Salario sera: ");
        System.out.print(novoSal); 
    }
}