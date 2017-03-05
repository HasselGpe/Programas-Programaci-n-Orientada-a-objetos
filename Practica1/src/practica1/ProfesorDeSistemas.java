package practica1;

 public final class ProfesorDeSistemas extends Persona{
    /*
    * Clase ProfesorDeSistemas que Hereda de Persona
    * Hasssel Guadalupe Ortega Pelaez 
    * NetBeans 8.1 
    * Fecha: 01/02/2017
    *
    */
     // Atributos para clase 
     private String nivelDeEstudios; 
     private int numeroDeCuenta;
     public final MateriaTI nombreMateria;

     // Construtor
    public ProfesorDeSistemas(String nivelDeEstudios, int numeroDeCuenta, String nombre, int edad, char sexo, double peso, double altura, MateriaTI nombreMateria) {
        super(nombre, edad, sexo, peso, altura);
        this.nivelDeEstudios = nivelDeEstudios;
        this.numeroDeCuenta = numeroDeCuenta;
        this.nombreMateria = nombreMateria;
    }
    
    @Override
    public String toString() {
        return "\t " +  "\t " + " ProfesorDeSistemas  " + "\n" + super.toString() + " \n"+ "NivelDeEstudios: "+ nivelDeEstudios + "\n" + 
                "NumeroDeCuenta: " + numeroDeCuenta + "\n"+ 
                "Materia impartida: " + this.nombreMateria + "\n"+
                "Calculo IMC (Peso Ideal = -1) - (Peso por debajo de el ideal = 0) - (SobrePeso =  1 )" + "\n" +
                "Resultado IMC: " + this.calcularIMC()+"\n";
    }
    
    public void setNivelDeEstudios(String nivelDeEstudios) {
        this.nivelDeEstudios = nivelDeEstudios;
    }
    
    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }  
}
