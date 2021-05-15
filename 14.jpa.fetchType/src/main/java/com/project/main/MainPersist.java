package com.project.main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.project.model.Adres;
import com.project.model.Personel;

public class MainPersist {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		// --------PERSONEL 1 -------- -//
		Date calendar = new Date(1997, 8, 27);

		Map<String, String> personelNumbers = new HashMap<String, String>();
		personelNumbers.put("Cep", "1234");
		personelNumbers.put("Ev", "9685");

		Adres adres1 = new Adres("113/1", "raufDenktaþ", "Beþtelsiz", "Zeytinburnu");
		Adres adres2 = new Adres("1 Sokak", "Merkez", "Çýrpýcý", "Kepez");

		List<Adres> adresses = new ArrayList<Adres>();
		adresses.add(adres1);
		adresses.add(adres2);

		List<String> emails = new ArrayList<String>();
		emails.add("smtcvr409@gmail.com");
		emails.add("sametcav@hotmail.com");
		Personel personel1 = new Personel("Samet", "Çavur", calendar, personelNumbers, adresses, emails);

		// --------PERSONEL 2 -------- -//
		Date calendar1 = new Date(1977, 12, 3);

		Map<String, String> personel2Numbers = new HashMap<String, String>();
		personel2Numbers.put("Cep", "3487");
		personel2Numbers.put("Ev", "5732");

		Adres padres1 = new Adres("89/1", "3835", "Kültür", "Konyaaltý");
		Adres padres2 = new Adres("Bulvar Sokak", "Atatürk", "Gemlik", "MuratPaþa");

		List<Adres> padresses = new ArrayList<Adres>();
		padresses.add(padres1);
		padresses.add(padres2);

		List<String> pemails = new ArrayList<String>();
		pemails.add("cavursamm@gmail.com");
		pemails.add("iamcav@hotmail.com");
		Personel personel2 = new Personel("Hakan", "Tekin", calendar1, personel2Numbers, padresses, pemails);
		
		transaction.begin();
		entityManager.persist(personel1);
		entityManager.persist(personel2);
		transaction.commit();

	}

}
