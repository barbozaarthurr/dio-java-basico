public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);
        
        smartTv.amuntarVolume();
        System.out.println("Novo status -> Volume atual: " + smartTv.volume);

        smartTv.escolherCanal(30);
        System.out.println("Novo status -> Canal atual: " + smartTv.canal);
    }
}
