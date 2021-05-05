package algorithm_sort;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {

		List<sort_interface> list = new ArrayList<sort_interface>();

		selectionSort selectionSort = new selectionSort();
		list.add(selectionSort);

		mergeSort mergeSort = new mergeSort();
		list.add(mergeSort);

		quickSort quickSort = new quickSort();
		list.add(quickSort);

		run(list);

	}

	public static void run(List<sort_interface> list) {

		for(sort_interface sort: list){
			System.out.println(sort.getClass().getName() + " ----------------");
			sort.sort();
			System.out.println("------------------------------");
			System.out.println();
		}

	}
}