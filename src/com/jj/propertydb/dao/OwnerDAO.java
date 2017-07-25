package com.jj.propertydb.dao;

import java.util.List;

import com.jj.propertydb.beans.Owner;

public interface OwnerDAO {

	public Owner getOwnerById(int ownerId);

	public void deleteOwner(int ownerId);

	public void insertOwner(Owner owner);

	public void updateOwner(Owner owner);

	public List<Owner> getOwners();
}
