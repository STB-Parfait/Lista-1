public class Ex6 {
public static void main(String[] args){

        double x = Prompt.lerDecimal();

        Prompt.separador();
        Prompt.linhaEmBranco();
        Prompt.imprimir(x + " C° equivale a: " + ((9*x+160)/5));
        Prompt.linhaEmBranco();
        Prompt.separador();
    }
}
