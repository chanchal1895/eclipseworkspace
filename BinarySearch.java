package com.chanchal.searching;


public class BinarySearch

{
	int[] ar = { 5, 6, 7, 10, 12, 13 };
	int k = 13;

	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		int i = bs.binarySearch(bs.ar, bs.k);
		System.out.println(i);
	}

	int binarySearch(int[] a, int k) {

		int length = a.length;
		int i = 0;
		int size = length / 2;
		int mid = size+1;
		
		while (size >= 0 && size < a.length) {

			
				if (k > a[size]) {
					
					mid =  mid/ 2;
					size = size + mid;
					if(size>=length) {					
						System.out.println("Not Found");
						i=-1;
						break;						
				}

				} else if (k == a[size]) {
					System.out.println("else if 3 " + size);
					i = size;
					break;
				}

				else if (k < a[size]) {
					System.out.println("else if 2");
					mid =  mid / 2;
					size = size - mid;
					System.out.println(size);
					if(size<=  0 && k != a[size] ) {					
							System.out.println("Not Found");
							i=-1;
							break;						
					} 

				}

			
		}
		return i;
	}

}
