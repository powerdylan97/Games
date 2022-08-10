//Basic code to explore GitHub
//Created by Dylan Power

public class Game {
	public static void main(String args[]) {
		System.out.println("Make A Wish (Press enter to shake)");
		try{System.in.read();}
			catch(Exception e) {}
		System.out.println(ShakeBall());
	}
	public static String ShakeBall() {
		String reply = "";
		int min = 0;
		int max = 19;
		int rand = (int)Math.floor(Math.random()*(max-min+1)+min);
		switch (rand) {
		case 0: reply = "It is certain";
				break;
		case 1: reply = "It is decidedly so";
				break;
		case 2: reply = "Without a doubt";
				break;
		case 3: reply = "Yes definitely";
				break;
		case 4: reply = "You may rely on it";
				break;
		case 5: reply = "As I see it, yes";
				break;
		case 6: reply = "Most likely";
				break;
		case 7: reply = "Outlook good";
				break;
		case 8: reply = "Yes";
				break;
		case 9: reply = "Signs point to Yes";
				break;
		case 10: reply = "Reply hazy, try again";
				break;
		case 11: reply = "Ask again later";
				break;
		case 12: reply = "Better not tell you now";
				break;
		case 13: reply = "Cannot predict now";
				break;
		case 14: reply = "Concentrate and ask again";
				break;
		case 15: reply = "Don't count on it";
				break;
		case 16: reply = "My reply is no";
				break;
		case 17: reply = "My sources say no";
				break;
		case 18: reply = "Outlook not so good";
				break;
		case 19: reply = "Very doubtful";
				break;
		}
		return reply;
	}
}
