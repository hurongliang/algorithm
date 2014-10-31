package com.hurl.algorithm.sort;

public class BubbleSort implements Sort {

	@Override
	public void sort(int[] list) {
		boolean complete = true;
		int tmp;
		do {
			complete = true;
			for (int i = 0; i < list.length - 1; i++) {
				if (list[i] > list[i + 1]) {
					tmp = list[i + 1];
					list[i + 1] = list[i];
					list[i] = tmp;
					complete = false;
				}
			}
		} while (!complete);
	}
}
