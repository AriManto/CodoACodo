package com.arielmanto.gestionproductos;

public class ProductoRefrigerado extends Producto{
    private String codOrgSupervisor;

    public String getCodOrgSupervisor() {return codOrgSupervisor;}
    public void setCodOrgSupervisor(String codOrgSupervisor) {this.codOrgSupervisor = codOrgSupervisor;}

    public String toString(){
        return super.toString() + "\nCodigo: "+this.codOrgSupervisor;
    }

    ProductoRefrigerado(){
        super();
        this.codOrgSupervisor = "";
    }
    ProductoRefrigerado(String fechaCad, int numLote, String codigo){
        super(fechaCad, numLote);
        this.codOrgSupervisor = codigo;
    }
}
