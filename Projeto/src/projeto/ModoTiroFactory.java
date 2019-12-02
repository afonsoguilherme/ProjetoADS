package projeto;

public class ModoTiroFactory {
    public ModoAtirar criarModoTiro(String arma){
        if(arma.equalsIgnoreCase("Espingarda")){
            return new Simples();
        }if(arma.equalsIgnoreCase("Granada")){
            return new Explosao();
        }else{
            return new Automatico();
        }
    }
}