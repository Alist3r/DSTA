package DSTAProject.utils;

public class DSTAUtils {

	public static double percHpPersa(Integer maxHp, Integer currHP) {
		double percHpPersa = 0;
		
		double hpPersi = maxHp -  currHP;
		percHpPersa = (hpPersi * 100) / maxHp;
		
		return percHpPersa;
	}
	
	/*public static Integer getSoulsPerLvlUp(Integer level) {
		
		double soulsPerLvlUp = 0;
		
		switch(level) {
			case 1: soulsPerLvlUp = 100; break;
			default: soulsPerLvlUp = (100 * level * 0.7);
		}
		
		
		return (Integer) soulsPerLvlUp;
	}*/
	
}
