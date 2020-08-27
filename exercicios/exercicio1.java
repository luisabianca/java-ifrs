public class exercicio1 {
    public static void main(String[] args) {
        int N1, N2, RES;

        System.out.print("Digite o primeiro valor: ");
        N1 = Integer.parseInt(System.console().readLine());

        System.out.print("Digite o segundo valor: ");
        N2 = Integer.parseInt(System.console().readLine());

        RES = N1 - N2;

        System.out.println("O valor da sua subtracao eh:");
        System.out.println(RES);
    }
}