import java.util.ArrayList;
import java.lang.RuntimeException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


class Consulta{

	//Atributos
	ArrayList<Cliente> directorio = new ArrayList<Cliente>();

	public Consulta(ArrayList<Cliente> directorio){
		this.directorio = directorio;
	}

	public ArrayList<Cliente> listaPropiedadesBaratas(int n){

		ArrayList<Cliente> query = new ArrayList<Cliente>();

		if (n > this.directorio.size() || n < 0)
			throw new RuntimeException("Error: indice fuera de rango");
		if (n == 0)
			return query;

		Collections.sort(this.directorio, new Comparator<Cliente>() {

			@Override
			public int compare(Cliente cliente2, Cliente cliente1)
			{
				return  (cliente1.getValorVenta() > cliente2.getValorVenta() ? -1 : (cliente1.getValorVenta() < cliente2.getValorVenta() ? 1 : 0 ));
			}
		});


		for (int i=0; i<n; i++){
			query.add(this.directorio.get(i));
		}

		return query;
	}


	public ArrayList<Cliente> listaPropiedadesCaras(int n){

		ArrayList<Cliente> query = new ArrayList<Cliente>();

		if (n > this.directorio.size() || n < 0)
			throw new RuntimeException("Error: indice fuera de rango");
		if (n == 0)
			return query;

		Collections.sort(this.directorio, new Comparator<Cliente>() {

			@Override
			public int compare(Cliente cliente2, Cliente cliente1)
			{
				return  (cliente1.getValorVenta() > cliente2.getValorVenta() ? 1 : (cliente1.getValorVenta() < cliente2.getValorVenta() ? -1 : 0 ));
			}
		});


		for (int i=0; i<n; i++){
			query.add(this.directorio.get(i));
		}

		return query;

	}

	public ArrayList<Cliente> listaMayorMargenGanancia(int n){

		ArrayList<Cliente> query = new ArrayList<Cliente>();

		if (n > this.directorio.size() || n < 0)
			throw new RuntimeException("Error: indice fuera de rango");
		if (n == 0)
			return query;

		Collections.sort(this.directorio, new Comparator<Cliente>() {

			@Override
			public int compare(Cliente cliente2, Cliente cliente1)
			{
				return  ((cliente1.getValorVenta() - cliente1.getValorPropiedad()) > (cliente2.getValorVenta() - cliente2.getValorPropiedad()) ? 1 
					: (cliente1.getValorVenta() - cliente1.getValorPropiedad()) < (cliente2.getValorVenta() - cliente2.getValorPropiedad()) ? -1 
					: 0 );
			}
		});


		for (int i=0; i<n; i++){
			query.add(this.directorio.get(i));
		}

		return query;
	}

	public ArrayList<String> listaClienteMasUnInmueble(){

		String[] nombres = new String[this.directorio.size() -1];
		ArrayList<String> salida = new ArrayList<String>();

		for (int i=0; i<nombres.length; i++){
			nombres[i] = this.directorio.get(i).getNombre();
		}

		Arrays.sort(nombres);

		for (int i=0; i<nombres.length-1; i++){
			if (nombres[i].equals(nombres[i+1])){
				if(salida.size() == 0 || !(nombres[i].equals(salida.get(salida.size() - 1))))
					salida.add(nombres[i]);
			}
		}

		return salida;
	}

	public ArrayList<Cliente> ejercicio1(){
		ArrayList<Cliente> query = new ArrayList<Cliente>();

		for (Cliente c : this.directorio){
			if(c.getM2Propiedad() < 200 && c.getValorVenta() >= 50000 && c.getValorVenta()<= 500000){
				query.add(c);
			}
		}

		return query;
	}
	

	public ArrayList<Cliente> ejercicioExtra1(){
		ArrayList<Cliente> query = new ArrayList<Cliente>();

		for (Cliente c : this.directorio){
			String direccion = c.getDireccion();

			Pattern p = Pattern.compile("(.*)(2824)(.*)");
 			Matcher m = p.matcher(direccion);
 			boolean b = m.matches();

			if(b)
				query.add(c);
		}

		return query;
	}


	public ArrayList<Cliente> listaMayorM2(int n){

		ArrayList<Cliente> query = new ArrayList<Cliente>();

		if (n > this.directorio.size() || n < 0)
			throw new RuntimeException("Error: indice fuera de rango");
		if (n == 0)
			return query;

		Collections.sort(this.directorio, new Comparator<Cliente>() {

			@Override
			public int compare(Cliente cliente2, Cliente cliente1)
			{
				return  (cliente1.getM2Propiedad() > cliente2.getM2Propiedad() ? 1 : (cliente1.getM2Propiedad() < cliente2.getM2Propiedad() ? -1 : 0 ));
			}
		});


		for (int i=0; i<n; i++){
			query.add(this.directorio.get(i));
		}

		return query;
	}


	public ArrayList<Cliente> listaMenorM2(int n){

		ArrayList<Cliente> query = new ArrayList<Cliente>();

		if (n > this.directorio.size() || n < 0)
			throw new RuntimeException("Error: indice fuera de rango");
		if (n == 0)
			return query;

		Collections.sort(this.directorio, new Comparator<Cliente>() {

			@Override
			public int compare(Cliente cliente2, Cliente cliente1)
			{
				return  (cliente1.getM2Propiedad() > cliente2.getM2Propiedad() ? -1 : (cliente1.getM2Propiedad() < cliente2.getM2Propiedad() ? 1 : 0 ));
			}
		});


		for (int i=0; i<n; i++){
			query.add(this.directorio.get(i));
		}

		return query;
	}





}
