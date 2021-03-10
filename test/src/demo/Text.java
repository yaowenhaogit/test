package demo;

import javax.lang.model.element.VariableElement;

public class Text {
	public static void main(String[] args) {
		String tex = "427,774,";
		String [] aStrings = tex.split(",");
		for (String string : aStrings) {
			System.out.println(string);
		}
		System.out.println(tex.split(","));
	}
}
