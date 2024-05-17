package edu.arthur.segundasemana;
public class MinhaClasse {
    
    public static void main (String [] args){

        String primeiroNome = "Arthur";
        String segundoNome = "Barboza";

        

        System.out.println(nomeCompleto(primeiroNome, segundoNome));

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}
