import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class Ejercicios {
	
	//Devuelve true si todos los elementos de 'mi_lista' son pares, de lo contrario devuelve false
	//en este caso se declaran una variable para ver si es par
	//se hace una comparacion si todos los numeros son pares nos devolvera true 
	//de lo contrario false.
	static boolean sonPares(ArrayList<Integer> mi_lista)
	{
				int sonpares=0;	
		for(int i=0;i<mi_lista.size();i++){
		if(mi_lista.get(i)%2==0){
						sonpares++;
		}
	if (sonpares==mi_lista.size()){
		return true;
	}
		
	
		}
		return false;
	}
            
	
	//Devuelve el numero menor almacenado en 'mi_lista'
	//obtiene la variable para poder hacer la comparacion si es menor o no
	//obtiene todos los valores de la lista y hace la comparacion
	//luego nos devuelve el menor
	static int getMenor(ArrayList<Integer> mi_lista)
	{
        int getmenor=mi_lista.get(0);
		
		for(int i=0;i<mi_lista.size();i++){
		if(mi_lista.get(i)<getmenor){
			getmenor=mi_lista.get(i);
		}
	
		}
		return getmenor;
	}
	
	//Devuelve el numero menor de un archivo
	//Dado, el archivo unicamente contiene enteros
	//declaramos la variable mayor
	//tambien se declara un numero por medio de while se hace la comparacion
	//si el numero es mayor entonces nos devolvera mayor de lo contrario nos causara
	//una exception.
	static int getNumeroMayor(String nombre_archivo)
	{
		int mayor = -9999;
		try
		{
			File archivo = new File(nombre_archivo);
			Scanner s = new Scanner(archivo);
			while (s.hasNext())
			{
				int num = s.nextInt();
				if (num>mayor)
					mayor=num;
			}
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		return mayor;
	}
	
	//Devuelve cuantas veces existe la string buscada en el archivo con nombre nombre_archivo
	static int cuantasVecesExiste(String nombre_archivo, String buscada)
	{
		try
		{
			File archivo = new File("nombre_archivo");
			Scanner s = new Scanner(nombre_archivo);
			while(s.hasNext())
			System.out.print(s.next());
		}catch (Exception e)
		{
			e.printStackTrace();
		}
			return -1;
	}
}
