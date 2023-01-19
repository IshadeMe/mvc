package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDao implements Dao<User, Integer> {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<User> getAll() {
        return em.createQuery("select u from User u", User.class).getResultList();
    }

    @Override
    public void add(User entity) {
        em.persist(entity);
    }

    @Override
    public User getById(Integer id) {
        return em.find(User.class, id);
    }

    @Override
    public void deleteById(Integer id) {
        em.remove(em.find(User.class, id));
    }

    @Override
    public void update(User entity) {
        em.merge(entity);
    }
}
