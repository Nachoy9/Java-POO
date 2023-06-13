/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
 */

package Ejercicio4.Principal;

import Ejercicio4.Entidades.Rectangulo;
import Ejercicio4.Servicios.RectanguloServicio;

public class Principal {

    public static void main(String[] args) {

        RectanguloServicio rectServ = new RectanguloServicio();

        Rectangulo rec = rectServ.crearRectangulo();

        System.out.println("\nEl area del rectangulo es: " + rectServ.area(rec));
        System.out.println("El area del rectangulo es: " + rectServ.perimetro(rec));

        System.out.println("\nEl triangulo dibujado queda:\n");
        rectServ.dibujarRect(rec);
    }
}
