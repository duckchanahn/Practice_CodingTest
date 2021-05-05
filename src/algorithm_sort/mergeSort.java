package algorithm_sort;

import java.util.Arrays;

public class mergeSort implements sort_interface{


//	배열 크기가 1이 될 때까지 반으로 분열한 뒤 2개의 배열을  정렬
//		--> 각 배열의 왼쪽 원소부터 차례대로 비교

	// 코드를 줄일 수 있는 방법 찾아보기
	public int count_my = 0;


	@Override
	public int[] sort() {

		int[] sample = array_sample.clone();

		this.sort_my(sample, 0, sample.length-1);

		return sample;
	}

	public int[] temp;
	public int[] sort_my(int[] sample, int left, int right) {


		if((right-left) == 1) {
			merge(sample, left, right, right);
		} else if(right == left) {
			return sample;
		} else {
			this.sort_my(sample, left, (right-left)/2+left);
			this.sort_my(sample, (right-left)/2+left+1, right);
			this.merge(sample, left, (right-left)/2+left+1, right);
		}

		return temp;
	}



	public int[] merge(int[] sample, int left, int digit, int right) {

		this.temp = new int[sample.length];

		int left_standard = left;
		int digit_standard = digit;

		for(int i = left_standard; i <= right; i++) {
			if(left < digit_standard && digit <= right) {
				if(sample[left] > sample[digit]) {
					temp[i] = sample[digit];
					digit++;
				} else {
					temp[i] = sample[left];
					left++;
				}
			} else if(left < digit_standard) {
				temp[i] = sample[left];
				left++;
			} else if(digit <= right) {
				temp[i] = sample[digit];
				digit++;
			}
		}

		for(int i = left_standard; i <= right; i++) {
			sample[i] = temp[i];
		}

		System.out.println(count_my + " : " + Arrays.toString(sample));
		count_my++;

		return sample;
	}

	public int[] sort_answer(int[] sample) {
		// TODO Auto-generated method stub
		return null;
	}



}