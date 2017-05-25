package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Autore {
	private String nome;
	private String cognome;
	private String nazionalit�;
	@Temporal (TemporalType.DATE)
	private Date dataNascita;
	private Date dataMorte;//pu� essere nulla
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getNazionalit�() {
		return nazionalit�;
	}
	public void setNazionalit�(String nazionalit�) {
		this.nazionalit� = nazionalit�;
	}
	public Date getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
	public Date getDataMorte() {
		return dataMorte;
	}
	public void setDataMorte(Date dataMorte) {
		this.dataMorte = dataMorte;
	}
	
	
}
