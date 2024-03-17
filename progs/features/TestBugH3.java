class TestBugH3 {
	public static void main(String[] args) {
		int x = -3;
		do {
			System.out.println(x);
			x = x + 1;
		} while (x < 0);
	}
}
