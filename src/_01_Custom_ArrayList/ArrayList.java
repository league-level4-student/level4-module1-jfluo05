package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] arr;
	public ArrayList() {
		arr= (T[])new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		return arr[loc];
	}
	
	public void add(T val) {
		T[] newArr;
		newArr= (T[])new Object[arr.length+1];
		for (int i = 0; i < arr.length; i++) {
			newArr[i]=arr[i];
		}
		newArr[newArr.length-1]=val;
		arr=newArr;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] array;
		array= (T[])new Object[arr.length+1];
		for (int i = 0; i < loc; i++) {
			array[i]=arr[i];
		}
		array[loc]=val;
		for (int i = loc+1; i<array.length; i++) {
			array[i]=arr[i-1];
		}
		arr=array;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		T[] array;
		array= (T[])new Object[arr.length+1];
		for (int i = 0; i < loc; i++) {
			array[i]=arr[i];
		}
		array[loc]=val;
		for (int i = loc; i<array.length; i++) {
			array[i]=arr[i];
		}
		arr=array;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		
	}
	
	public boolean contains(T val) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==val) {
				return true;
			}
		}
		return false;
	}
}