
public class Ex15 {
    public static void main(String[] args) {
    	double xa,ya,xb,yb,r;
    	xa = Prompt.lerDecimal();
    	ya = Prompt.lerDecimal();
    	xb = Prompt.lerDecimal();
    	yb = Prompt.lerDecimal();
    	r = Math.sqrt(Math.pow((xb-xa),2)+Math.pow((yb-ya),2));
    	
    	System.out.printf("%.2f", r);
    }
}
