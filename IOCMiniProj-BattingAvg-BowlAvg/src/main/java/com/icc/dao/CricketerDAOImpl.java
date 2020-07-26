package com.icc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.icc.bo.CricketerBO;

public class CricketerDAOImpl implements CricketerDAO {
	private static final String INSERT_QUERY="INSERT INTO CRICKETER VALUES(CNO_SEQ1.NEXTVAL,?,?,?,?,?,?,?)";
	private DataSource ds;

	public CricketerDAOImpl(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int insertCricketerDetails(CricketerBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		//get jdbc connection pool obj
		con=ds.getConnection();
		//create preparedstatement obj
		ps=con.prepareStatement(INSERT_QUERY);
		//assign value to params
		ps.setString(1, bo.getCricketerName());
		ps.setInt(2,bo.getRunsScored());
		ps.setInt(3,bo.getNoOfTimesOut());
		ps.setFloat(4,bo.getBattingAvg());
		ps.setInt(5,bo.getNoOfrunsConcedded());
		ps.setInt(6,bo.getWicketsTaken());
		ps.setFloat(7,bo.getBowlAvg());
		//execute the query
		count=ps.executeUpdate();
		//close jdbc objs
		ps.close();
		con.close();
		return count;
	}

	

}
