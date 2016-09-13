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
    private double saldo_actual;
    private double retirar_saldo;
    private double ingresar_saldo;
    
public Cuenta (double saldo_actual)
{
    this.saldo_actual= saldo_actual;
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

    
    
    public double ingresar ()
    {
        double op;
        op= this.saldo_actual+this.ingresar_saldo;
        
        return op;
    }
    public Cuenta retirar(Cuenta p)
    {
        Cuenta persona;
      double retirar = p.retirar_saldo;
              
      
      if (this.saldo_actual<p.retirar_saldo)
      {
          JOptionPane.showMessageDialog(null, "No se puede retirar ese dinero","ERROR" , JOptionPane.ERROR_MESSAGE);
      }
      else 
      {
          retirar= (this.saldo_actual)-(retirar);
      }
      persona = new Cuenta (retirar);
      return persona;
    }
}
    
