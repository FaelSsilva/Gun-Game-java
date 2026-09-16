package src;

public class Arma {
    private String nome;
    private int dano;
    private int municaoDisp;

    //get
    public String getNome(){
        return nome;
    }

    public int getDano(){
        return dano;
    }

    public int getMunicaoDisp(){
        return municaoDisp;
    }

    //set
    public void setNome(String nome){
        this.nome = nome;   
    }

    public void setDano(int dano){
        this.dano = dano;
    }

    public void setMunicaoDisp(int municaoDisp){
        this.municaoDisp = municaoDisp;
    }

    public Arma(String nome, int dano, int municaoDisp){
        this.nome = nome;
        this.dano = dano;
        this.municaoDisp = municaoDisp;
    }

    public void atirar(){
        if(this.municaoDisp > 0){
            municaoDisp--;
            System.out.println("Arma Disparada");
        } else{
            System.out.println("Arma sem munição");
        }
    }

}