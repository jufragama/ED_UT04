/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package daw_ed04;
//PRUEBA GITHUB ACTUALIZACION
public class Main {
    public static void main(String[] args) {
        CCuenta a;
        double saldoA;
        int f = 0;
        if (f==9) {
            System.out.println("Prueba de Git");
        }
        a = new CCuenta("Felipe Segundo","2222-2222-22-1230456789", 2222,0);
        saldoA = a.estado();
        System.out.println("El saldo actual es"+ saldoA );

//        operacionBanco(a);
        System.out.println("Datos de la cuenta: "+ a.nombre + a.getCodigocuenta() + a.saldo + a.getTipoInteres());
    }

//    private static void operacionBanco(CCuenta a) {
//        try {
//            a.retirarDinero(2300);
//        } catch (Exception e) {
//            System.out.print("Fallo al retirar");
//        }
//        try {
//            System.out.println("Ingreso en cuenta");
//            a.ingresarDinero(600);
//        } catch (Exception e) {
//            System.out.print("Fallo al ingresar");
//        }
//    }
}
