package com.exemple.entities;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Epreuve implements Serializable{
	
	private Calendar date;
	private int heure;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idLab")
	private Laboratoire lab;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idMatiere")
	private Matiere matiere;
	
	@ManyToMany
	private List<Eleve> eleves;

	public Epreuve() {
		super();
	}

	public Epreuve(Calendar date, int heure, Laboratoire lab, Matiere matiere) {
		super();
		this.date = date;
		this.heure = heure;
		this.lab = lab;
		this.matiere = matiere;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public int getHeure() {
		return heure;
	}

	public void setHeure(int heure) {
		this.heure = heure;
	}

	public Laboratoire getLab() {
		return lab;
	}

	public void setLab(Laboratoire lab) {
		this.lab = lab;
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

	
	
	public List<Eleve> getEleves() {
		return eleves;
	}

	public void setEleves(List<Eleve> eleves) {
		this.eleves = eleves;
	}

	@Override
	public String toString() {
		return "Epreuve [date=" + date + ", heure=" + heure + ", lab=" + lab + ", matiere=" + matiere + "]";
	}
	
	
}
