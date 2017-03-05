package practica1;  
public class MateriaTI {
    public  String nombreMateria;
    public MateriaTI(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    } 

    @Override
    public String toString() {
        return nombreMateria;
    }
    
}