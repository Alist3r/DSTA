package DSTAProject.model;

import java.io.Serializable;

public class Characters implements Serializable {

	private static final long serialVersionUID = 6520482491901514732L;
	
	private Integer idChar = 0;
	private String name = null;
	private Integer level = 1;
	private Integer souls = 0;
	private Integer idUsers = 0;
	
	private Integer maxHP = 100;
	private Integer currHP = 80;
	private Integer attacco = 6;
	private Integer difesa = 6;
	private Integer velocita = 6;
	private Integer armatura = 6;
	
	public Characters() {
		
	}

	public Integer getIdChar() {
		return idChar;
	}

	public void setIdChar(Integer idChar) {
		this.idChar = idChar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getSouls() {
		return souls;
	}

	public void setSouls(Integer souls) {
		this.souls = souls;
	}

	public Integer getIdUsers() {
		return idUsers;
	}

	public void setIdUsers(Integer idUsers) {
		this.idUsers = idUsers;
	}

	public Integer getMaxHP() {
		return maxHP;
	}

	public void setMaxHP(Integer maxHP) {
		this.maxHP = maxHP;
	}

	public Integer getCurrHP() {
		return currHP;
	}

	public void setCurrHP(Integer currHP) {
		this.currHP = currHP;
	}

	public Integer getAttacco() {
		return attacco;
	}

	public void setAttacco(Integer attacco) {
		this.attacco = attacco;
	}

	public Integer getDifesa() {
		return difesa;
	}

	public void setDifesa(Integer difesa) {
		this.difesa = difesa;
	}

	public Integer getVelocita() {
		return velocita;
	}

	public void setVelocita(Integer velocita) {
		this.velocita = velocita;
	}

	public Integer getArmatura() {
		return armatura;
	}

	public void setArmatura(Integer armatura) {
		this.armatura = armatura;
	}

	
		
	
	
}
