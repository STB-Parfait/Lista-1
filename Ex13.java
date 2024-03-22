public class Ex13 {
    public static void main(String[] args){

        int f = 0;
        int a = Prompt.lerInteiro();
        char o = Prompt.lerCaractere();
        switch(o) {
        
        case '+':
        break;
        
        case '-':
        break;
        
        case '*':
        break;
        
        case '/':
        break;
        
        default:
        Prompt.imprimir("Caracter inválido! tente novamente");
        o = Prompt.lerCaractere();
        
        }
        int b = Prompt.lerInteiro();

        switch(o){
            case '+':
            f = a+b;
            break;

            case '-':
            f = a-b;
            break;

            case '*':
            f = a*b;
            break;

            case '/':
            if(a==0||b==0){
                Prompt.separador();
                Prompt.linhaEmBranco();
                Prompt.imprimir("Operação Inválida!");
                Prompt.linhaEmBranco();
                Prompt.separador();
                break;
            }
            else{
                f = a/b;
                break;
            }
        }

            Prompt.separador();
            Prompt.linhaEmBranco();
            Prompt.imprimir("Resultado: " + f);
            Prompt.linhaEmBranco();
            Prompt.separador();

    }
}
