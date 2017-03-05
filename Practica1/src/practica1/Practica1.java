package practica1;
import static java.lang.System.in;
import java.util.Scanner;
public class Practica1 { 
    public static void main(String[] args) {   
    /*
    * Clase Prueba
    * Hasssel Guadalupe Ortega Pelaez 
    * NetBeans 8.1 
    * Fecha: 01/02/2017
    *
    */
        System.out.println("dhdhdhd");
        Scanner sc = new Scanner(in);
        int eleccion = sc.nextInt();
       MateriaTI materia1 = new MateriaTI("Redes 2");
       MateriaTI materia2 = new MateriaTI("Matematicas");
       Persona Participantes []= new Persona[6];
       
    
                   Participantes[0] = new ProfesorDeSistemas("Maestria", 11297865, "Santiago Rodriguez Sanchez", 58, 'H', 60, 1.85, materia1);
                   Participantes[1] = new ProfesorDeSistemas("Licenciatura",10908743, "Emanuel Ortega Soto", 31, 'H', 74, 1.69, materia2);
  
                   Participantes[2] = new EstudianteDeSistemas(11267893, "Camila Kordei Pedraza", 20, 'M', 56, 1.63);
                   Participantes[3] = new EstudianteDeSistemas(15784321, "Alison Ramirez Lopez", 21, 'M', 78, 1.82);
                   Participantes[4] = new EstudianteDeSistemas(13098043, "Omar Rodolfo Ortega", 26, 'H', 90, 1.69);
                   Participantes[5] = new EstudianteDeSistemas(16789032, "Daniel Villa Salazar", 19, 'H', 75, 1.71);
       
     for(int ciclo = 0; Participantes.length > ciclo; ciclo++){
                System.out.println(Participantes[ciclo].toString()+ "\n");
      }
   }
}
