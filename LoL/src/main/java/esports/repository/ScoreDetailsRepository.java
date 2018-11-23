package esports.repository;

import org.springframework.data.repository.CrudRepository;

import esports.entity.ScoreDetails;

public interface ScoreDetailsRepository extends CrudRepository<ScoreDetails, Integer> {

}