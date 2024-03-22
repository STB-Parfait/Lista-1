public class Ex10 {
    public static void main(String[] args){
        int x = Prompt.lerInteiro();
        switch(x){
            case 1:
            Prompt.separador();
            Prompt.linhaEmBranco();
            Prompt.imprimir("UM");
            Prompt.linhaEmBranco();
            Prompt.separador();
            break;

            case 2:
            Prompt.separador();
            Prompt.linhaEmBranco();
            Prompt.imprimir("DOIS");
            Prompt.linhaEmBranco();
            Prompt.separador();
            break;

            case 3:
            Prompt.separador();
            Prompt.linhaEmBranco();
            Prompt.imprimir("TRÊS");
            Prompt.linhaEmBranco();
            Prompt.separador();
            break;

            case 4:
            Prompt.separador();
            Prompt.linhaEmBranco();
            Prompt.imprimir("QUATRO");
            Prompt.linhaEmBranco();
            Prompt.separador();
            break;

            case 5:
            Prompt.separador();
            Prompt.linhaEmBranco();
            Prompt.imprimir("CINCO");
            Prompt.linhaEmBranco();
            Prompt.separador();
            break;

            default:
            Prompt.separador();
            Prompt.linhaEmBranco();
            Prompt.imprimir("Este valor é inválido!");
            Prompt.linhaEmBranco();
            Prompt.separador();
            break;
        }
    }
}
