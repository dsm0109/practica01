import java.io.FileNotFoundException;
import java.io.IOException;
import com.csvreader.CsvReader;
import com.csvreader.CsvReader;
import java.util.ArrayList;

public class Practica01 {
 
    public static void main(String[] args) {

        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
        ArrayList<Cliente> query = new ArrayList<Cliente>();
        ArrayList<String> query_2;
        Consulta consulta;

        try {
         
        CsvReader mi_csv = new CsvReader("./P1.csv");
        mi_csv.readHeaders();
         
        while (mi_csv.readRecord())
        {
            Cliente cliente = new Cliente(
            	mi_csv.get(0),
            	mi_csv.get(1),
            	mi_csv.get(2),
            	mi_csv.get(3),
            	Float.parseFloat(mi_csv.get(4)),
            	Float.parseFloat(mi_csv.get(5)),
            	Float.parseFloat(mi_csv.get(6))
            	);

            listaClientes.add(cliente);
        }
         
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        consulta = new Consulta(listaClientes);
        //query = consulta.listaPropiedadesBaratas(10);
        //query = consulta.listaPropiedadesCaras(5);
        //query = consulta.listaMayorMargenGanancia(5);
        //query_2 = consulta.listaClienteMasUnInmueble();
        //query = consulta.ejercicio1();
        //query = consulta.ejercicioExtra1();
        //query = consulta.listaMayorM2(10);
        //query = consulta.listaMenorM2(10);

        //System.out.println(query);

    }
}
