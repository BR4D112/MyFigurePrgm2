package Tests.view.JframeArea;

import com.uptc.mylibrary.string.MyString;

public class TestIsDouble {
	public static void main(String[] args) {
		System.out.println("caso 1:" + (!new MyString("123,78").isDoubleValue() ? "OK" : "FAIL"));
		System.out.println("caso 1:" + (!new MyString("").isDoubleValue() ? "OK" : "FAIL"));
		System.out.println("caso 1:" + (!new MyString("").isDoubleValue() ? "OK" : "FAIL"));
		System.out.println("caso 1:" + (!new MyString("").isDoubleValue() ? "OK" : "FAIL"));
		System.out.println("caso 1:" + (!new MyString("").isDoubleValue() ? "OK" : "FAIL"));
		System.out.println("caso 1:" + (!new MyString("").isDoubleValue() ? "OK" : "FAIL"));
	
	}
}
