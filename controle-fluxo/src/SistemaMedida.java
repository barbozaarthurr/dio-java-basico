public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "M";

        System.out.println(sigla == "P" ? "PEQUENO" : sigla == "M" ? "MEDIO" : sigla == "G" ? "GRANDE" : "INDEFINIDO");
    }
}
