package esports.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ScoreDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@ManyToOne
	private Score score;
	private int valeur;
	@ManyToOne
	private TypeScore typescore;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Score getScore() {
		return score;
	}
	public void setScore(Score score) {
		this.score = score;
	}
	public int getValeur() {
		return valeur;
	}
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
	public TypeScore getTypescore() {
		return typescore;
	}
	public void setTypescore(TypeScore typescore) {
		this.typescore = typescore;
	}

}
