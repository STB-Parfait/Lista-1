public class Ex5 {
    public static void main(String[] args){
        int a = Prompt.lerInteiro();
        int b = Prompt.lerInteiro();
        int x = a;
        int y = b;


        Prompt.separador();
        Prompt.linhaEmBranco();

        Prompt.imprimir("[Invertidos]");
        Prompt.imprimir("A = " + y);
        Prompt.imprimir("B = " + x);

        Prompt.linhaEmBranco();

        Prompt.imprimir("[Originais]");
        Prompt.imprimir("A = " + a);
        Prompt.imprimir("B = " + b);

        Prompt.linhaEmBranco();
        Prompt.separador();
    }
}
