public class Ex7 {
    public static void main(String[] args){
        int x = Prompt.lerInteiro();
        if((x>=100)&&(x<=200)){
            Prompt.separador();
            Prompt.linhaEmBranco();
            Prompt.imprimir("O valor está entre 100 e 200");
            Prompt.linhaEmBranco();
            Prompt.separador();
        }
        else{
            Prompt.separador();
            Prompt.linhaEmBranco();
            Prompt.imprimir("O valor está fora do intervalo!");
            Prompt.linhaEmBranco();
            Prompt.separador();
        }
    }
}
