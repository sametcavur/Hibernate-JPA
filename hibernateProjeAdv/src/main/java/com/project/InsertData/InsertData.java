package com.project.InsertData;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.project.jpaFactory.JPAFactory;
import com.project.model.Advertisement;
import com.project.model.User;
import com.project.model.UserAdress;
import com.project.model.UserInfo;

public class InsertData {
	static JPAFactory factory = new JPAFactory();
	static EntityManager entityManager = factory.getEntityManager();
	static EntityTransaction entityTransaction = factory.getEntityTransaction();

	public static void insertData() {
		// ÝNSERT USER//
		// 1.User
		UserAdress userAdress1 = new UserAdress("113/1 Sokak", "Beþltesiz", "Zeytinburnu	", "Ýstanbul", "34021");
		@SuppressWarnings("deprecation")
		Date date1 = new Date(1997, 11, 27);
		UserInfo userInfo1 = new UserInfo("Samet", "Çavur", date1);
		User user1 = new User("samcav", "123Sam", "smtcvr409@gmail.com", "05448942969", userAdress1, userInfo1);
		Advertisement advertisement1_1 = new Advertisement("Phone");
		Advertisement advertisement1_2 = new Advertisement("PC");
		user1.addAdvertisement(advertisement1_1);
		user1.addAdvertisement(advertisement1_2);

		// 2.User
		UserAdress userAdress2 = new UserAdress("Yýldýz Sokak", "telsiz", "Kepez", "Antalya", "021C32");
		@SuppressWarnings("deprecation")
		Date date2 = new Date(1980, 8, 17);
		UserInfo userInfo2 = new UserInfo("Metin", "Kaya", date2);
		User user2 = new User("kayametin12", "kayametin1234", "metin.kaya@hotmail.com", "0074772622", userAdress2,userInfo2);
		Advertisement advertisement2_1 = new Advertisement("Home");
		Advertisement advertisement2_2 = new Advertisement("Car");
		user2.addAdvertisement(advertisement2_1);
		user2.addAdvertisement(advertisement2_2);
		// 3.User
		UserAdress userAdress3 = new UserAdress("Parsel Sokak", "Kültür", "MuratPaþa", "Ankara", "18321");
		@SuppressWarnings("deprecation")
		Date date3 = new Date(1967, 1, 30);
		UserInfo userInfo3 = new UserInfo("Çetin", "Arslan", date3);
		User user3 = new User("cetobaskan.12", "baskanceto12", "cetmail@gmail.com", "0327105578", userAdress3,userInfo3);
		Advertisement advertisement3_1 = new Advertisement("Phone");
		user3.addAdvertisement(advertisement3_1);
		// 4.User
		UserAdress userAdress4 = new UserAdress("Gedik Sokak", "KaraAli", "Çankaya", "Muþ", "98990");
		@SuppressWarnings("deprecation")
		Date date4 = new Date(1990, 6, 21);
		UserInfo userInfo4 = new UserInfo("Hakký", "Murat", date4);
		User user4 = new User("hak.mur", "hakmurat13", "murhak12@gmail.com", "05990123299", userAdress4, userInfo4);
		Advertisement advertisement4_1 = new Advertisement("Bicycle");
		user4.addAdvertisement(advertisement4_1);

		// PERSÝST ÝÞLEMLERÝ
		entityTransaction.begin();

		entityManager.persist(advertisement1_1);
		entityManager.persist(advertisement1_2);
		entityManager.persist(advertisement2_1);
		entityManager.persist(advertisement2_2);
		entityManager.persist(advertisement3_1);
		entityManager.persist(advertisement4_1);

		entityManager.persist(user1);
		entityManager.persist(user2);
		entityManager.persist(user3);
		entityManager.persist(user4);

		entityTransaction.commit();

	}

}
