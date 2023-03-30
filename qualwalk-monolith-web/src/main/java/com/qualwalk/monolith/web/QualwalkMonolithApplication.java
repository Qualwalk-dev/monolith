package com.qualwalk.monolith.web;

import com.swantech.lang.core.utility.YamlPropertyResourceReader;
import org.keycloak.adapters.springboot.KeycloakAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EntityScan(basePackages = "com.qualwalk.monolith.persistence.entity")
@EnableJpaRepositories(basePackages = "com.qualwalk.monolith.persistence.repository")
@PropertySource(value = "classpath:db-props.yml",factory = YamlPropertyResourceReader.class)
@ComponentScan(basePackages = {
        "com.qualwalk.monolith.*",
        "com.swantech.security.*",
        "com.swantech.lang.*",
})
@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class
        , KeycloakAutoConfiguration.class
        , FlywayAutoConfiguration.class
})
public class QualwalkMonolithApplication {
    public static void main(String[] args) {
        SpringApplication.run(QualwalkMonolithApplication.class);
    }
}
