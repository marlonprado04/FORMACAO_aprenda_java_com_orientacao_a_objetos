public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        int ano = 2022;
        String filme = "Top Gun: Maverick";
        boolean incluidoNoPlano = true;
        double notaFilme = 8.5;

        System.out.println("Filme? " + filme);
        System.out.println("Ano de lançamento? " + ano);
        System.out.println("Esse filme está plano? " + incluidoNoPlano);
        System.out.println("Nota do filme? " + notaFilme);

        String dados = """
                Filme: Maverick
                Ano: 2023
                Catálogo: True
                Nota: 8.5
                """;

        System.out.println(dados);

        double nota2Filme = 6.0;
        int classificacao = (int) nota2Filme;
    }
}