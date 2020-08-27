public class exercicio4 {
    public static void main(String[] args) {
        double preco, desconto, precoFinal;

        System.out.println("Digite o valor do produto: ");
        preco = Double.parseDouble(System.console().readLine());

        desconto = preco * 10 / 100;
        precoFinal = preco - desconto;

        System.out.print("O valor com desconto eh: ");
        System.out.print(precoFinal);
    }
}