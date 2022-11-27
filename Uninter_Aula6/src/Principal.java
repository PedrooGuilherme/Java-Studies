
public class Principal {
	public static void main(String[] args) {
		
		Usuario m1 = new Usuario("111.222.333-44","Mario",1);
		Usuario m2 = new Usuario("111.222.333-44","Mario",1);
		Usuario m3 = new Usuario("555.666.777-88","Luigi",2);
		
		System.out.println(m1.equals(m2));
		System.out.println(m1== m2);
		System.out.println(m1.equals(m3));
	}
}
