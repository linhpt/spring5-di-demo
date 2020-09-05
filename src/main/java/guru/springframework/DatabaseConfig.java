package guru.springframework;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:database.properties")
public class DatabaseConfig {
    @Value("${app.username}")
    String username;

    @Value("${app.password}")
    String password;

    @Value("${app.url}")
    String url;


    @Bean
    public FakeDataSource DatabaseConfig() {
        FakeDataSource faceDataSource = new FakeDataSource(username, password, url);
        return faceDataSource;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        return configurer;
    }
}
