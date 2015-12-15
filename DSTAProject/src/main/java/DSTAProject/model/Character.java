package DSTAProject.model;

import java.io.Serializable;

public abstract class Character implements Serializable  {

	private static final long serialVersionUID = 195078477805932986L;
	
	private Integer idCharacter = 0;
	private String nome = null;
	
	private Double attacco = (double) 0;
	private Double difesa = (double) 0;
	private Double agilita = (double) 0;
	private Integer hp = 0;
	
	private Integer livello = 1;
	private Integer exp = 0;
	private Integer expNextLevelUp = 0;
	
	private Double critChance = 0.0;
	private Double critDamage = 0.0;
	
	public abstract void levelUp();
	public abstract Double critChance();
	
	public Integer expNextLevelUp() {
		
		Integer expNextLevelUp =  (int) (100 * this.getLivello() * 1.3);
				
		return expNextLevelUp;	
	}
	
	public Integer getIdCharacter() {
		return idCharacter;
	}
	public void setIdCharacter(Integer idCharacter) {
		this.idCharacter = idCharacter;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getAttacco() {
		return attacco;
	}
	public void setAttacco(Double attacco) {
		this.attacco = attacco;
	}
	public Double getDifesa() {
		return difesa;
	}
	public void setDifesa(Double difesa) {
		this.difesa = difesa;
	}
	public Double getAgilita() {
		return agilita;
	}
	public void setAgilita(Double agilita) {
		this.agilita = agilita;
	}
	public Integer getHp() {
		return hp;
	}
	public void setHp(Integer hp) {
		this.hp = hp;
	}
	public Integer getLivello() {
		return livello;
	}
	public void setLivello(Integer livello) {
		this.livello = livello;
	}
	public Integer getExp() {
		return exp;
	}
	public void setExp(Integer exp) {
		this.exp = exp;
	}	
	public Double getCritChance() {
		return critChance;
	}
	public void setCritChance(Double critChance) {
		this.critChance = critChance;
	}
	public Double getCritDamage() {
		return critDamage;
	}
	public void setCritDamage(Double critDamage) {
		this.critDamage = critDamage;
	}
	public Integer getExpNextLevelUp() {
		return expNextLevelUp;
	}
	public void setExpNextLevelUp(Integer expNextLevelUp) {
		this.expNextLevelUp = expNextLevelUp;
	}
	
	
}
