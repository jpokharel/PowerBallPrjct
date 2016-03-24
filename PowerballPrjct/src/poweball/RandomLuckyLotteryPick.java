package poweball;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Random;

public class RandomLuckyLotteryPick implements Serializable {

	private static final long serialVersionUID = -2614207091513041799L;

	public static void main(String[] args) throws IOException {

		String lotteryNumber = "";
		Random rand = new Random();
		for (int i = 0; i < 5; i++) {
			int x1 = rand.nextInt(69);
			int x2 = rand.nextInt(69);
			int x3 = rand.nextInt(69);
			int x4 = rand.nextInt(69);
			int x5 = rand.nextInt(69);
			int powerball = rand.nextInt(26);

			while (x1 == x2)
				x2 = rand.nextInt(69);
			while (x1 == x3 || x2 == x3)
				x3 = rand.nextInt(69);
			while (x1 == x4 || x2 == x4 || x3 == x4)
				x4 = rand.nextInt(69);
			while (x1 == x5 || x2 == x5 || x3 == x5 || x4 == x5)
				x2 = rand.nextInt(69);

			lotteryNumber = x1 + "\t" + x2 + "\t" + x3 + "\t" + x4 + "\t" + x5 + "\t" + powerball + "\n";
			System.out.println(lotteryNumber);
		}

		String header = "First\tSecond\tThird\tFourth\tFifth\tPowerball";
		FileWriter fw = new FileWriter("C:\\Users\\jiwanpokharel89\\Desktop\\LuckyLotteryNums.txt");
		fw.append(header);
		//fw.append("\\n");
		fw.write("\n");
		fw.append(lotteryNumber);
		fw.flush();
		fw.close();

	}
}
