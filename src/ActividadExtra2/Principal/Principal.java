/*
Se está realizando una calculadora grafica, y se requiere calcular algunas áreas y perímetros de unas figuras
geométricas. Las figuras son las siguientes: Cuadrado, Rectángulo, Triangulo, Circulo, Hexágono, Pentágono y Rombo.
El usuario debe elegir la figura geométrica, luego debe ingresar el/los dato/s de la figura geométrica elegida
y le debe mostrar por pantalla el área y el perímetro.
Aclaración: Si el usuario elige una figura, se debe crear un objeto de esa figura seleccionada,
y realizar los cálculos para luego mostrar en pantalla.
 */

package ActividadExtra2.Principal;

import ActividadExtra2.Entidades.Figura;
import ActividadExtra2.Servicios.FiguraServicio;

public class Principal {
    public static void main(String[] args) {

        FiguraServicio figSer = new FiguraServicio();

        Figura figura = figSer.crearFigura();

        System.out.println("El perímetro de la figura ingresada es: " + figSer.calcularPerimetro(figura));
        System.out.println("El área de la figura ingresada es: " + figSer.calcularArea(figura));

    }
}