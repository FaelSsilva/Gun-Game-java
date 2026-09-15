package src;

public class Player {
    private String nome;
    private int vida;
    private int qtd_eliminacoes;   
    private Arma armaAtual;

    //get
    public String getNome() {
        return nome;
    }

    public int getQtd_eliminacoes() {
        return qtd_eliminacoes;
    }

    public int getVida() {
        return vida;
    }   

    public Arma getArma(){
        return armaAtual;
    }

    //set
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setArma(Arma armaAtual){
        this.armaAtual = armaAtual;
    }

    //construtor
    Player(String nome,int vida, int qtd_eliminacoes ){
        this.nome = nome;
        this.vida = vida;
        this.qtd_eliminacoes = qtd_eliminacoes;
    }

    public void receberDano(int dano){
        this.vida = (this.vida - dano);

        if (this.vida <= 0) {
            this.vida = 0;
            
            System.out.println("Você morreu");
        }

        System.out.println("vida atual: " + this.vida);
    }

    public void aumentarEliminacao(){
        qtd_eliminacoes++;
    }

    
}