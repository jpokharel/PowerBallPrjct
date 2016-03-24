package poweball;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountOfRecentNumbers {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\jiwanpokharel89\\Desktop\\winnums-text.txt"));
		String header=br.readLine();
		int[][] winBalls=new int[69][1];
		int[][] powerBalls=new int[35][1];
		int i,j;
		for (i=0;i<15;i++){
			String[] values=(br.readLine()).split("\t");
			for(j=1;j<values.length-1;j++){
				System.out.println(winBalls[(Integer.parseInt(values[j]))][0]++);
			}
			//powerBalls[(Integer.parseInt(values[j]))][0]++;
		}
		System.out.println("Winballs \t Count ");
		for(int m=0;m<69;m++){
			int repVal=winBalls[m][0];
			//if(repVal!=0)
				//System.out.println(m+"\t"+repVal);
		}
	}

}
