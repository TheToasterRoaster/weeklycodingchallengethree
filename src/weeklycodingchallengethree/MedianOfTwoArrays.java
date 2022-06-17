package weeklycodingchallengethree;

public class MedianOfTwoArrays {

	public int findMedian(int[] one, int[] two) {
		int[] solution = new int[one.length + two.length];
		int median = 0;
		
		int oneIndex = 0, twoIndex = 0;
		for (int i: solution) {
			if (one[oneIndex] >= two[twoIndex]) {
				solution[i] = two[twoIndex];
				twoIndex++;
			} else if (one[oneIndex] < two[twoIndex]) {
				solution[i] = one[oneIndex];
				oneIndex++;
			}
		}
		if (solution.length % 2 == 0) {
			median = solution[solution.length/2] + solution[solution.length/2 + 1];
		} else {
			median = solution[solution.length/2];
		}
		return median;
	}
}
