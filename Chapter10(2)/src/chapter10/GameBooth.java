package chapter10;

import java.util.Random;

public class GameBooth {
	private String firstPrize, consolationPrize;
		
	
//prizes are set
	public GameBooth(double charge, String p1, String p2) {
		firstPrize = p1;
		consolationPrize = p2;
	}
	

//game is played and prize is selected
	public String start() {
		int toss;
		int successes = 0;
		Random rand = new Random();
	 	
	 	/* play game */
	 	for (int i = 0; i < 3; i++) {	//player gets three tries
	 		toss = rand.nextInt(2);
	 		if (toss == 1) {
	 			successes += 1;			//a successful toss is equal to 1
	 		}
	 	}
	 	
	 	/* award prize */
	 	if (successes == 3 ) {
	 		return(firstPrize);
	 	} else {
	 		return(consolationPrize);
	 	}
	}


	


}
