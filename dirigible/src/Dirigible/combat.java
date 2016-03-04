package Dirigible;

import javax.swing.JOptionPane;

public class combat {

	public static void battle(stats s, int currentHealth ,int enemyHealth, int enemyRange, int enemyMelee, boolean cantFlee) {
		// TODO Auto-generated method stub
		do{
			
			int rangedDamage = stats.rangedDamage(s.rangedWeapon);
			int meleeDamage = stats.meleeDamage(s.meleeWeapon);
			
			boolean fleeOption = cantFlee;
			playerTurn(s.health, rangedDamage, meleeDamage, enemyHealth, fleeOption);
			
		}while (currentHealth > 0 && enemyHealth > 0);
		System.out.println("BANANA");
	}
			
	public static int playerTurn(int rangedDamage, int meleeDamage, int currentHealth, int enemyHealth, boolean fleeOption){
		
		do{
			
			String [] combatOptions = {"Fire gun", "Melee attack", "Flee"};
			String playerMove = (String) JOptionPane.showInputDialog(null, "Combat plan", null, JOptionPane.QUESTION_MESSAGE, null, combatOptions, combatOptions[0]);

				
			if (playerMove == "Fire gun"){
				
				int damage = rangedDamage;
				enemyHealth = enemyHealth - damage;
				System.out.println("Enemy has taken " + damage + "! Current health is " + enemyHealth);
				fleeOption = true;
				
			}
			
			if (playerMove == "Melee attack"){
				
				int damage = meleeDamage;
				enemyHealth = enemyHealth - damage;
				System.out.println("Enemy has taken " + damage + "! Current health is " + enemyHealth);
				fleeOption = true;
			}
		
			if (playerMove == "Flee"){
				if (fleeOption = false){
					System.out.println("You cannot flee this battle!");
					fleeOption = false;
				}
			}
				if (fleeOption == true){
					int escapeChance = (int)(Math.random()*2);
				
					if (escapeChance == 0) {
						
					System.out.println("You successfully escaped");
					fleeOption = true;
					enemyHealth = 0;
				}
					
					if (escapeChance == 1){
						
						System.out.println("You failed to escape");
						fleeOption = true;
				}
					
			}
				
		}while(fleeOption == false);
		
		return enemyHealth;
		
	}
	
	//public static void enemyTurn()
		
	//}
}
