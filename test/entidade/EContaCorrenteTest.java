/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class EContaCorrenteTest {

    public EContaCorrenteTest() {
    }

    /**
     * Test of getSaldo method, of class EContaCorrente.
     */
    @Test
    public void casoDeTeste01_CriacaoDeContaIgual_0() {
        System.out.println("Teste 01 criar uma conta com saldo igual a 0");
        EContaCorrente instance = new EContaCorrente();
        Double expResult = new Double(0);
        Double result = instance.getSaldo();
        assertEquals(expResult, result);

    }

     @Test(expected = IllegalArgumentException.class)
    public void casoDeTeste02_CriacaoDeSaldoNulo() {
        System.out.println("Teste 02 criar uma conta com saldo igual a nulo");
        EContaCorrente instance = new EContaCorrente();
        instance.setSaldo(null);
         fail("Era esperado uma exceção teste falhou");
    }
    
     @Test
    public void casoDeTeste03_CriacaoDeContaIgual_10() {
        System.out.println("Teste 03 criar uma conta com saldo igual a 10");
        EContaCorrente instance = new EContaCorrente(10.0);
        Double expResult = 10.0;
        Double result = instance.getSaldo();
        assertEquals(expResult, result);

    }
}