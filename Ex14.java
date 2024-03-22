

public class Ex14 {
    public static void main(String[] args) {
    	
    	float an = 0;
    	float a1 = 0;
    	float n =0;
    	float r = 0;
    	
    	a1 = Prompt.lerInteiro();
    	n = Prompt.lerInteiro();
    	r = Prompt.lerInteiro();
    	
    	
    	an = a1 + (n-1)*r;
    	
    	Prompt.separador();
    	Prompt.linhaEmBranco();
    	Prompt.imprimir(an);
    	Prompt.linhaEmBranco();
    	Prompt.separador();
    	
    }
}
