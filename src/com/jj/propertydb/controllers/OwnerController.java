package com.jj.propertydb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jj.propertydb.beans.Owner;
import com.jj.propertydb.dao.OwnerDAO;

@Controller
public class OwnerController extends BaseController {

	@Autowired
	OwnerDAO ownerDAO;// will inject dao from xml file

	/*
	 * It displays a form to input data, here "command" is a reserved request
	 * attribute which is used to display object data into form
	 */
	@RequestMapping("/insertOwnerForm")
	public ModelAndView showform() {
		return new ModelAndView("insertOwnerForm.page", "command", new Owner());
	}

	/* It provides list of actors in model object */
	@RequestMapping("/viewOwnerList")
	public ModelAndView viewActorList() {
		List<Owner> actorList = ownerDAO.getOwners();
		// System.out.println("into list");
		// for(Actor actor : actorList) {
		// System.out.println(actor.getFirstName() + " " + actor.getLastName());
		// }
		return new ModelAndView("viewActorList.page", "actorList", actorList);
	}

	/*
	 * It displays object data into form for the given id. The @PathVariable
	 * puts URL data into variable.
	 */
	@RequestMapping(value = "/editOwner/{ownerId}")
	public ModelAndView editOwner(@PathVariable int ownerId) {
		Owner owner = ownerDAO.getOwnerById(ownerId);
		return new ModelAndView("editOwnerForm.page", "command", owner);
	}

	/*
	 * It saves object into database. The @ModelAttribute puts request data into
	 * model object. You need to mention RequestMethod.POST method because
	 * default request is GET
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("owner") Owner owner) {
		ownerDAO.insertOwner(owner);
		return new ModelAndView("redirect:/viewOwnerList");// will redirect to
															// viewactor request
															// mapping
	}

	/* It updates model object. */
	@RequestMapping(value = "/editSave", method = RequestMethod.POST)
	public ModelAndView editSave(@ModelAttribute("owner") Owner owner) {
		ownerDAO.updateOwner(owner);
		return new ModelAndView("redirect:/viewOwnerList");
	}

	/* It deletes record for the given id in URL and redirects to /viewactor */
	@RequestMapping(value = "/deleteOwner/{ownerId}", method = RequestMethod.GET)
	public ModelAndView deleteOwner(@PathVariable int ownerId) {
		ownerDAO.deleteOwner(ownerId);
		return new ModelAndView("redirect:/viewOwnerList");
	}

}
