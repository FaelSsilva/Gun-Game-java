package src;

public class Main {
    public static void main(String[] args) {
        System.out.println("Gun Game iniciado!");
        
        Player player1 = new Player("Taffa", 100, 0);
        System.out.println("Nome do jogador: " + player1.getNome());    

        //player1.receberDano(40);

        //player1.receberDano(120);

        // player1.aumentarEliminacao();
        // System.out.println("Quantidade de eliminações: " + player1.getQtd_eliminacoes());

        Arma arma1 = new Arma("AK-47", 30, 45);

        System.out.println("Arma: " + arma1.getNome());
        System.out.println("Dano: " + arma1.getDano());
        System.out.println("Municao Disponivel: " + arma1.getMunicaoDisp());

        player1.setArma(arma1);
        System.out.println("Arma atual do jogador: " + player1.getArma().getNome());

    }
}