package com.vinhsangvn.ModelLocal;

import com.relops.snowflake.Snowflake;

public class SnowflakeUUID {
	final static int node = 1;
	
	public static long generate_uuid(){
		Snowflake s = new Snowflake(node);
		long id = s.next();
		return id;
	}
}
