/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivaejbdemo;

import javax.ejb.Remote;

/**
 *
 * @author David
 */
@Remote
public interface IvaSessionBeanRemote {

    double getValorSinIva(double n1);

    double getValorIva(double n2);

    double getValorIvaTotal(double n1, double n2, double n3);
    
}
