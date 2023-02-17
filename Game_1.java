package demo;
import java.util.*;
import java.util.Scanner;

class Guess
{	
	Scanner sc = new Scanner(System.in);
	public int count;
	Random random = new Random();
	int randomNumber = random.nextInt(101);
	public void print() {
		/*System.out.println(number);*/
		System.out.println("Guess Number Game. ");
		System.out.println("Range of number : 0 to 100. ");	
	}
	
	boolean isCorrectGuess()
	{
		count++;
		System.out.println("Guess the number : ");
		int number = sc.nextInt();
		if(number > randomNumber)
		{
			System.out.println("Your guess number is very high.");
		}
		else if(number < randomNumber) {
			System.out.println("Your guess number is very low.");
		}
		else if (number == randomNumber)
		{
			System.out.format("Congratulations !! \nYour guess is correct. It was %d",number);
			System.out.println("\nYou completed this game in "+count+" rounds.");
			return true;
		}
		return false;
	}
	
}

public class Game_1 {
	public static void main(String[] args)
	{	
		Guess obj = new Guess();
		obj.print();
		boolean b=false;
		while(!b) {
			b=obj.isCorrectGuess();
		}
	}
}