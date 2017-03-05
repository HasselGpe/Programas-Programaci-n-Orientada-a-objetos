package practica1;

public final class EstudianteDeSistemas extends Persona{
    /*
    * Clase EstudianteDeSistemas que Hereda de Persona
    * Hasssel Guadalupe Ortega Pelaez 
    * NetBeans 8.1 
    * Fecha: 01/02/2017
    *
    */
    // Atributos de la clase
    private int numeroDeCuenta;
    
    // Constructor 
    public EstudianteDeSistemas(int numeroDeCuenta, String nombre, int edad, char sexo, double peso, double altura) {
        super(nombre, edad, sexo, peso, altura);
        this.numeroDeCuenta = numeroDeCuenta;
    }
    
    // Metodo "Setter"
    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }
    
    @Override
    public String toString() {
        return  "\t " + "EstudianteDeSistemas  " + "\n " + super.toString() + "\n"+
                "NumeroDeCuenta: " + numeroDeCuenta + "\n"+
                "Calculo IMC (Peso Ideal = -1) - (Peso por debajo de el ideal = 0) - (SobrePeso = 1 )" + "\n" +
                "Resultado IMC: " + this.calcularIMC()+"\n";
    }  
}
