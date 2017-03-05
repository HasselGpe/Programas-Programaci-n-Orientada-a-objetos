package componenteawt;
import java.awt.*;
public class MiCanvas extends Canvas {
    public void paint(Graphics g){
     int w = getWidth();// Para el ancho 
     int h = getHeight();// Para el alto
     g.drawRect(0, 0, w-1,h-1);//Dibuja el rectangulo
     g.drawString("Canvas", w-g.getFontMetrics().stringWidth("Canvas")/1, 20);//Dibuja el "Canvas" y con w(ancho) - g.getFontMetrics()
     // define el objeto y un determinado tipi de letra y con stringWidth muestra la cadena dandole de izquierda a derecha con las
     // cordenadas con el primer numero que recorre mas a la izquierda y el segundo numero que recorre hacia abajo
     g.setFont(new Font("Helvetica", Font.PLAIN, 8));//Selecciona la letra deseada 
     g.drawLine(10, 10, 100, 100);//Dibuja la linea en la cordenada 10 que empieza desde arriba(en 10) a la 100 que es la que se 
     //dibuja hacia abajo(hasta 100)
     g.fillRect(9, 9, 3, 3);//El rectangulo dibujado en el canvas antes de la cordenada 10 y los segundos numeros 
     // son el ancho y la altura de el rectangulo
     g.drawString("(10,10)", 13, 10);//Me dibuja el "(10,10)" la primera cordenada lo mueve para la izquierda y la segunda va 
     //hacia abajo
     g.fillRect(49, 49, 3, 3);//El rectangulo dibujado en el canvas antes de la cordenada 50 y los segundos numeros 
     // son el ancho y la altura de el rectangulo
     g.drawString("(50,50)", 53, 50);//Me dibuja el ("50,50)" la primera cordenada lo mueve para la izquierda y la segunda va 
     //hacia abajo
     g.fillRect(99, 99, 3, 3);//El rectangulo dibujado en el canvas antes de la cordenada 100 y los segundos numeros 
     // son el ancho y la altura de el rectangulo
     g.drawString("(100, 100)", 103, 100);//Me dibuja el "(100, 100)" la primera cordenada lo mueve para la izquierda y la segunda va 
     //hacia abajo
    }
}
