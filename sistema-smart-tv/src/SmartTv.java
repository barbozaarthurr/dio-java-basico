public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }

    public void amuntarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }

    public void amuntarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public void escolherCanal(int novoCanal){
        canal = novoCanal;
    }
}
