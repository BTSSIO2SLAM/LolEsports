package esports.repository;

import org.springframework.data.repository.CrudRepository;

import esports.entity.Joueur;

public interface JoueurRepository extends CrudRepository<Joueur, Integer>{

}
