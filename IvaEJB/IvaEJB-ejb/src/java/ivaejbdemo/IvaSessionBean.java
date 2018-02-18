/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivaejbdemo;

import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 *
 * @author David
 */
@WebService
@Stateless
public class IvaSessionBean implements IvaSessionBeanRemote, IvaSessionBeanLocal {

    @Override
    public double getValorIvaTotal(double n1, double n2, double n3) {
        return ((n1/n2)*n3);
        
    }


    @Override
    public double getValorIva(double n2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getValorSinIva(double n1) {
        return (n1/1.19); 
    }

    
    
}
