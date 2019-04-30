package com.exemple.entities;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@ Entity
public class Eleve implements Serializable{
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String nom;
	private String prenom;
	private Calendar dateNaissance;
	
	@ManyToOne (cascade=CascadeType.ALL)
	@JoinColumn(name="idSection")
	private Section section;
	
	@ManyToMany
	private List<Epreuve> convocation;

	public Eleve(long id, String nom, String prenom, Calendar dateNaissance, Section section) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.section = section;
	}
	
	

	public Eleve(String nom, String prenom) {
		
		this.nom = nom;
		this.prenom = prenom;
		
	}


	public Eleve(String nom, String prenom, Calendar dateNaissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
	}



	public Eleve() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Calendar getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Calendar dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}
	
	
	public List<Epreuve> getConvocation() {
		return convocation;
	}

	public void setConvocation(List<Epreuve> convocation) {
		this.convocation = convocation;
	}

	@Override
	public String toString() {
		return "Eleve [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance
				+ ", section=" + section + "]";
	}
		

}
