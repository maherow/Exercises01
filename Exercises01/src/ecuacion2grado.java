
public class ecuacion2grado {

	public ecuacion2grado() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
//Creamos las variables a, b, y c:
		int a,b,c;
		String ecuacion;
//Pedimos al usuario que escriba la ecuacion de segundo grado (ax+bx+c=0).
		do {
		System.out.println("Introduzca a:");
		a=entrada.entero();
		if(a<=0) System.out.println("valor no válido, repite entrada");
		}while(a<=0);
		do {
		System.out.println("Introduzca b:");
		b=entrada.entero();
		if(b<=0) System.out.println("valor no válido, repite entrada");
	}while(b<=0);
		do {
		System.out.println("Introduzca c:");
		c=entrada.entero();
		if(c<0) System.out.println("valor no válido, repite entrada");
		}while(c<=0);
		
		if((a>0)&&(b>0)&&(c>0))
		System.out.println("La ecuación es: "+a+"x^2 +"+b+"x +" +c+"=0");
		else System.out.println("LA ecuación tiene numeros negativos joder");
	}
		
	/*public static void discriminante (int a, int b, int c) {
		System.out.println("El valor del discriminante es: "+ (b*b-4*a*c));
		*/
	}


