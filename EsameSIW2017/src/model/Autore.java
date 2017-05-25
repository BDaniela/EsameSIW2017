package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Autore {
	private String nome;
	private String cognome;
	private String nazionalità;
	@Temporal (TemporalType.DATE)
	private Date dataNascita;
	private Date dataMorte;//può essere nulla
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
	public String getNazionalità() {
		return nazionalità;
	}
	public void setNazionalità(String nazionalità) {
		this.nazionalità = nazionalità;
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
