package beans;

import java.io.Serializable;

public class Cargo implements Serializable {

    private int codigoCargo;
    private String nomeCargo;
    private boolean permissaoCargos;
    private boolean permissaoCarros;
    private boolean permissaoItinerarios;
    private boolean permissaoVendas;
    private boolean permissaoCustos;

    public Cargo() {
    }

    /**@return O código do cargo.*/
    public int getCodigoCargo() {
        return codigoCargo;
    }

    public void setCodigoCargo(int codigoCargo) {
        this.codigoCargo = codigoCargo;
    }

    /**@return O nome do cargo.*/
    public String getNomeCargo() {
        return nomeCargo;
    }

    public void setNomeCargo(String nomeCargo) {
        this.nomeCargo = nomeCargo;
    }

    /**@return <code>true</code> caso o cargo tem permissão no módulo "cargo", 
     * caso contrário o retorno <code>false</code>.*/
    public boolean isPermissaoCargos() {
        return permissaoCargos;
    }

    public void setPermissaoCargos(boolean permissaoCargos) {
        this.permissaoCargos = permissaoCargos;
    }

    /**@return <code>true</code> caso o cargo tenha permissão no módulo "carro", 
     * caso contrário retorna <code>false</code>.*/
    public boolean isPermissaoCarros() {
        return permissaoCarros;
    }

    public void setPermissaoCarros(boolean permissaoCarros) {
        this.permissaoCarros = permissaoCarros;
    }

    /**@return <code>true</code> caso o cargo tem permissão no módulo
     * "itinerarios", caso contrário retorna <code>false</code>.*/
    public boolean isPermissaoItinerarios() {
        return permissaoItinerarios;
    }

    public void setPermissaoItinerarios(boolean permissaoItinerarios) {
        this.permissaoItinerarios = permissaoItinerarios;
    }

    /**@return <code>true</code> caso o cargo tem permissão no módulo "vendas", 
     * caso contrário retorna <code>false</code>.*/
    public boolean isPermissaoVendas() {
        return permissaoVendas;
    }

    public void setPermissaoVendas(boolean permissaoVendas) {
        this.permissaoVendas = permissaoVendas;
    }

    /**@return <code>true</code> caso o cargo tem permissão no módulo "custos", 
     * caso contrário retorna <code>false</code>.*/
    public boolean isPermissaoCustos() {
        return permissaoCustos;
    }

    public void setPermissaoCustos(boolean permissaoCustos) {
        this.permissaoCustos = permissaoCustos;
    }
}