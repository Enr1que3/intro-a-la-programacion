import java . io . *;

public class Main{
    public static void main(String args[]) throws IOException {

        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System . in));

        String respuesta;

        int incremPuer;

        incremPuer = 0;

        Coche miCoche = new Coche(incremPuer);

        do {

            do {
                System.out.print("agregar puerta al coche? (s/n): ");
                respuesta = bufEntrada.readLine();
                respuesta = respuesta.toLowerCase();

            } while (!(respuesta.equals("s") || respuesta.equals("n")));

            if (respuesta.equals("s")) {
    
                incremPuer=miCoche.puertas(incremPuer);
                System.out.println("Número de puertas que tiene el objeto: "+incremPuer);

            }

        } while (!respuesta.equals("n"));

    }

}

class Coche {
   int puertas;

   Coche (int p) {

        puertas=p;

    }
   int puertas(int incremPuer){

        return incremPuer+1;

    }

}
