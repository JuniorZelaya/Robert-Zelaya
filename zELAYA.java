import java.util.Scanner;
public class zELAYA {
//Este ejercicio lo copie de Fredy Puerto https://github.com/fredypuerto/Quiz/blob/master/src/Quiz.java
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		System.out.println("Cuestionario");
		System.out.println("¿Cuanto años estuvo Honduras sin ir a un mundial?");

		int x = s.nextInt();
		if (x==28)
			System.out.println("Correcto");
		else
			System.out.println("Incorrecto");


		System.out.println("¿A cuantos mundiales a ido Honduras?");
		int f = s.nextInt();
		if (f==3)
			System.out.println("Correcto");
		else
			System.out.println("Incorrecto");


		System.out.println("¿Cuantos años gobierna un presidente en Honduras?");
		int b = s.nextInt();
		if (b==4)
			System.out.println("Correcto");
		else
			System.out.println("Incorrecto");


		System.out.println("¿Cuantos titulos tiene olimpia?");
		int w = s.nextInt();
		if (w==28)
			System.out.println("Correcto");
		else
			System.out.println("Incorrecto");


		System.out.println("¿Cuantos equipos hay en liga nacional?");
		int g = s.nextInt();
		if (g==10)
			System.out.println("Correcto");
		else
			System.out.println("Incorrecto");


		int p1;
		if (x==28)
			p1=20;
		else
			p1=0;

		int p2;
		if (f==3)
			p2=20;
		else
			p2=0;

		int p3;
		if (b==4)
			p3=20;
		else
			p3=0;

		int p4;
		if (w==28)
			p4=20;
		else
			p4=0;

		int p5;
		if (g==10)
			p5=20;
		else
			p5=0;

		System.out.println("Su porcentaje de respuestas es: ");
		System.out.println(p1+p2+p3+p4+p5+("%"));

	}

}

