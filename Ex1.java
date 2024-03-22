public class Ex1 {
    public static void main(String[] args){

        int x = Prompt.lerInteiro();

        if(x>10){
            Prompt.separador();
            Prompt.linhaEmBranco();
            Prompt.imprimir("O Valor é maior que 10.");
            Prompt.linhaEmBranco();
            Prompt.separador();
        }
        else{
            Prompt.separador();
            Prompt.linhaEmBranco();
            Prompt.imprimir("O valor é menor, ou igual, a 10");
            Prompt.linhaEmBranco();
            Prompt.separador();
        }
    }
}
