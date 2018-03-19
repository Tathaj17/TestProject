package org.Tathagata.create.database;

import java.util.HashMap;
import java.util.Map;

import org.Tathagata.create.model.MessegeModel;
import org.eclipse.persistence.tools.profiler.Profile;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

	 
	static Map m= new HashMap();
	public static Map getMessages()
	{
		return m;
	}
	
	 
	}