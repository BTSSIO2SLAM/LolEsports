package esports.repository;

import org.springframework.data.repository.CrudRepository;

import esports.entity.Participant;

public interface ParticipantRepository extends CrudRepository<Participant, Integer>{

}
