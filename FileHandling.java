package org.testing;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\KALAIVANI\\Desktop\\Mukeskanna\\FileOperation.txt");
		f.createNewFile();
		FileWriter fw = new FileWriter(f);
		fw.write("1) Cricket is a game played with bat and ball having 11 players on each side of the two teams.\r\n" + 
				"\r\n" + 
				"2) The person who hits the ball is called “Batsman”, another person who bowls is called “Bowler”.\r\n" + 
				"\r\n" + 
				"3) The aim of the two teams is to restrict the opponent to fewer runs while bowling and make maximum runs while batting.\r\n" + 
				"\r\n" + 
				"4) Before the start of the game a coin is tossed, with heads as winners and tails as losers of the toss, the winner of the toss decides either to bowl or bat first.\r\n" + 
				"\r\n" + 
				"5) To give a batsman out there are two judges who stand on the field, they are called “Umpires”.\r\n" + 
				"\r\n" + 
				"6) There is a third umpire who sits outside the field to assist the field umpires while giving “Run- Out”, “Leg Before Wicket” etc.\r\n" + 
				"\r\n" + 
				"7) Match referee is also a part of this game who observes the moral conduct of the players in a match, and also punishes them for violation of rules.\r\n" + 
				"\r\n" + 
				"8) The apex body which governs cricket in the whole world is the ICC (International Cricket Council).\r\n" + 
				"\r\n" + 
				"9) Cricket matches are played in a ground having a rectangular clearing in the middle known as a pitch; its length is 20.12m or 22 yards in length and 10ft (3.05 meters) in width.\r\n" + 
				"\r\n" + 
				"10) Three wickets on each end are placed on the pitch, and the batsman while batting has the responsibility to protect the wickets from falling.");
		fw.flush();
		fw.close();
	}
}
