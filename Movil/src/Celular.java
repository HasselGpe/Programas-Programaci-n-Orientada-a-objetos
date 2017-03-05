public class Celular {
   private String modelo;
   private int numero;
   private double precio;

    public Celular() {
    }

   
    public Celular(String modelo, int numero, double precio) {
        this.modelo = modelo;
        this.numero = numero;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public int getNumero() {
        return numero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
        @Override
    public String toString() {
        return "       Celular    " + "\n" + "modelo:  " + modelo + "\n" + "numero:  " + numero + "\n" + "precio:  " + precio + "\n";
    } 
}
