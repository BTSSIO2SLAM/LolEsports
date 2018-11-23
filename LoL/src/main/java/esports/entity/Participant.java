package esports.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Participant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@ManyToOne
	private Equipe equipe;
	@ManyToOne
	private Competition competition;
	@ManyToOne
	private PhaseQualification phasequalification;
	private boolean elimine;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Equipe getEquipe() {
		return equipe;
	}
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	public Competition getCompetition() {
		return competition;
	}
	public void setCompetition(Competition competition) {
		this.competition = competition;
	}
	public PhaseQualification getPhasequalification() {
		return phasequalification;
	}
	public void setPhasequalification(PhaseQualification phasequalification) {
		this.phasequalification = phasequalification;
	}
	public boolean isElimine() {
		return elimine;
	}
	public void setElimine(boolean elimine) {
		this.elimine = elimine;
	}
	
	

}
