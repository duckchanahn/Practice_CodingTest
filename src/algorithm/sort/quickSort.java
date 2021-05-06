package algorithm.sort;

import java.util.Arrays;

public class quickSort implements sort_interface{


//	pivot 임의로 정한 뒤 pivot 기준으로 큰수, 작은수 정렬 --> 피봇 위치는 결정
//	작은 수 큰 수 재귀
//	크기가 1 or 0일시 중지

	// 나누기 - 앞/뒤 --> 정렬

	public int count_my = 0;

	@Override
	public int[] sort() {

		int[] sample = array_sample.clone();

		this.sort_my(sample, 0, sample.length-1);

		return sample;
	}

	public int[] sort_my(int[] sample, int left, int right) {


		if(right > left) {
			int pivot = quick(sample, left, right);
			sort_my(sample, left, pivot-1);
			sort_my(sample, pivot+1, right);
		}

		return sample;
	}


	private int quick(int[] sample, int left, int right) {
		// 가장 왼쪽, 가장 오른쪽, 피봇 3가지 필요
		// 피봇은 가장 오른쪽으로 설정

		int pivot = right;
		int left_standard = left;
		int right_standard = right;
		int[] temp = new int[sample.length];

		for(int i = left_standard; i < right_standard; i++) {
			if(sample[pivot] >= sample[i]) {
				temp[left] = sample[i];
				left++;
			} else {
				temp[right] = sample[i];
				right--;
			}
		}

		pivot = left;
		temp[pivot] = sample[right_standard];
		for(int i = left_standard; i <= right_standard; i++) {
			sample[i] = temp[i];
		}

		System.out.println(count_my + " : " + Arrays.toString(sample));
		count_my++;


		return pivot;

	}

	public int[] sort_answer(int[] sample) {
		// TODO Auto-generated method stub
		return null;
	}

}