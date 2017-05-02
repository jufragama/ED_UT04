/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package daw_ed04;

/**
 *
 * @author Juanfran
 */
public class CCuenta {

    /**
     *
     */
    protected String nombre;

    /**
     *
     */
    protected String codigocuenta;

    /**
     *
     */
    protected String contrasena; //contraseña del acceso web

    /**
     *
     */
    protected double saldo;

    /**
     *
     */
    protected double tipoInteres;

    /**
     *
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre=nom;
        codigocuenta=cue;
        saldo=sal;
    }

    /**
     *
     * @param nom
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    /**
     *
     * @return
     */
    public String obtenerNombre()
    {
        return nombre;
    }

    /**
     *
     * @return
     */
    public double estado()
    {
        return saldo;
    }

    /**
     *
     * @param cantidad
     * @throws Exception
     */
    public void ingresarDinero(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(saldo + cantidad);
    }

    /**
     *
     * @param cantidad
     * @throws Exception
     */
    public void retirarDinero(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(saldo - cantidad);
    }
    
    /**
     *
     * @param tantoPorCiento
     * @return
     */
    public double porcentaje(double tantoPorCiento){
        return saldo*tantoPorCiento/100;
        
    }

    /**
     * @param nombre the nombre to set
     */
    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the codigocuenta
     */
    protected String getCodigocuenta() {
        return codigocuenta;
    }

    /**
     * @param codigocuenta the codigocuenta to set
     */
    protected void setCodigocuenta(String codigocuenta) {
        this.codigocuenta = codigocuenta;
    }

    /**
     * @param contrasena the contrasena to set
     */
    protected void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * @param saldo the saldo to set
     */
    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInteres
     */
    protected double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * @param tipoInteres the tipoInteres to set
     */
    protected void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
