package wrapperclass_generics.wrapper;

import javax.swing.text.StyledEditorKit;

public class WrapperClassMain {
    public static void main(String[] args) {
        // autoboxing and unboxing
        Integer a = 1; // autoboxing
        int b = a; // unboxing

        // utility methods
        int x = Integer.parseInt("123");
        System.out.println(x);
        boolean isTrue = Boolean.parseBoolean("true");
        System.out.println(isTrue);
    }
}
