public class Ex11 {
    public static void main(String[] args){

        int a = Prompt.lerInteiro();
        int b = Prompt.lerInteiro();
        int c = Prompt.lerInteiro();

        if(a>b&&b>c){
            Prompt.separador();
            Prompt.linhaEmBranco();
            Prompt.imprimir(a + ">" + b + ">" + c);
            Prompt.linhaEmBranco();
            Prompt.separador();
        }
        else if(a>b&&b<c){
            Prompt.separador();
            Prompt.linhaEmBranco();
            Prompt.imprimir(a + ">" + c + ">" + b);
            Prompt.linhaEmBranco();
            Prompt.separador();
        }
        else if(c>b&&b>a){
            Prompt.separador();
            Prompt.linhaEmBranco();
            Prompt.imprimir(c + ">" + b + ">" + a);
            Prompt.linhaEmBranco();
            Prompt.separador();
        }
        else if(c>b&&b<a){
            Prompt.separador();
            Prompt.linhaEmBranco();
            Prompt.imprimir(c + ">" + a + ">" + b);
            Prompt.linhaEmBranco();
            Prompt.separador();
        }
        else if(b>a&&a>c){
            Prompt.separador();
            Prompt.linhaEmBranco();
            Prompt.imprimir(b + ">" + a + ">" + c);
            Prompt.linhaEmBranco();
            Prompt.separador();
        }
        else if(b>a&&a<c){
            Prompt.separador();
            Prompt.linhaEmBranco();
            Prompt.imprimir(b + ">" + c + ">" + a);
            Prompt.linhaEmBranco();
            Prompt.separador();
        }

    }
}
