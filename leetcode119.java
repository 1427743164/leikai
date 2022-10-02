public class leetcode119 {
    
    public List<Integer> getRow(int rowIndex) {
		
        int[][] arr = new int[80][80];	
        arr[0][0] = 1;
		
        int i = 1;
		while (i <= rowIndex) {
			for (int j = 0; j <= i; j++) {
				if (j == 0) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
				}
			}
			i++;
		}
		
        List<Integer> list = new ArrayList<Integer>();
		for (int j = 0; j <= rowIndex; j++) {
			list.add(arr[rowIndex][j]);
		}
		
        return list;
    }
}