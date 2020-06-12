package br.com.sesi.tx;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

/**
 * Classe produtora de EntityManager
 * 
 * @author Jefferson Mendonça Lima
 * @since 12/06/2020
 *
 */
@ApplicationScoped
public class EntityManagerProducer implements Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Produces
	@RequestScoped
	public EntityManager getEntityManager() {
		EntityManager manager = factory.createEntityManager();
		manager.joinTransaction();
		return manager;
	}

	public void close(@Disposes EntityManager manager) {
		if (manager.isOpen()) {
			manager.close();
		}
	}
}
