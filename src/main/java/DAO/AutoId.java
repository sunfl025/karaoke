package DAO;

import java.util.Scanner;

public class AutoId {
	private static String ex="KH";
	private static int currentId = 0;
	    private static int id;
	    private String name;

	    public AutoId() {
	        this.id = currentId++;
	    }
	    
	    public void input(Scanner sc){
	        this.name = sc.nextLine();
	    }

	    public static String toID() {
	        return ex + id;
	    }
}
