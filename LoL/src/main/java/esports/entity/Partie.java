package esports.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Partie {	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nom;
	@ManyToOne
	private Competition competition;
	@ManyToOne
	private PhaseQualification phasequalification;
	private Date datedebut;
	private int duree;
	@ManyToOne
	private Equipe winner;
	@ManyToOne
	private Joueur mvp;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
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
	public Date getDatedebut() {
		return datedebut;
	}
	public void setDatedebut(Date datedebut) {
		this.datedebut = datedebut;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public Equipe getWinner() {
		return winner;
	}
	public void setWinner(Equipe winner) {
		this.winner = winner;
	}
	public Joueur getMvp() {
		return mvp;
	}
	public void setMvp(Joueur mvp) {
		this.mvp = mvp;
	}
	
	
}
