import java.util.*;

class Glass {
    double capacity = 0.5, quantity = 0.0; 
    
    Glass() {} // empty constructor
    Glass(double capacity) {
        this.capacity = capacity;  // change to default capacity
    }

    double getCapacity() {
        return this.capacity;
    }

    void setCapacity(double quantity) {
        this.capacity = quantity;
    }

    void fill(double c) {
        if (c > this.capacity) {
            System.out.println("Cannot fill the Glass( quantity > glass capacity)");
            return;
        }
        this.quantity = c;
    }

    void status() {
        System.out.println("\nGlass Status: \n-------------");
        System.out.println("Capacity: "+capacity);
        System.out.println("Quantity: "+quantity);
    }
}

class Jug {
    double capacity = 3.0, quantity = 0.0;

    Jug() {} // empty constructor

    Jug(double capacity) { // constructor overloaded (parameterized constructor)
        this.capacity = capacity;
    }
    Jug(double capacity, double quantity) { // constructor overloaded 
        this.capacity = capacity;
        this.quantity = quantity;
    }

    double getCapacity() {
        return this.capacity;
    }

    void setCapacity(double quantity) {
        this.capacity = quantity;
    }

    void fill(double q) {
       if (this.capacity < q) {
           System.out.println("Cannot fill the Jug (quantity > Jug capacity)");
        } else {
            this.quantity = q;
        }
    }

    void pour(Glass g, double q) {
        this.quantity -= q;
    }

    void status() {
        System.out.println("\nJug Status: \n-------------");
        System.out.println("Capacity: "+capacity);
        System.out.println("Quantity: "+quantity);
    }
}

class Human {
    String name;
    double totalConsumeWater = 0.0;

    Human() {}

    Human(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    void fillGlass(Glass g, Jug j, double quantity) {
        if(j.quantity >= quantity) {
            j.quantity -= quantity;
            
            if (g.quantity <= quantity) {
                g.quantity = quantity;
            } else {
                System.out.println("Not enough space to fill the jug.");
            }
        } else {
            System.out.println("Not enough quantity in the jug.");
        }
    }         

    void fillJug(Jug j, double quantity) {
        if ((j.capacity - j.quantity ) >= quantity) {
            j.quantity += quantity;
        } else {
            System.out.println("Not enough space to fill the jug.");
        }
    }

    void drink(Glass g, double quantity) {
        if(g.quantity < quantity) {
            System.out.println("Not enough water to drink.");
        } else {
            g.quantity -= quantity;
            totalConsumeWater += quantity;
        }
    }

    void status() {
        System.out.println("\nHuman Status: \n-------------------");
        System.out.println("Name : " + this.name);
        System.out.println("Total water drink: " + totalConsumeWater);
    }
}

class DrinkWater {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        
        System.out.print("Enter the name of the human: ");
        String name = scan.nextLine();
        
        Human H = new Human(name);
        Jug J = new Jug();
        Glass G = new Glass();
        
        System.out.println("BEFORE DRINK THE WATER!!!");
        H.status();
    
        System.out.print("\nEnter the amount of water you want to fill in your Jug(<=3 liter): ");
        double jFillWater = scan.nextDouble();
        H.fillJug(J, jFillWater);
        J.status();
        
        System.out.print("\nEnter the amount of water you want to fill with glass: (<= .5 liter): ");
        double gFillWater = scan.nextDouble();
        H.fillGlass(G, J, gFillWater);
        G.status();

        System.out.print("\nEnter the amount of water you want to drink: (<= you glass fill with water): ");
        double drinkWater = scan.nextDouble();
        H.drink(G, drinkWater);
        
        System.out.println("\n\nAfter Drink the water!!!!");
        H.status();
        J.status();
        G.status();
    }
}