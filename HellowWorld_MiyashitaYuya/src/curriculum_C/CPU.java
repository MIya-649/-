package curriculum_C;

import java.util.Random;

//CPUの手をランダムで表示
class CPU {
	private Random random = new Random();
	
	public int getHand() {
		return random.nextInt(3);
	}
}