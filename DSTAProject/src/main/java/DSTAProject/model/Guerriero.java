package DSTAProject.model;

public class Guerriero extends Character {

	private static final long serialVersionUID = 4696906483530543147L;
	
	public Guerriero() {
		this.setAttacco((double) 9);
		this.setDifesa((double) 8);
		this.setPrecisione((double) 5);
		this.setHp(8);
		this.setCritChance(critChance());
		this.setCritDamage(50.0);
	}

	@Override
	public void levelUp() {
		this.setLivello(this.getLivello() + 1);
		
		Integer livello = this.getLivello();
		
		Double nuovoAttacco = this.getAttacco() + (1.5 * livello); 
		Double nuovoDifesa = this.getDifesa() + (1.3 * livello);
		Double nuovoPrecisione = this. getPrecisione() + (1.0 * livello);
		
		Integer nuovoHP = this.getHp() + (2 * livello);
		
		this.setAttacco(nuovoAttacco);
		this.setDifesa(nuovoDifesa);
		this.setPrecisione(nuovoPrecisione);
		this.setHp(nuovoHP);
		
		this.setCritChance(critChance());
		this.setExpNextLevelUp(expNextLevelUp());
		
	}

	@Override
	public Double critChance() {

		Double critChance = 0.0;
		Double precisione = this.getPrecisione();
		Integer livello = this.getLivello();
		
		critChance = 5.0 + (precisione / livello * 0.5);
		
		return critChance;
	}
	
}
