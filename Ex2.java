public class Ex2 {
    public static void main(String[] args){
        
        int x = Prompt.lerInteiro();
        int y = Prompt.lerInteiro();

        Prompt.separador();
        Prompt.linhaEmBranco();
        Prompt.imprimir("A soma de " + x + " com " + y + " é: " + (x+y));
        Prompt.linhaEmBranco();
        Prompt.separador();
    }
}
