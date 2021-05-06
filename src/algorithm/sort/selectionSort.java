package algorithm.sort;

import java.util.Arrays;

public class selectionSort implements sort_interface{

//	각 루프마다
//	최대 원소를 찾는다
//	최대 원소와 맨 오른쪽 원소를 교환한다
//	맨 오른쪽 원소를 제외한다


	// 재귀로 진행하는 것보다 이중배열이 더 간단 --> 굳이 재귀 쓸 정도로 복잡하지 않다고 생각하는듯

	public int count_my = 0;
	public int count_answer = 0;

	@Override
	public int[] sort() {

		int[] sample = array_sample.clone();

		this.sort_my(sample, sample.length);

		return sample;
	}

	public int[] sort_my(int[] sample, int digit) {

		System.out.println(count_my + " : " + Arrays.toString(sample));
		count_my++;

		if(digit == 1) {
			return sample;
		} else {

			int max = 0;

			for(int i = 0; i < digit; i++) {
				if(sample[max] < sample[i]) { max = i; }
			}

			int temp = sample[max];
			sample[max] = sample[digit-1];
			sample[digit-1] = temp;

			this.sort_my(sample, digit-1);

		}



		return sample;
	}

	public int[] sort_answer(int[] sample) {
		int b;
		for(int i = 0 ; i <  sample.length -1 ; i ++) {
			for(int j = i+1 ; j < sample.length ; j ++) {
				if(sample[i] > sample[j]) {
					b = sample[j];
					sample[j] = sample[i];
					sample[i] = b;
				}
			}
		}

		for(int i = 0 ; i <  sample.length ; i ++) {
			System.out.println(sample[i]);
		}

		return sample;
	}

}