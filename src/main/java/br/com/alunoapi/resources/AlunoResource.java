package br.com.alunoapi.resources;

import br.com.alunoapi.dao.IAlunoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

@Service
@Path("/aluno")
public class AlunoResource {

    @Autowired
    private IAlunoDAO alunoDAO;

    @GET
    @Produces("application/json")
    @Path("/fetch/all")
    public List fetchAll(){
        return alunoDAO.fetchAll();

    }



}
