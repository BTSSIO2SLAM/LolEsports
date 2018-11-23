package esports.repository;

import org.springframework.data.repository.CrudRepository;

import esports.entity.Score;

public interface ScoreRepository extends CrudRepository<Score, Integer>{

}