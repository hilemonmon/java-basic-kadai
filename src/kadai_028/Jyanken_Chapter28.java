package kadai_028;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	private Scanner scanner = new Scanner(System.in);

	public String getMyChoice() {
	    System.out.println("自分のじゃんけんの手を入力しましょう");
	    System.out.println("グーはrockのrを入力しましょう");
	    System.out.println("チョキはscissorsのsを入力しましょう");
	    System.out.println("パーはpaperのpを入力しましょう");

	    String myChoice = scanner.next();

	    if (!myChoice.equals("r") && !myChoice.equals("p") && !myChoice.equals("s")) {
	        System.out.println("入力は無効です");
	        return getMyChoice();  // 再入力
	    }

	    return myChoice;
	}
	
	public String getRandom() {
		ArrayList<String> jankenRandom = new ArrayList<String>();
		jankenRandom.add("r");
		jankenRandom.add("s");
		jankenRandom.add("p");
		String randomChoice = jankenRandom.get((int) Math.floor(Math.random()*3));
	
//		switch (Math.floor(Math.random()*3)) {
//		case 0.0 -> randomChoice= "r";
//		case 1.0 -> randomChoice= "s";
//		case 2.0 -> randomChoice= "p";
//		default-> throw new IllegalArgumentException("Unexpected value");
//		}
		
		return(randomChoice);
	}
	
	public void playGame() {
	    String myChoice = getMyChoice();
	    String randomChoice = getRandom();

	    HashMap<String, String> jankenHand = new HashMap<>();
	    jankenHand.put("r", "グー");
	    jankenHand.put("s", "チョキ");
	    jankenHand.put("p", "パー");

	    System.out.println("自分の手は" + jankenHand.get(myChoice) + "、対戦相手の手はa" + jankenHand.get(randomChoice));

	    if (myChoice.equals(randomChoice)) {
	        System.out.println("あいこです");
	    } else if (
	        (myChoice.equals("r") && randomChoice.equals("s")) ||
	        (myChoice.equals("s") && randomChoice.equals("p")) ||
	        (myChoice.equals("p") && randomChoice.equals("r"))
	    ) {
	        System.out.println("自分の勝ちです");
	    } else {
	        System.out.println("自分の負けです");
	    }
	}
}
