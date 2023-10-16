package br.com.webank.webank.dto.endereco;

import br.com.webank.webank.dto.titular.TitularRequestDTO;

public class EnderecoRequestDTO {
    
    protected String cep;
    protected String logradouro;
    protected int numero;
    protected String complemento;
    protected String bairro;
    protected String cidade;
    protected String uf;
    private TitularRequestDTO titular;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    } 

    public TitularRequestDTO getTitular() {
        return titular;
    }

    public void setTitular(TitularRequestDTO titular) {
        this.titular = titular;
    }

    
}
