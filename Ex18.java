

public class Ex18 {
    public static void main(String[] args) {
    	double a,b,c,f;
    	a=Prompt.lerDecimal();
    	b=Prompt.lerDecimal();
    	c=Prompt.lerDecimal();
    	f=(3/((1/a)+(1/b)+(1/c)));
    	System.out.printf("%.2f", f);
    }
}
