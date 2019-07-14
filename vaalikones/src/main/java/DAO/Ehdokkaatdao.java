package DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import persist.Ehdokkaat;

public class Ehdokkaatdao {
	private  EntityManagerFactory emf;
	private EntityManager em;
	public Ehdokkaatdao()
	{
		emf = Persistence.createEntityManagerFactory("vaalikones");
		em = emf.createEntityManager();
	}
	public void Add(Ehdokkaat a)
	{ em.getTransaction().begin();
	  em.persist(a);
	  em.getTransaction().commit();
	}

	public void Remove(Ehdokkaat a)
	{
	  em.remove(a);
	}
	public void Edit(Ehdokkaat a)
	{ em.getTransaction().begin();
	  em.merge(a); 
	  em.getTransaction().commit();
	}
	public Ehdokkaat findEhdokkaatbyid( int id)
	{
	  return em.find(Ehdokkaat.class , id);
	}

	public List<Ehdokkaat> findall()
	{
		Query q = em.createQuery("SELECT a  FROM Ehdokkaat a");
		return q.getResultList();
		
	}

}
