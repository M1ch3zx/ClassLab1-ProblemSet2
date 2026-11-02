package edu.monmouth.lab1;

public class Person {
	
	public static void main(String[] args) {
	}
	
    private String name;
    // The mutator method 
    public Person() {
        setName("UNKNOWN");
    }

    public Person(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        if (name == null || name.length() == 0) {
            this.name = "UNKNOWN";
        } else {
            this.name = name;
        }
    }
 // step 2 making the NameLong method
    public boolean isNameLong() {
        return name.length() > 7;
    }
}

