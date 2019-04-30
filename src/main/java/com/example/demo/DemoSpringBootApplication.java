package com.example.demo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.exemple.dao.InterfaceCrud;
import com.exemple.entities.Eleve;
import com.exemple.entities.Epreuve;
import com.exemple.entities.Laboratoire;
import com.exemple.entities.Matiere;
import com.exemple.entities.Section;

@SpringBootApplication
public class DemoSpringBootApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(DemoSpringBootApplication.class, args);
		InterfaceCrud edao = ctx.getBean(com.exemple.dao.InterfaceCrud.class);
		
		Calendar dateNaissance1 = Calendar.getInstance();
		Calendar dateNaissance2 = Calendar.getInstance();
		dateNaissance1.set(1990, 1, 3);
		dateNaissance2.set(1991, 5, 3);
		Eleve e1 = new Eleve("Nom1", "Prenom1",dateNaissance1);
		Eleve e2 = new Eleve("Nom2", "Prenom2",dateNaissance2);		
		edao.save(e1);
		edao.save(e2);
		
		Laboratoire l = new Laboratoire("Informatique",50);
		edao.save(l);
		
		Matiere m1 =new Matiere("algorithmique",60,3);
		Matiere m2 =new Matiere("TIC",20,2);
		
		
		Calendar dateEpreuve1 = Calendar.getInstance();
		dateEpreuve1.set(2019, 7, 3);
		Calendar dateEpreuve2 = Calendar.getInstance();
		dateEpreuve2.set(2019, 7, 5);
		Epreuve ep1 = new Epreuve(dateEpreuve1,11,l,m1);
		Epreuve ep2 = new Epreuve(dateEpreuve2,11,l,m2);
		edao.save(ep1);
		edao.save(ep2);
		
		List<Matiere> mat = new ArrayList<Matiere>();
		mat.add(m1);
		mat.add(m2);
		
		List<Eleve> eleves = new ArrayList<Eleve>();
		eleves.add(e1);
		eleves.add(e2);

		Section s = new Section("Programmation",mat,eleves);			
		edao.save(s);
				
		
	}

}
