package Dirigible;

import javax.swing.JOptionPane;

public class scienceFacility {

	public static void facility(String[] args) throws InterruptedException{
		
		String questZone = stats.location();
		// TODO Auto-generated method stub
		int scienceFacilityBegin = JOptionPane.showConfirmDialog(null, "Danton: Captain, we have uncovered an abandoned science facility near " + questZone + ". Want to investigate?");
		
		if (scienceFacilityBegin == JOptionPane.YES_OPTION){
			
			System.out.println("Danton: Transport ready, sir. I won't be joining you on this mission");
			Thread.sleep(1000);
			System.out.println();
			System.out.println("You locate an abandoned landing pad, yet nothing else. Red sand fills the crevices of the pad.");
			System.out.println("A control pad is on the Northern corner. Light posts petrude from the ground every ninety degrees ");
			System.out.println();
			Thread.sleep(2000);
			System.out.println("Roalds: Sorry, sir. I don't see anything. We can check the controls.");
			Thread.sleep(1000);
			System.out.println("You walk over to the controls.");
			System.out.println();
			String terminus = JOptionPane.showInputDialog(null, "Terminus: PASSWORD REQUIRED.");
			
			if (terminus == "Danton"){
				
				System.out.println("A secret passage opens underneath the terminal.");
				
				int dantonTunnel = JOptionPane.showConfirmDialog(null, "That is suspicious... Investigate?");
				
				if (dantonTunnel == JOptionPane.YES_OPTION){
					
					
					
				}
			}
				
				else{
						
					System.out.println("Something tells you not to meddle in these affairs.");
					
				}
				
			
		}
			
			
			else {
				
				System.out.println("We can come back later, if we find this place again.");
				
			}
			
		
		
		
		if (scienceFacilityBegin == JOptionPane.NO_OPTION){
			
			System.out.println("Danton: I'm sure the place was a death trap anyway, sir.");

		}
		
		if (scienceFacilityBegin == JOptionPane.CANCEL_OPTION) {
			
			System.out.println("Danton: I'm sure the place was a death trap anyway, sir.");
			
		}
		
	}

}
