package com.hurl.algorithm.sort;

public class MergeSort implements Sortable {

	@Override
	public void sort(int[] list) {
		this.sort(list, 0, list.length - 1);
	}

	private void sort(int[] list, int from, int to) {
		if (from < to) {
			int middle = (from + to) / 2;

			// sort left sub array
			sort(list, from, middle);

			// sort right sub array
			sort(list, middle + 1, to);

			// merge sorted left sub array and right sub array
			this.merge(list, from, middle, to);
		}
	}

	private void merge(int[] list, int leftfrom, int leftto, int rightto) {
		int[] merged = new int[rightto - leftfrom + 1];
		int leftpos = leftfrom;
		int rightpos = leftto + 1;
		int mergedpos = 0;
		while (leftpos <= leftto && rightpos <= rightto) {
			if (list[leftpos] < list[rightpos]) {
				merged[mergedpos++] = list[leftpos++];
			} else {
				merged[mergedpos++] = list[rightpos++];
			}
		}
		while (leftpos <= leftto) {
			merged[mergedpos++] = list[leftpos++];
		}
		while (rightpos <= rightto) {
			merged[mergedpos++] = list[rightpos++];
		}
		for (int i = 0; i < merged.length; i++) {
			list[i + leftfrom] = merged[i];
		}
	}
}
