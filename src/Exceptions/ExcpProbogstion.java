
package Exceptions;
class ExcpProbogstion {

	void m() {
		int data = 50 / 0;
	}

	void n() {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled");
		}
	}

	public static void main(String args[]) {
		ExcpProbogstion obj = new ExcpProbogstion();
		obj.p();
		System.out.println("normal flow...");
	}
}