package Ejercicio3.Servicios;

import Ejercicio3.Entidades.Operacion;
import java.util.Scanner;

public class OperacionServicio {

    public Operacion crearOperacion() {

        Scanner input = new Scanner(System.in);

        double num1,num2;

        System.out.println("Ingrese el primer numero:");
        num1 = input.nextDouble();

        System.out.println("Ingrese el segundo numero:");
        num2 = input.nextDouble();

        Operacion nuevaOp = new Operacion(num1, num2);

        return nuevaOp;

    }

    public double suma (Operacion _operacion) {
        return (_operacion.getNum1()+_operacion.getNum2());
    }

    public double resta (Operacion _operacion) {
        return (_operacion.getNum1()-_operacion.getNum2());
    }

    public double multiplicacion (Operacion _operacion) {

        if (_operacion.getNum1() == 0 || _operacion.getNum2() == 0) {
            return 0;
        } else {
            return (_operacion.getNum1()*_operacion.getNum2());
        }

    }

    public double division (Operacion _operacion) {

        if (_operacion.getNum1() == 0 || _operacion.getNum2() == 0) {
            return 0;
        } else {
            return (_operacion.getNum1()/_operacion.getNum2());
        }

    }

    public void setNum1 (Operacion _operacion, double num1) {
         _operacion.setNum1(num1);
    }

    public void setNum2 (Operacion _operacion, double num2) {
        _operacion.setNum2(num2);
    }

    public double getNum1 (Operacion _operacion) {
        return _operacion.getNum1();
    }

    public double getNum2 (Operacion _operacion) {
        return _operacion.getNum2();
    }
}
