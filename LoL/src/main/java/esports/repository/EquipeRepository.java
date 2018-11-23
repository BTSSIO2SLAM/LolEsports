package esports.repository;

import org.springframework.data.repository.CrudRepository;

import esports.entity.Equipe;

public interface EquipeRepository extends CrudRepository<Equipe, Integer> {

}