package Dirigible;

import javax.swing.JOptionPane;

public class combat {

	public static void battle(int health, int enemyHealth, boolean cantFlee) {
		// TODO Auto-generated method stub
		do{

			boolean fleeOption = cantFlee;
			playerTurn(health, enemyHealth, fleeOption);
			
		}while (health > 0 && enemyHealth > 0);
		System.out.println("BANANA");
	}
			
	public static int playerTurn(int health, int enemyHealth, boolean fleeOption){
		
		do{
			
			String [] combatOptions = {"Attack", "Flee"};
			String playerMove = (String) JOptionPane.showInputDialog(null, "Combat plan", null, JOptionPane.QUESTION_MESSAGE, null, combatOptions, combatOptions[0]);

				
			if (playerMove == "Attack"){
				
				int damage = (int)(Math.random()*10);
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
	
	public static void enemyTurn(int health, int enemyHealth, boolean fleeOption, int cover){
		
	}
}
