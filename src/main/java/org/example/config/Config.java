package org.example.config;

import jakarta.persistence.EntityManager;
import org.example.model.Category;
import org.example.model.Company;
import org.example.model.Product;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static org.hibernate.cfg.AvailableSettings.*;

public class Config {
    public static EntityManager getEntityManager() {
        Configuration configuration = new Configuration();
        configuration.setProperty(DRIVER, "org.postgresql.Driver");
        configuration.setProperty(URL, "jdbc:postgresql://localhost:5432/postgres");
        configuration.setProperty(USER, "postgres");
        configuration.setProperty(PASS, "postgres");
        configuration.setProperty(HBM2DDL_AUTO, "update");
        configuration.setProperty(DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
        configuration.setProperty(SHOW_SQL, "true");
        configuration.addAnnotatedClass(Company.class);
        configuration.addAnnotatedClass(Product.class);
        configuration.addAnnotatedClass(Category.class);


        return configuration.buildSessionFactory().createEntityManager();
    }
}
