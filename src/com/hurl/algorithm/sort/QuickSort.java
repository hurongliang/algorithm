package com.hurl.algorithm.sort;

public class QuickSort implements Sortable {

	@Override
	public void sort(int[] list) {
		this.sort(list, 0, list.length - 1);
	}

	private void sort(int[] list, int from, int to) {
		if (from >= to) {
			return;
		}

		int x = list[from];
		int i = from, j = to;
		while (i < j) {
			while (i < j && list[j] > x) {
				j--;
			}

			if (i == j) {
				break;
			}

			list[i] = list[j];
			i++;

			while (i < j && list[i] <= x) {
				i++;
			}
			if (i == j) {
				break;
			}

			list[j] = list[i];
			j--;
		}
		list[i] = x;

		sort(list, from, i - 1);
		sort(list, i + 1, to);
	}

}
