package br.com.petshopplus.persistence;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CriadorDeSession {

        private SessionFactory factory;
        private Session session;

        public CriadorDeSession(SessionFactory factory){
                this.factory = factory;
        }
        
        @PostConstruct
        public void abre(){
                this.session = factory.openSession();
        }
        
        public Session getInstance() {
                return this.session;
        }
                
        @PreDestroy
        public void fecha(){
                this.session.close();
        }
        
}
