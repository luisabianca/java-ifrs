public class exercicio3 {
    public static void main(String[] args) {
        double N1, N2, N3, RES;

        System.out.println("Digite a primeira nota: ");
        N1 = Double.parseDouble(System.console().readLine());

        System.out.println("Digite a segunda nota: ");
        N2= Double.parseDouble(System.console().readLine());

        System.out.println("Digite a terceira nota: ");
        N3 = Double.parseDouble(System.console().readLine());

        RES = (N1 + N2 + N3) / 3;

        System.out.println("A média dos tres valores eh: ");
        System.out.println(RES);

    }
}