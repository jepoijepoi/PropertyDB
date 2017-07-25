package com.jj.propertydb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jj.propertydb.beans.Owner;

public class OwnerMapper implements RowMapper<Owner> {

	@Override
	public Owner mapRow(ResultSet rs, int rowNum) throws SQLException {
		Owner owner = new Owner();
		owner.setOwnerId(rs.getInt("ownerid"));
		owner.setOwnerFName(rs.getString("ownerfname"));
		owner.setOwnerLName(rs.getString("ownerlname"));
//		owner.setLastUpdate(rs.getDate("last_update"));
		return owner;
	}

}
