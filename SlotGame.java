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
				// original = original.substring(0, i) + "I" + original.substring(i + 1);
				original = original.replace(original.charAt(i), 'I');
                System.out.println("original: "+original);
                // guess = guess.substring(0, i) + "I" + guess.substring(i + 1);
				guess = guess.replace(guess.charAt(i), 'I');
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
						// original = original.substring(0, j) + "I" + original.substring(j + 1);
						original = original.replace(original.charAt(j), 'I');
                        System.out.println("original-1: "+original);
                        // guess = guess.substring(0, i) + "I" + guess.substring(i + 1);
						guess = guess.replace(guess.charAt(i), 'I');
                        System.out.println("guess-1: "+guess);
						break;
					}
				}
			}
		}
		return point;
	}
	public static int helper(char c){
		if(c == 'B'){
			return 0;
		}
		else if(c == 'G'){
			return 1;
		}
		else if(c == 'R'){
			return 2;
		}
		else{
			return 3;
		}
	}
	public static int slotScore1(String original, String guess){
		int point = 0;
		int count[] = {0, 0, 0, 0};
		//perfect hit
		for(int i=0; i<4; i++){
			if(original.charAt(i) == guess.charAt(i)){
				point += 2;
			}
			else{
				int color = helper(original.charAt(i));
				count[color]++;
			}
		}
		// normal hit
		for(int i=0; i<4; i++){
			int color = helper(guess.charAt(i));
			if(count[color]>0 && guess.charAt(i) != original.charAt(i)){
				point++;
				count[color]--;
			}
		}
		return point;
	}
    public static void main(String[] args) {
        String original = scanner.s.next();
        String guess = scanner.s.next();
        // int ans = slotScore(original, guess);
		int ans = slotScore1(original, guess);
        System.out.println(ans);
    }
}
	// public static int slotScore(String original, String guess) {
	// 	// Write your code here.
	// 	if(guess.length()==0 || original.length()==0){
	// 		 return 0;
	// 	}
	// 	 int count = 0;
	// 	 Set<Character> originalChars = new HashSet<>();  // To track used characters
	// 	 Set<Character> guessChars = new HashSet<>();
    //     for (int i = 0; i < original.length(); i++) {
    //         if (original.charAt(i) == guess.charAt(i)){
    //             count += 2;
    //         } else {
	// 			originalChars.add(original.charAt(i));
	// 			guessChars.add(guess.charAt(i));
	// 		}
    //     }
	// 	for (char c : guessChars) {
    //     	if (originalChars.contains(c)) {
    //      count++;
    //      originalChars.remove(c); // Remove the character from originalChars to avoid double counting
    // 		}
	// 	}
	// 	return count;
	// }