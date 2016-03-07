package Dirigible;

import javax.swing.JOptionPane;

public class theHub {

	public static void main(String[] args) throws InterruptedException {
		
		stats mainStats = new stats(200, 200, 200, 200, 25, 0, "rusty pistol", "worn dagger", 0, 0);
		
		// TODO Auto-generated method stub
		System.out.println("The year is 2341, and you have lived your life on an airship, New Domain.");
		Thread.sleep(1000);
		System.out.println("You recently became captain of the ship, and now you must ensure your survival.");
		Thread.sleep(1000);
		System.out.println("It has been centuries since you have arrived back on the surface.");
		Thread.sleep(1000);
		System.out.println("But, resources now run low, and you must return to the surface. Good luck, Captain");
		Thread.sleep(2000);
			
		tutorial(mainStats);
		
		do{
			int random = (int)(Math.random()*2);
			partOne(random, mainStats);
			
			
		}while(mainStats.getExperience() < 100 );
		
	}
		
		
		public static void tutorial(stats s) throws InterruptedException{
			String[] opChoices = {"Run an operation", "Stats"};
			String opDecision = (String) JOptionPane.showInputDialog(null, "Operation?", null, JOptionPane.QUESTION_MESSAGE, null, opChoices, opChoices[0]);
		
			if (opDecision == "Run an operation"){
				
				meetDanton.Danton(opChoices, s);
				
			}
			
			
			if (opDecision == "Stats") { 
				s.printStats();
			}
		}

		
		public static void partOne(int random, stats s) throws InterruptedException{
			
			
		String[] opChoices = {"Run an operation", "Stats"};
				String opDecision = (String) JOptionPane.showInputDialog(null, "Operation?", null, JOptionPane.QUESTION_MESSAGE, null, opChoices, opChoices[0]);
			
				if (opDecision == "Run an operation"){
					
					if (random == 0) {
						
						boolean missionSuccess = waterShortage.water(opChoices, s);
						System.out.println(missionSuccess);
						decreaseStats(s);
						if (missionSuccess == true){
							
							experienceIncrease(s);
							weaponSort(s);
							
						}
					}
					
					if (random == 1){
						scienceFacility.facility(opChoices);
						decreaseStats(s);
					}
					

				}
				if (opDecision == "Stats") { 
					
					s.printStats();
					
					
				}
			
			
	}
		public static void decreaseStats(stats s){
			
			int water = s.getWater();
			water -= 20;
			s.setWater(water);
			
			int food = s.getFood();
			food -= 20;
			s.setFood(food);
			
			int fuel = s.getFuel();
			fuel -= 20;
			s.setFuel(fuel);
			
		}
		
		public static void experienceIncrease(stats s){
			
			int experience = s.getExperience();
			experience += 20;
			s.setExperience(experience);
			
		}


	public static void weaponSort(stats s) {
		String weapon = stats.weaponsDropActOne();
		System.out.println(weapon);
		stats.setWeapon(s, weapon);
	}
}


