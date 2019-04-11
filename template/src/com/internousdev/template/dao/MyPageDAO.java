package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.template.dto.MyPageDTO;
import com.internousdev.template.util.DBConnector;

public class MyPageDAO {

	public MyPageDTO getMyPageUserInfo(String item_transaction_id,String user_master_id) 
			throws SQLException{
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		MyPageDTO myPageDTO = new MyPageDTO();
		String sql = "SELECT iit.item_name,ubit.total_price,ubit.total_count,"
				+ "ubit.pay From user_buy_item_transaction ubit LEFT JOIN item_info_transaction iit ON "
				+ "ubit.item_transaction_id = iit.id WHERE ubit.item_transaction_id = ? AND "
				+ "ubit.user_master_id = ? ORDER BY ubit.insert_date DESC";
		
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, item_transaction_id);
			ps.setString(2, user_master_id);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				myPageDTO.setItemName(rs.getString("item_name"));
				myPageDTO.setTotalPrice(rs.getString("total_price"));
				myPageDTO.setTotalCount(rs.getString("total_count"));
				myPageDTO.setPayment(rs.getString("pay"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return myPageDTO;
	}
	
	public int buyItemHistoryDelete(String item_transaction_id,String user_master_id) throws SQLException{
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		int rs = 0;
		
		String sql = "DELETE FROM user_buy_item_transaction WHERE "
				+ "item_transaction_id = ? AND user_master_id = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);

		try{
			ps.setString(1, item_transaction_id);
			ps.setString(2, user_master_id);
			
			rs = ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return rs;
	}
}
