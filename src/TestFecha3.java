import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TestFecha3 {
	public static void main(String[]args)throws IOException{
		int dia,mes,anyo;
		System.out.println("Introduce un d�a:"); 
		BufferedReader entrada= new BufferedReader(new InputStreamReader (System.in));
		dia=Integer.parseInt(entrada.readLine()); 
		System.out.println("Introduce un mes:"); 
		mes = Integer.parseInt(entrada.readLine());
		System.out.println("Introduce un anyo:"); 
		anyo= Integer.parseInt(entrada.readLine()); 
		Fecha3 f1 = new Fecha3(dia,mes,anyo);
		if(f1.valida())
			System.out.println("La fecha: "+dia+"/"+mes+"/"+anyo+" es v�lida");
		else
			System.out.println("La fecha:"+dia+"/"+mes+"/"+anyo+" NO es v�lida");
	}
}

