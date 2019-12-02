package projeto;

public class Personagem {
    ModoAtirar modo;
    Estado estadoAtual;
    private int life = 100;
    
    public Personagem(){
        this.estadoAtual = new Normal();
    }
    public void andar(){
        estadoAtual.andar();
    }
    public void atirar(){
        modo.Atirar();
    }
    public ModoAtirar getModo() {
        return modo;
    }
    public void setModo(ModoAtirar modo) {
        this.modo = modo;
    }   
    public void usouKitMedico(){
        this.estadoAtual= new Normal();
    }
    public void sofrerDano(int dano){
        this.life= this.life - dano;
        if (this.life < 60){
            this.estadoAtual = new Dano();
        }
    }
}