package projeto;

public class Projeto {
    
    public static void main(String[] args) {
        
        Personagem p = new Personagem();
        ModoTiroFactory mt = new ModoTiroFactory();
        ModoAtirar modo = mt.criarModoTiro("espingarda");
        p.setModo(modo);
        p.atirar();

        modo = mt.criarModoTiro("canhão");
        p.setModo(modo);
        p.sofrerDano(60);
        p.atirar();
        p.andar();
    }
}
