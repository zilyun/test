package test;

public class Solution {

	public static void main(String[] args) {
		int[][] land = { { 1, 2, 9, 8 }, { 5, 6, 9, 7 }, { 4, 3, 3, 1 } };
		solution(land);

	}

	static int solution(int[][] land) {
		int answer = 1;

		for (int i = 1; i < land.length; i++) {
			land[i][0] += Math.max(land[i - 1][1], Math.max(land[i - 1][2], land[i - 1][3]));
			land[i][1] += Math.max(land[i - 1][0], Math.max(land[i - 1][2], land[i - 1][3]));
			land[i][2] += Math.max(land[i - 1][0], Math.max(land[i - 1][1], land[i - 1][3]));
			land[i][3] += Math.max(land[i - 1][0], Math.max(land[i - 1][1], land[i - 1][2]));

			System.out
					.println(land[i - 1][0] + " : " + land[i - 1][1] + " : " + land[i - 1][2] + " : " + land[i - 1][3]);
			System.out.println(land[i][0] + " : " + land[i][1] + " : " + land[i][2] + " : " + land[i][3]);
		}

		for (int i : land[land.length - 1]) {
			answer = Math.max(answer, i);
		}
		
		System.out.println("1:2:3:4");
		System.out.println("revert5");
		System.out.println("revert6");

		return answer;
	}
}
