package fr.lepellerin.ecole.config;

import java.util.Properties;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Configuration
public class GestEcoleTestPersistenceConfig extends GestEcolePersistenceConfig {

  @Bean
  public DataSource dataSource() {
    final EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
    final EmbeddedDatabase db = builder.setType(EmbeddedDatabaseType.HSQL).build();
    return db;

  }

  @Override
  Properties additionalProperties() {
    final Properties properties = new Properties();
    properties.setProperty("hibernate.dialect", "org.hibernate.dialect.HSQLDialect");
    properties.setProperty("hibernate.hbm2ddl.auto", "create-drop");
    return properties;
  }

}
