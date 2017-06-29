/**
 * 
 */
package com.asm.blockchain.db;

import java.net.MalformedURLException;
import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbConnector;
import org.ektorp.impl.StdCouchDbInstance;
import org.ektorp.support.DesignDocument;

/**
 * @author Anup_Kumar_G
 *
 */
public class CouchDB {

	public static void connect() {
		//http://localhost:5984/_utils/#/_all_dbs
		// https://www.javatpoint.com/java-couchdb
		//https://dzone.com/articles/couch-db-java-integration
		HttpClient httpClient = null;
		try {
			httpClient = new StdHttpClient.Builder().url("http://localhost:5984").build();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		CouchDbInstance dbInstance = new StdCouchDbInstance(httpClient);
		CouchDbConnector db = new StdCouchDbConnector("javatpoint", dbInstance);
		db.createDatabaseIfNotExists();
		DesignDocument dd = new DesignDocument("light2");
		db.create(dd);
		System.out.println("Done");
	}
	
	public static void main(String a[]){
		connect();
	}
}
