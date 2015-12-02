package com.timr;

public class FindBugsSecurity {
	private final String[] permissions={"Read", "SEARCH"};
	private void infiniteLoop(int loops) {
		infiniteLoop(99);
	}

	public String[] exposure() {
		return permissions;
	}

	public static void main(String[] args) {
		String[] myPermissions = new
			FindBugsSecurity().exposure();
		myPermissions[0] = "READ/WRITE";
		System.out.println(myPermissions[0]);
	}
}
