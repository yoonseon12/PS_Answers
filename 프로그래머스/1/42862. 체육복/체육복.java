class Solution {
    int[] wears;
    
    public void initArr(int n, int[] arr, boolean isLost) {
			for (int i=0; i<n; i++) {
				if (isLost)
					wears[arr[i]-1] = wears[arr[i]-1]-1;
				else
					wears[arr[i]-1] = wears[arr[i]-1]+1;
			}
		}
    
    public int solution(int n, int[] lost, int[] reserve) {
			int answer = 0;
			wears = new int[n];
			initArr(lost.length, lost, true);
			initArr(reserve.length, reserve, false);

			for (int i : wears)
				System.out.println(i);

			for (int i=0; i<n; i++) {
				// 순회하면서 잃어버린 사람인 경우 양옆 인덱스 확인 후 증가
				if (wears[i] == -1) {
					if (i != 0 && wears[i-1] == 1) {
						wears[i-1] = 0;
						answer++;
					}
					else if (i != n-1 && wears[i+1] == 1) {
						wears[i+1] = 0;
						answer++;
					}
				} else {
					answer++;
				}
			}

			return answer;
		}
}