public class Ex4 {
    public static void main(String[] args){
        double x = Prompt.lerDecimal();
        double y = Prompt.lerDecimal();

        Prompt.separador();
        Prompt.linhaEmBranco();
        Prompt.imprimir("A soma dos dois números é: " + (x+y));
        Prompt.imprimir("A subtração dos dois números é: " + (x-y));
        Prompt.imprimir("A multiplicação dos dois números é: " + (x*y));
        Prompt.imprimir("A divisão dos dois números é: " + (x/y));
        Prompt.linhaEmBranco();
        Prompt.separador();
    }
}
