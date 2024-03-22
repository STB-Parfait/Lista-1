public class Ex8 {
    public static void main(String[] args){
        int x = Prompt.lerInteiro();
        if(x>=50){
            Prompt.separador();
            Prompt.linhaEmBranco();
            Prompt.imprimir("O valor é igual ou maior que 50");
            Prompt.linhaEmBranco();
            Prompt.separador();
        }
        else{
            Prompt.separador();
            Prompt.linhaEmBranco();
            Prompt.imprimir("O valor é menor que 50");
            Prompt.linhaEmBranco();
            Prompt.separador();
        }
    }
}
