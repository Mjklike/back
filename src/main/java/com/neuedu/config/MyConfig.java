package com.neuedu.config;

import com.neuedu.util.MyPropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
public class MyConfig {
    @Bean
    public MyPropertyPlaceholderConfigurer getMyPropertyPlaceholderConfigurer(){
        MyPropertyPlaceholderConfigurer myPropertyPlaceholderConfigurer = new MyPropertyPlaceholderConfigurer();
        myPropertyPlaceholderConfigurer.setLocations(
                new ClassPathResource("db.properties")
        );
        myPropertyPlaceholderConfigurer.setFileEncoding("UTF-8");
        return myPropertyPlaceholderConfigurer;
    }
}
