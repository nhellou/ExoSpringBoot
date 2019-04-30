package com.exemple.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Laboratoire implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idLab;
	private String nom;
	private int nbOrdi;
	
	@OneToMany
	private List<Epreuve> epreuves;

	public Laboratoire() {
		super();
	}

	public Laboratoire(long idLab, String nom, int nbOrdi, List<Epreuve> epreuves) {
		super();
		this.idLab = idLab;
		this.nom = nom;
		this.nbOrdi = nbOrdi;
		this.epreuves = epreuves;
	}
	
	

	public Laboratoire(String nom, int nbOrdi) {
		super();
		this.nom = nom;
		this.nbOrdi = nbOrdi;
	}

	public long getIdLab() {
		return idLab;
	}

	public void setIdLab(long idLab) {
		this.idLab = idLab;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbOrdi() {
		return nbOrdi;
	}

	public void setNbOrdi(int nbOrdi) {
		this.nbOrdi = nbOrdi;
	}

	public List<Epreuve> getEpreuves() {
		return epreuves;
	}

	public void setEpreuves(List<Epreuve> epreuves) {
		this.epreuves = epreuves;
	}

	@Override
	public String toString() {
		return "Laboratoire [idLab=" + idLab + ", nom=" + nom + ", nbOrdi=" + nbOrdi + ", epreuves=" + epreuves + "]";
	}
	
	

}
