package com.alef.erp.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.alef.erp.model.Empresa;
import com.alef.erp.repository.Empresas;

@Named("gestaoEmpresasBean")
@ViewScoped
public class GestaoEmpresasBean implements Serializable {
	
	@Inject
    private Empresas empresas;
    
    private List<Empresa> listaEmpresas;
    
    public void todasEmpresas() {
        listaEmpresas = empresas.todas();
        System.out.println("Executando o método todasEmpresas...");
    }
    
    public List<Empresa> getListaEmpresas() {
        return listaEmpresas;
    }
}
