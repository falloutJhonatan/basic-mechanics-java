
public class CaelumCapitulo3Q6 {
	public static void main(String[] args){
		fibonacci(0,1);
	}
	
	private static void fibonacci(int x, int y){
		if(y < 100){
			fibonacci(y, y+x);
		}
		System.out.println(x);
	}
}
