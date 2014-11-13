package br.com.petshopplus.persistence;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

@SuppressWarnings({ "deprecation" })
public class CriadorDeSessionFactory {

        private SessionFactory factory;
        
        @PostConstruct
		public void abre(){
        	Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            ServiceRegistryBuilder serviceRegistryBuilder = new ServiceRegistryBuilder().applySettings(configuration
                            .getProperties());
            factory = configuration
                            .buildSessionFactory(serviceRegistryBuilder.buildServiceRegistry());

        }
        
        public SessionFactory getInstance() {
        	return this.factory;
        }
        
        @PreDestroy
        public void fecha(){
        	this.factory.close();
        }
}
