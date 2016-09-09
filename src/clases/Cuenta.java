/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author pared
 */
public class Cuenta 
{
    private long numero_cuenta;
    private double saldo_actual=0;
    private double retirar_saldo;
    private double ingresar_saldo;
    
public Cuenta (long numero_cuenta, double saldo_actual, double retirar_saldo, double ingresar_saldo)   
{
    this.numero_cuenta= numero_cuenta;
    this.saldo_actual= saldo_actual;
    this.retirar_saldo= retirar_saldo;
    this.ingresar_saldo= ingresar_saldo;
} 

    public Cuenta(ArrayList<Cuenta> numidentf, ArrayList<Cuenta> saldoactual, ArrayList<Cuenta> montsacar, ArrayList<Cuenta> montingre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getIngresar_saldo() {
        return ingresar_saldo;
    }

    public void setIngresar_saldo(double ingresar_saldo) {
        this.ingresar_saldo = ingresar_saldo;
    }

    public double getRetirar_saldo() {
        return retirar_saldo;
    }

    public void setRetirar_saldo(double retirar_saldo) {
        this.retirar_saldo = retirar_saldo;
    }

    public long getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(long numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public double getSaldo_actual() {
        return saldo_actual;
    }

    public void setSaldo_actual(long saldo_actual) {
        this.saldo_actual = saldo_actual;
    }

    
    
    public Cuenta Ingresar (Cuenta p)
    {
        double saldo, interes, retirar, ingresar, op;
        long numeros;
        Cuenta persona;
        numeros=p.numero_cuenta;
        saldo= p.saldo_actual;
        retirar= p.retirar_saldo;
        ingresar= p.ingresar_saldo;
        op= saldo+ingresar;
        persona= new Cuenta (numeros, op,retirar, ingresar);
        return persona;
    }
    public Cuenta retirar (Cuenta p)
    {
      double saldo, interes, retirar = 0, ingresar;
      long numeros;
      Cuenta persona;
      saldo= p.saldo_actual;
      numeros= p.numero_cuenta;
      ingresar= p.ingresar_saldo;
      
      if (p.saldo_actual<p.retirar_saldo)
      {
          JOptionPane.showMessageDialog(null, "No se puede retirar ese dinero","ERROR" , JOptionPane.ERROR_MESSAGE);
      }
      else 
      {
          retirar= p.saldo_actual-p.retirar_saldo;
      }
      persona = new Cuenta (numeros, saldo,retirar, ingresar);
      return persona;
    }
}
