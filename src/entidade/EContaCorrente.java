/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author aluno
 */
public class EContaCorrente {

    private Double saldo = 0.0;

    public EContaCorrente() {
    }

    public EContaCorrente(Double saldo) {
        this.saldo = saldo;

    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {

        if (saldo == null) {
            throw new IllegalArgumentException("Não é permitido nulo");

        }
        this.saldo = saldo;
    }

}
