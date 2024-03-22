

public class Ex19 {
    public static void main(String[] args) {
    	double r,h,v;
    	r = Prompt.lerDecimal();
    	h = Prompt.lerDecimal();
    	v = (((Math.pow(r, 2)*3.14)*h));
    	
    	Prompt.separador();
    	Prompt.linhaEmBranco();
    	Prompt.imprimir("Área: " + v);
    	Prompt.linhaEmBranco();
    	Prompt.separador();
    }
}
