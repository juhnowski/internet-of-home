package ru.iohs.utils;

import java.io.FileOutputStream;
import java.security.KeyStore;

public class KeyManager {

	public static void main(String[] args) {

		try{
		    KeyStore keyStore = KeyStore.getInstance("JKS");
		    keyStore.load(null,null);
		     
		    keyStore.store(new FileOutputStream("/home/ilya/test.jks"), "password".toCharArray());
		}catch(Exception ex){
		    ex.printStackTrace();
		}

	}

}
