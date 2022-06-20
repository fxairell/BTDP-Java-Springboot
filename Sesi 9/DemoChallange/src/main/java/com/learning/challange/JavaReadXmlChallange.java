package com.learning.challange;

import java.util.List;

public class JavaReadXmlChallange {
    public static void main(String[] args) {
        MyRunner runner = new MyRunner();
        List<Challange> lines = runner.parseUsers();

        lines.forEach(System.out::print);
    }
}
