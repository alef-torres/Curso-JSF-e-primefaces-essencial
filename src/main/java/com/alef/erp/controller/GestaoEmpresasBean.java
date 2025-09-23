package com.alef.erp.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.alef.erp.model.Empresa;
import com.alef.erp.model.TipoEmpresa;

@Named
@ViewScoped
public class GestaoEmpresasBean implements Serializable {
	
	private Empresa empresa = new Empresa();

	public Empresa getEmpresa() {
		return empresa;
	}

	public TipoEmpresa[] getTiposEmpresa() {
		return TipoEmpresa.values();
	}
	
	public void salvar() {
		System.out.println("Item Salvo");
	}

}
