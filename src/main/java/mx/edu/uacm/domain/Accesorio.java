package mx.edu.uacm.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Accesorio {
	
	@Column
	private String nombreAccesorio;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	
	public Accesorio(String nombreAccesorio) {
		this.nombreAccesorio=nombreAccesorio;
	}


	/**
	 * @return the nombreAccesorio
	 */
	public String getNombreAccesorio() {
		return nombreAccesorio;
	}


	/**
	 * @param nombreAccesorio the nombreAccesorio to set
	 */
	public void setNombreAccesorio(String nombreAccesorio) {
		this.nombreAccesorio = nombreAccesorio;
	}


	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	
	
}
