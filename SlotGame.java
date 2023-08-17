public class SlotGame {
    public static int slotScore(String original, String guess) {
		// Write your code here.
		int point = 0;
        //CHECK BOTH CHAR ARE SAME ARE NOT
        //EX- ORIGINAL-RGBY AND GUESS-GGRR
        // (R-G),(G-G)-2 POINTS, (B-R), (Y-R)
        //IF EQUAL THEN GIVES 2 POINTS WHICH IS PERFECT SHOT
		for(int i=0; i<4; i++){
			if(original.charAt(i)==guess.charAt(i)){
				point = point + 2;
				original = original.substring(0, i) + "I" + original.substring(i + 1);
                System.out.println("original: "+original);
                guess = guess.substring(0, i) + "I" + guess.substring(i + 1);
                System.out.println("guess: "+guess);
			}
		}
        // ORIGINAL-RIBY GUESS-GIRR
        //FOR NORMAL SHOT GIVES 1 POINT
        //R(SKIP-I) (R-G), (R-R)- 1 POINT,-(ORIGINAL-IIBY GUESS-GIIR)
		//(SKIP-I) (B-G), (B-R)
		//(Y-G), (Y-R)

		for(int i=0; i<4; i++){
			if(guess.charAt(i) != 'I'){
				for(int j=0; j<4; j++){
					if(guess.charAt(i) == original.charAt(j)){
						point = point + 1;
						original = original.substring(0, j) + "I" + original.substring(j + 1);
                        System.out.println("original-1: "+original);
                        guess = guess.substring(0, i) + "I" + guess.substring(i + 1);
                        System.out.println("guess-1: "+guess);
						break;
					}
				}
			}
		}
		return point;
	}
    public static void main(String[] args) {
        String original = scanner.s.next();
        String guess = scanner.s.next();
        int ans = slotScore(original, guess);
        System.out.println(ans);
    }
}
