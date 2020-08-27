public class exercicio2 {
    public static void main(String[] args) {
        double N1, N2, RES;

        System.out.print("Digite o primeiro numero: ");
        N1 = Integer.parseInt(System.console().readLine());

        System.out.print("Digite o segundo numero: ");
        N2 = Integer.parseInt(System.console().readLine());

        RES = N1 / N2;

        System.out.println("O valor da divisao entre os dois numeros eh: ");
        System.out.println(RES);
    }
}