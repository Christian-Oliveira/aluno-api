package br.com.alunoapi.dao;

import br.com.alunoapi.model.Aluno;

import javax.persistence.PersistenceException;
import java.util.List;

public interface IAlunoDAO {

    List<Aluno> fetchAll() throws PersistenceException;
}
