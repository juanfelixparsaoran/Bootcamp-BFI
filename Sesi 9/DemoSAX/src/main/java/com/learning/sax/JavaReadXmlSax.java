package com.learning.sax;

import java.util.List;

public class JavaReadXmlSax {
    public static void main(String[] args) {
        MyRunner runner = new MyRunner();
        List<User> lines = runner.parseUsers();

        // lines.forEach(System.out::println);

        for (User user : lines) {
            System.out.println(user);
        }
    }
}
