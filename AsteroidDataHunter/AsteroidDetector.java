import java.util.*;
import java.io.*;

class AsteroidDetector {
	public static void main(String[] args) {
		AsteroidDetector o = new AsteroidDetector();
		o.readTest();
	}

	void readTest() {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		try {
			for (int i = 0; i < 100; i++) {
				System.err.println("Loop i: " + i);
				int W = Integer.parseInt(input.readLine());
				int H = Integer.parseInt(input.readLine());
				System.err.println("W: " + W + ", H: " + H);

				int[][] imageData_ = new int[4][W*H];
				String[][] header_ = new String[4][W*H];
				double[][] wcs_ = new double[4][8];

				System.err.println("Begin to read images");
				for (int f = 0; f < 4; f++) {
					for (int j = 0; j < W*H; j++)
						imageData_[f][j] = Integer.parseInt(input.readLine());
					int N = Integer.parseInt(input.readLine());
					for (int j = 0; j < N; j++)
						header_[f][j] = input.readLine();
					for (int j = 0; j < 8; j++)
						wcs_[f][j] = Double.parseDouble(input.readLine());
				}
				System.err.println("Finish to read imgaes");

				int N = Integer.parseInt(input.readLine());
				System.err.println("N: "+ N);
				String[] detections = new String[N];
				System.err.println("Begin to read detections");
				for (int j = 0; j < N; j++)
					detections[j] = input.readLine();

	      int result = this.trainingData(W, H, imageData_[0], header_[0], wcs_[0],
	       imageData_[1], header_[1], wcs_[1], imageData_[2], header_[2],
	        wcs_[2], imageData_[3], header_[3], wcs_[3], detections);

	      result = 1;
	      System.err.println("result: " + result);

	      System.out.println(1);
	//      flush()
	      if (result == 1) break;
	    }

	    for (int i = 0; i < 20; i++) {
        String imageID = input.readLine();
        int W = Integer.parseInt(input.readLine());
        int H = Integer.parseInt(input.readLine());
        int[][] imageData_ = new int[4][W*H];
 				String[][] header_ = new String[4][W*H];
				double[][] wcs_ = new double[4][W*H];
       
        for (int f = 0; f < 4; f++) {
          for (int j = 0; j < W*H; j++)
              imageData_[f][j] = Integer.parseInt(input.readLine());
          int N = Integer.parseInt(input.readLine());
          for (int j = 0; j < N; j++)
              header_[f][j] = input.readLine();
          for (int j = 0; j < 8; j++)
              wcs_[f][j] = Double.parseDouble(input.readLine());
        }
        int result = this.testingData(imageID, W, H, imageData_[0], header_[0],
         wcs_[0], imageData_[1], header_[1], wcs_[1], imageData_[2],
          header_[2], wcs_[2], imageData_[3], header_[3], wcs_[3]);
        System.out.println(result);
//        printLine(result)
//        flush(stdout)
	    }
	    String[] results = this.getAnswer();
	    System.out.println(0);
//	    printLine(length(results))
//	    for (i=0;i < length(results); i++)
//	        printLine(results[i])
//	    flush(stdout)    
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	int trainingData(int width, int height, int[] imageData_1, 
		String[] header_1, double[] wcs_1, int[] imageData_2, 
		String[] header_2, double[] wcs_2, int[] imageData_3, 
		String[] header_3, double[] wcs_3, int[] imageData_4, 
		String[] header_4, double[] wcs_4, String[] detections) {

		return 0;
	}

	int testingData(String imageID, int width, int height, int[] imageData_1, 
		String[] header_1, double[] wcs_1, int[] imageData_2, 
		String[] header_2, double[] wcs_2, int[] imageData_3, 
		String[] header_3, double[] wcs_3, int[] imageData_4, 
		String[] header_4, double[] wcs_4) {

		return 0;
	}

	String[] getAnswer() {
		String[] res = new String[]{"hoge"};
		return res;
	}
};