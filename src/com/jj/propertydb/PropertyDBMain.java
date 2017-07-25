package com.jj.propertydb;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jj.propertydb.beans.Owner;
import com.jj.propertydb.dao.OwnerDAO;

public class PropertyDBMain {

	private static ApplicationContext context;

	static Logger log = Logger.getLogger(PropertyDBMain.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		// TODO Auto-generated method stub

		context = new ClassPathXmlApplicationContext("Beans.xml");

		OwnerDAO ownerDAO = (OwnerDAO) context.getBean("ownerDAO");
		Owner owner = ownerDAO.getOwnerById(22);
		
		log.info(owner.getOwnerFName() + " " + owner.getOwnerLName());

		// List<Actor> actorsList = actorDAO.getActors();
		// System.out.println(actorsList.get(22).getFirstName());
	}

}
