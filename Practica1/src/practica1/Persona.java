package practica1;
abstract public class Persona {
    /*
    * Clase Persona 
    * Hasssel Guadalupe Ortega Pelaez 
    * NetBeans 8.1 
    * Fecha: 01/02/2017
    *
    */
    
    // Atributos de la clase 
    private String nombre; 
    private char sexo;
    private  int edad;
    private double peso, altura; 
    
    // Atributos para el Indice de Masa Corporal
    private final double  limiteDesnutricion = 18.0; 
    private final double  limiteSobrepeso = 25.0; 
    private final int  marcaDesnutricion = -1;  
    private final int  marcaNormal = 0; 
    private final int  marcaSobrepeso = 1;  
    
    //Constructor Persona
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;   
    }
    // Metodo para el Calculo de Indice de Masa Corporal
    public int calcularIMC(){   double IMC = (peso / (altura*altura));   
    int result = marcaNormal;   if (IMC < limiteDesnutricion) {           
        result = marcaDesnutricion;   } else if (IMC > limiteSobrepeso) {   
        result = marcaSobrepeso;   }   return result;  }   
    
    // Metodos "Setters"
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    } 

    @Override
    public String toString() {
        return "\n"+"Nombre: " + nombre+"\n"+ 
                      "Sexo:   " + sexo + "\n"+ 
                      "Edad:   " + edad + "\n"+
                      "Peso:   " + peso + "\n"+ 
                      "Altura: " + altura;
    }   
}
