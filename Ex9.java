public class Ex9 {
    public static void main(String[] args){
        int a = Prompt.lerInteiro();
        int b = Prompt.lerInteiro();

        if(a==b){
            Prompt.separador();
            Prompt.linhaEmBranco();
            Prompt.imprimir("Os valores são iguais");
            Prompt.linhaEmBranco();
            Prompt.separador();
        }
        else{
            Prompt.separador();
            Prompt.linhaEmBranco();
            Prompt.imprimir("Os valores são diferentes!");
            Prompt.linhaEmBranco();
            Prompt.separador();
        }
    }
}
