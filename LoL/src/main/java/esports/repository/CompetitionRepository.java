package esports.repository;

import org.springframework.data.repository.CrudRepository;

import esports.entity.Competition;

public interface CompetitionRepository extends CrudRepository<Competition, Integer> {

}
