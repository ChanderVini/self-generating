/*
 * DbConnectionException.java
 */

package com.myappsecurity.sga.exception;

/**
 *
 * @author Chander Singh
 * Created on October 15, 2007, 5:22 PM
 */
public class DbConnectionException  extends Exception {    
    /**
	 * 
	 */
	private static final long serialVersionUID = 6607448845496961694L;

	/** Creates a new instance of DbConnectionException */
    public DbConnectionException() {
        super ();
    }
    
    public DbConnectionException (String message) {
        super (message);
    }
}

