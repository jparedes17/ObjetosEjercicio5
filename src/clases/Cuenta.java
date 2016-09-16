/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;


import javax.swing.JOptionPane;

/**
 *
 * @author pared
 */
public class Cuenta 
{
    private long numero_cuenta;
    private long numero_identificacion;
    private double saldo_actual;
    
public Cuenta (long numero_cuenta, long numero_identificacion, double saldo_actual)
{
    this.saldo_actual= saldo_actual;
    this.numero_identificacion= numero_identificacion;
    this.numero_cuenta = numero_cuenta;
}

public Cuenta (long numero_cuenta, long numero_identificacion)
{
    this.numero_identificacion= numero_identificacion;
    this.numero_cuenta = numero_cuenta;
    this.saldo_actual= 0;
} 

    public long getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(long numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public long getNumero_identificacion() {
        return numero_identificacion;
    }

    public void setNumero_identificacion(long numero_identificacion) {
        this.numero_identificacion = numero_identificacion;
    }

    public double getSaldo_actual() {
        return saldo_actual;
    }

    public void setSaldo_actual(double saldo_actual) {
        this.saldo_actual = saldo_actual;
    }

    public void actualizar_saldo (double ian)
    {
      double aux, aux2;
      aux= (this.getSaldo_actual() *(ian/360));
      aux2= this.getSaldo_actual() + aux;
    }
    
    public void ingresar (double ingreso)
    {
        double aux;
        
        aux= this.getSaldo_actual() + ingreso;
        this.setSaldo_actual(aux);
        
    }
    
    public void retirar (double retirar)
    {
        double aux;
        aux = this.getSaldo_actual() - retirar;
        this.setSaldo_actual(aux);
        
    }
    public String mostrar ()
    {
        String aux;
        aux = "No. de Identificacion: " + this.getNumero_identificacion() + "\n"
            + "No. de Cuenta: " + this.getNumero_cuenta() + "\n"
            + "Saldo actual: "  + this.getSaldo_actual();
        
        return aux;
    }
    
    

}