package com.learning.challenge;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        UserRunner runner = new UserRunner();
        List<User> users = runner.parseUsers();

        System.out.print("[");
        for (int i = 0; i<users.size(); i++){
            System.out.print(users.get(i));
            if (i != users.size()-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");


    }
}
