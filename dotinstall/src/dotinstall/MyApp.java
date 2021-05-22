package dotinstall;

//乱数を使用するために記述
import java.util.Random;
//CLIで入力したデータを保存するために記述
import java.util.Scanner;


class MyApp {
	public static void main(String[] args) {
//		nextInt(x) => 0〜x未満の数をランダムに生成
		int answer = new Random().nextInt(10) + 1;
		int count = 0;
		
//		while(true) => 無限ループをする際に記述。抜け出したい結果に対して「break」を記述することで、ループを終了させることができる。
		while(true) {
			System.out.print("What's your guess? ");
			int guess = new Scanner(System.in).nextInt();
			count++;
			
			if(answer == guess) {
				System.out.println("Bingo! It took " + count + "guesses!");
				System.out.println("The answer was " + answer);
				break;
			} else if(answer > guess) {
				System.out.println("The answer is higher!");
			} else if(answer < guess) {
				System.out.println("The answer is lower!");
			} else {
				System.out.println("Another Int!");
			}			
		}
		
		
		
	}
}
//System.out.println("");