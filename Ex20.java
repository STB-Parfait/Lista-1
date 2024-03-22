

public class Ex20 {
    public static void main(String[] args) {
    	double h,v,c;
    	h = Prompt.lerDecimal();
    	v = Prompt.lerDecimal();
    	c = (v*h)/12;
    	Prompt.separador();
    	Prompt.linhaEmBranco();
    	System.out.printf("Consumo: %.2fL\n", c);
    	Prompt.linhaEmBranco();
    	Prompt.separador();
    }
}
