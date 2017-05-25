package model;

import javax.persistence.Entity;

@Entity
public class Quadro {
	private String titolo;
	private String anno;
	private String tecnica;
	private int altezza;
	private int larghezza;
	private int lunghezza;
	private Autore autore;
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAnno() {
		return anno;
	}
	public void setAnno(String anno) {
		this.anno = anno;
	}
	public String getTecnica() {
		return tecnica;
	}
	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}
	public int getAltezza() {
		return altezza;
	}
	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}
	public int getLarghezza() {
		return larghezza;
	}
	public void setLarghezza(int larghezza) {
		this.larghezza = larghezza;
	}
	public int getLunghezza() {
		return lunghezza;
	}
	public void setLunghezza(int lunghezza) {
		this.lunghezza = lunghezza;
	}
	public Autore getAutore() {
		return autore;
	}
	public void setAutore(Autore autore) {
		this.autore = autore;
	}
	
	

}
