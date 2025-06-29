package app.config;

import app.model.Dog;
import app.model.Timer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {
    @Bean
    public String getDog() {
        Dog dog = new Dog();
        return dog.toString();
    }

    @Bean
    @Scope("prototype")
    public Timer getTimer(){
        return new Timer();
    }
}
