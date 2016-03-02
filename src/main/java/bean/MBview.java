package bean;

 /*import java.util.List; */

import javax.faces.bean.ManagedBean;

import dao.controller;
import model.Resultado;

@ManagedBean(name="jerez")
public class MBview {
	private int cedula;
	public controller c = new controller();
	

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public Resultado getEstudianteBusqueda2(){
		 return controller.BuscarManeraUno(getCedula());
	
	}
	public String Validar(){
	
			
		return controller.vista;
	}



	
}
