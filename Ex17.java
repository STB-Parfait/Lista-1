

public class Ex17 {
    public static void main(String[] args) {
    	double a,b,c,pa,pb,pc,f;
    	a=Prompt.lerDecimal();
    	b=Prompt.lerDecimal();
    	c=Prompt.lerDecimal();
    	pa=Prompt.lerDecimal();
    	pb=Prompt.lerDecimal();
    	pc=Prompt.lerDecimal();
    	f=((a*pa)+(b*pb)+(c*pc))/(pa+pb+pc);
    	System.out.printf("%.2f", f);
    }
}
