package com.kkb.spring.trans;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class MyTransTest {

    @PersistenceUnit
    private EntityManagerFactory fact;

    @Transactional
    public void customTransaction() {
        EntityManager em = this.fact.createEntityManager();
        try {
            em.joinTransaction();
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        } finally {
            em.close();
        }
    }

    @Transactional
    public void method1() {
        this.method2();
    }

    @Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_UNCOMMITTED)
    public void method2() {

    }


}
