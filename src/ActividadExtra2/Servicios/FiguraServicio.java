package ActividadExtra2.Servicios;

import java.util.Scanner;
import ActividadExtra2.Entidades.Figura;

public class FiguraServicio {

    Scanner scan = new Scanner(System.in);

    public Figura crearFigura() {

        int opc, medida1, medida2;

        System.out.println("Ingrese el tipo de figura: ");
        System.out.println("1.Cuadrado\n2.Rectángulo\n3.Triángulo Equilatero\n4.Círculo\n5.Hexágono Regular\n6.Pentágono Regular\n7.Rombo");
        opc = scan.nextInt();

        switch(opc) {

            case 1:

                System.out.println("Ingrese la medida del lado: ");
                medida1 = scan.nextInt();

                return new Figura(medida1,0,opc,"Cuadrado");

            case 2:

                System.out.println("Ingrese la medida de la base: ");
                medida1 = scan.nextInt();

                System.out.println("Ingrese la medida de la altura: ");
                medida2 = scan.nextInt();

                return new Figura(medida1,medida2,opc,"Rectángulo");

            case 3:

                System.out.println("Ingrese la medida de los lados: ");
                medida1 = scan.nextInt();

                return new Figura(medida1,0,opc,"Triángulo");

            case 4:

                System.out.println("Ingrese el radio del círculo: ");
                medida1 = scan.nextInt();

                return new Figura(medida1,0,opc,"Círculo");

            case 5:

                System.out.println("Ingrese la medida del lado: ");
                medida1 = scan.nextInt();

                return new Figura(medida1,0,opc,"Hexágono");

            case 6:

                System.out.println("Ingrese la medida del lado: ");
                medida1 = scan.nextInt();

                return new Figura(medida1,0,opc,"Pentágono");

            case 7:

                System.out.println("Ingrese la medida de la diagonal menor: ");
                medida1 = scan.nextInt();
                System.out.println("Ingrese la medida de la diagonal mayor: ");
                medida2 = scan.nextInt();

                return new Figura(medida1,medida2,opc,"Rombo");

            default:

                System.out.println("Opción incorrecta.");
                return new Figura();
        }
    }

    public double calcularPerimetro(Figura _figura) {

        switch(_figura.getId()) {

            case 1:
                return _figura.getMedida1() * 4;
            case 2:
                return (_figura.getMedida1() + _figura.getMedida2()) * 2;
            case 3:
                return _figura.getMedida1() * 3;
            case 4:
                return Math.PI * _figura.getMedida1() * 2;
            case 5:
                return _figura.getMedida1() * 6;
            case 6:
                return _figura.getMedida1() * 5;
            case 7:
                return Math.sqrt(Math.pow(_figura.getMedida1(),2) + Math.pow(_figura.getMedida2(),2)) * 2;
            default:
                return 0;
        }
    }

    public double calcularArea(Figura _figura) {
        
        switch(_figura.getId()) {
            case 1:
                return Math.pow(_figura.getMedida1(),2);
            case 2:
                return _figura.getMedida1() * _figura.getMedida2();
            case 3:
                return _figura.getMedida1() * Math.sqrt(Math.pow(_figura.getMedida1(),2) - Math.pow(_figura.getMedida1()/2,2)) / 2;
            case 4:
                return Math.PI * Math.pow(_figura.getMedida1(),2);
            case 5:
                return _figura.getMedida1() * Math.sqrt(Math.pow(_figura.getMedida1(),2) - Math.pow(_figura.getMedida1()/2,2)) * 3;
            case 6:
                return 5 * Math.pow(_figura.getMedida1(),2) / (4 *Math.tan(Math.PI/5));
            case 7:
                return _figura.getMedida1() * _figura.getMedida2() / 2;
            default:
                return 0;
        }
    }
}
