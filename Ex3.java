public class Ex3 {
    public static void main(String[] args){

        int x = Prompt.lerInteiro();
        int y = Prompt.lerInteiro();

        if(x>y){
            Prompt.separador();
            Prompt.linhaEmBranco();
            Prompt.imprimir(x + " É maior que " + y);
            Prompt.linhaEmBranco();
            Prompt.separador();
        }
        else if(y>x){
            Prompt.separador();
            Prompt.linhaEmBranco();
            Prompt.imprimir(y + " É maior que " + x);
            Prompt.linhaEmBranco();
            Prompt.separador();
        }
        else{
            Prompt.separador();
            Prompt.linhaEmBranco();
            Prompt.imprimir("Este sequência de números é invalida!");
            Prompt.linhaEmBranco();
            Prompt.separador();
        }
    }
}
