package br.com.alunoapi.dao;

import br.com.alunoapi.model.Aluno;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import java.util.List;

public class AlunoDAO implements IAlunoDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Aluno> fetchAll() throws PersistenceException {
        return entityManager.createQuery("from Aluno").getResultList();
    }

}
