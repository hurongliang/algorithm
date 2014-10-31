package com.hurl.algorithm.sort;

public class InsertionSort implements Sortable {

	@Override
	public void sort(int[] list) {
		int target;
		int k;
		for (int i = 1; i < list.length; i++) {
			target = list[i];
			k = i - 1;
			while (k >= 0 && list[k] > target) {
				if (list[k] > target) {
					list[k + 1] = list[k];
					k--;
				} else {
					break;
				}
			}
			list[k + 1] = target;
		}
	}

}
