package br.com.fiap.smartcities.app;

import javax.persistence.Persistence;

public class application {

	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("smartcities").createEntityManager();

	}

}
