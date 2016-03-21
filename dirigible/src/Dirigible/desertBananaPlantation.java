package Dirigible;

import javax.swing.JOptionPane;

public class desertBananaPlantation {

	public static boolean plantationMission(stats s) throws InterruptedException{
		
		boolean operationSuccess = false;
		
		int currentHealth = s.getHealth();
		
		int waterShortageBegin = JOptionPane.showConfirmDialog(null, "Captain, we found a plantation down in the Martian Desert. Want to get some more rations?");
		
		if (waterShortageBegin == JOptionPane.YES_OPTION) {
			
			String questZone = stats.location();
			
			
			System.out.println("Roalds: Okay Captain, there is a plantation in the desert below, down near " + questZone + ". Apparently they grow bananas.");
			Thread.sleep(1000);
			System.out.println("Danton: Bananas? Must be a result of the Earth colonization.");
			Thread.sleep(1000);
			System.out.println("Roalds: Regardless, we can get some food.");
			Thread.sleep(1000);
			System.out.println();
			System.out.println(questZone + ":1200 hours");
			System.out.println();
			Thread.sleep(1000);
			System.out.println("Farmer: We dont want no trouble here. Get off my land! These are my bananas... yes...");
			Thread.sleep(1000);
			System.out.println("Roalds: We come in peace.");
			Thread.sleep(1000);
			System.out.println("Farmer: Nope! You ain't gonna take my bananas! Rid of thee, you aroopas!");
			Thread.sleep(1000);
			System.out.println("Danton: Wait, what? Ok Captain, he is delusional. Just kill him.");
			Thread.sleep(1000);
			System.out.println("Farmer: No! Don't listen to the machine! He is conspiring against us desert folk!");
			Thread.sleep(1000);
			System.out.println("Roalds: Sure, the farmer here's got some screws loose, but let's not kill him.");
			Thread.sleep(1000);
			System.out.println("Farmer: Beware! Beware the non-mortal construct that flies above Bellator!");
			Thread.sleep(1000);
			
			String [] farmerChoice = {"Let's kill the mad man", "Ask to trade", "Ask for food"};
			
			String decision = (String) JOptionPane.showInputDialog(null, "Farmer?", null, JOptionPane.QUESTION_MESSAGE, null, farmerChoice, farmerChoice[0]);
			
			if (decision == "Let's kill the mad man"){
				
				int morality = s.getMorality();
    			morality -= 25;
    			s.setMorality(morality);
				
				System.out.println("Argh! Fine! I'll show you what I'm made of, sonny-boy!");
				
				int farmerHealth = 50;
				int farmerRange = 10;
				int farmerMelee = 12;
				boolean cantFlee = false;
				int farmerMod = 3;
				
				boolean victory = combat.battle(s, currentHealth, farmerHealth, farmerRange, farmerMelee, cantFlee, farmerMod);
				
				if (victory == true){
					
					System.out.println("Farmer: Ack! I yield! I yield! Take them bananas! Just spare me please!");
					Thread.sleep(1000);
					System.out.println("Danton: We should just kill him. Like I said, he is truly mad.");
					Thread.sleep(1000);
					System.out.println("Roalds: Nah, calm down, Danton. Maybe we can return later for more bananas.");
					Thread.sleep(1000);
					System.out.println("Danton: Fine.");
					Thread.sleep(1000);
					System.out.println("Here's fifty bushels of banana. Sorry, I shall be off now.");
					Thread.sleep(1000);
					System.out.println();
					System.out.println("The farmer leaves");
					System.out.println();
					Thread.sleep(1000);
					System.out.println("You found fifty pounds of bananas!");
					Thread.sleep(1000);
					
					int food = s.getFood();
					food += 50;
					s.setFood(food);
					
					operationSuccess = true;
					
				}
				
				if (victory == false){
					
					System.out.println("Farmer: Ha! Take that you crazy Earthlings!");
					Thread.sleep(1000);
					System.out.println("Roalds: For Pete's sake, we aren't from Earth!");
					Thread.sleep(1000);
					System.out.println("Danton: Captain, after seeing what happened to you, I am going to pass on a fight. Let's get you patched up");
					Thread.sleep(1000);
					
					
					
				}
				
			}
		}
		return operationSuccess;
	}
}
