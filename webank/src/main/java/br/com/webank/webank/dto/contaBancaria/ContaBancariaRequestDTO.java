package br.com.webank.webank.dto.contaBancaria;

import br.com.webank.webank.dto.titular.TitularRequestDTO;

public class ContaBancariaRequestDTO {
   
    private String agencia;
    private String numero; 
    private double saldo;
    private TitularRequestDTO titular;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public TitularRequestDTO getTitular() {
        return titular;
    }

    public void setTitular(TitularRequestDTO titular) {
        this.titular = titular;
    }

}
