package com.jj.propertydb.dao;

import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import com.jj.propertydb.beans.Owner;

public class OwnerDAOImpl implements OwnerDAO {

	static Logger log = Logger.getLogger(OwnerDAOImpl.class.getName());

	private DataSource dataSource;

	private JdbcTemplate jdbcTemplateObject;

	public void setJdbcTemplateObject(JdbcTemplate jdbcTemplateObject) {
		this.jdbcTemplateObject = jdbcTemplateObject;
	}

	@Override
	public Owner getOwnerById(int ownerId) {
		log.info("into getOwnerById");
		Owner owner = new Owner();
		String query = "SELECT * FROM owner WHERE ownerid = ?";
		owner = jdbcTemplateObject.queryForObject(query, new Object[] { ownerId }, new OwnerMapper());			
		return owner;
	}

	@Override
	public void deleteOwner(int ownerId) {
		log.info("into deleteOwner");
		String query = "DELETE FROM owner WHERE ownerid = ?";
		jdbcTemplateObject.update(query, ownerId);
		return;
	}

	@Override
	public void insertOwner(Owner owner) {
		log.info("into insertOwner");
		String query = "INSERT INTO owner (ownerfname, ownerlname) values (?, ?)";
		jdbcTemplateObject.update(query, owner.getOwnerFName(), owner.getOwnerLName());
		return;
	}

	@Override
	public void updateOwner(Owner owner) {
		log.info("into updateOwner");
		String query = "UPDATE owner SET ownerfname = ?, ownerlname = ? WHERE ownerid = ?";
		jdbcTemplateObject.update(query, owner.getOwnerFName(), owner.getOwnerLName(), owner.getOwnerId());
		return;
	}

	@Override
	public List<Owner> getOwners() {
		log.info("into getOwners");
		String query = "SELECT * FROM owner";
		List<Owner> ownerList = jdbcTemplateObject.query(query, new OwnerMapper());
		return ownerList;
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

}
