package mx.neftaly.swarmprueba.rest.services;

import mx.neftaly.swarmprueba.rest.domain.TestDomain;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class TestService {

    @PersistenceContext
    private EntityManager em;

    public String getGreeting(String memes) {
        return memes;
    }

    public Boolean createNewTestDomain() {
        TestDomain entity = new TestDomain();
        entity.setFirstName("LOL");
        entity.setLastName("OKKKK");

        em.persist(entity);
        return entity.getId() != null;
    }

    public List<TestDomain> getAll() {

        Query q = em.createQuery("select e from TestDomain e");
        return (List<TestDomain>) q.getResultList();
    }

}
