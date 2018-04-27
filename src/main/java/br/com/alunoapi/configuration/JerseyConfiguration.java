package br.com.alunoapi.configuration;

import br.com.alunoapi.resources.AlunoResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

@Configuration
@ApplicationPath("/seletivo-api")
public class JerseyConfiguration extends ResourceConfig {


    @PostConstruct
    public void configuration(){
        register(AlunoResource.class);
    }
}
