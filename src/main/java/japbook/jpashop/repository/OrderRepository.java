package japbook.jpashop.repository;

import org.springframework.stereotype.Repository;
import japbook.jpashop.domain.Order;

import javax.persistence.EntityManager;
import javax.persistence.criteria.*;

@Repository
public class OrderRepository {

    private final EntityManager em;

    public OrderRepository(EntityManager em) {
        this.em = em;
    }
    public void save(Order order) {
        em.persist(order);
    }

    public japbook.jpashop.domain.Order findOne(Long id) {
        return em.find(Order.class, id);
    }



}

