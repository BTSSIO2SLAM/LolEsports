package esports.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PartieDetails {	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@ManyToOne
	private Partie partie;
	@ManyToOne
	private Equipe equipe;
	private int kills;
	private float goldEarned;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Partie getPartie() {
		return partie;
	}
	public void setPartie(Partie partie) {
		this.partie = partie;
	}
	public Equipe getEquipe() {
		return equipe;
	}
	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	public int getKills() {
		return kills;
	}
	public void setKills(int kills) {
		this.kills = kills;
	}
	public float getGoldEarned() {
		return goldEarned;
	}
	public void setGoldEarned(float goldEarned) {
		this.goldEarned = goldEarned;
	}
	
	

	
}
