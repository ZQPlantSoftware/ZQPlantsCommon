package com.zqplants.db.mapper;

import com.zqplants.db.utils.TableName;

public class UserMapper {

	/**
	 * 
	 */
	private final static String SQL_GET_USER_BY_ID = "SELECT " +
			" USERID,USERNAME,PASSWORD,DESCRIPTION,REGISTER_DATE,PHONE,EMAIL " +
			" FROM "+TableName.TABLE_ZQPLATNS_USER+" WHERE ID = #{ID}";
	private final static String SQL_GET_USER_PAGE = "SELECT " +
			" USERID,USERNAME,PASSWORD,DESCRIPTION,REGISTER_DATE,PHONE,EMAIL " +
			" FROM USERS LIMIT #{BEGIN},#{END}";
	private final static String SQL_DELETE_USER = "DELETE " +
			" FROM "+TableName.TABLE_ZQPLATNS_USER+" WHERE USERID = #{USERID}";
	private final static String SQL_UPDATE_USER = "UPDATE "+TableName.TABLE_ZQPLATNS_USER+
			" SET USERNAME = #{user.userName}, " +
			" password = #{user.usesrPassword}," +
			" description = #{user.description}," +
			" phone = #{user.phone}," +
			" email = #{user.email}" +
			" WHERE USERID = #{user.userId}";
	private final static String SQL_UPDATE_USER_PWD = "UPDATE "+TableName.TABLE_ZQPLATNS_USER+
			" SET password = #{user.password} WHERE USERID = #{userId}";
	
}
