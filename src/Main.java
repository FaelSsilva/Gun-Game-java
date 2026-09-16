package src;

public class Main {
    public static void main(String[] args) {
        System.out.println("Gun Game iniciado!");
        
        Player player1 = new Player("Taffa", 20, 0);
        System.out.println("Nome do jogador: " + player1.getNome());    

        // player1.aumentarEliminacao();
        // System.out.println("Quantidade de eliminações: " + player1.getQtd_eliminacoes());

        Arma arma1 = new Arma("AK-47", 10, 45);
        player1.setArma(arma1);
        
        //ver arma do jogador e teste da arma
        System.out.println("Arma atual do jogador: " + player1.getArma().getNome());

        arma1.atirar();

        //mostrar a municao após atirar
        System.out.println(arma1.getMunicaoDisp());


        player1.receberDano(arma1.getDano());

    }
}