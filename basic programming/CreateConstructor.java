

class Constructor {
    int id;
    String name;

    // Constructor
    Constructor(int i, String n) {
        id = i;
        name = n;
    }

    // Method to display values
    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

 
}

class CreateConstructor {
    public static void main(String[] args) {
        // Creating objects and passing values to the constructor
        Constructor obj1 = new Constructor(1, "Alice");
        Constructor obj2 = new Constructor(2, "Bob");

        // Displaying values of the objects
        obj1.display();
        obj2.display();
    }
}
