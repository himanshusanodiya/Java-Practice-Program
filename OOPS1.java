public class OOPS1 {
    public static void main(String[] args) {

        //car volvo = new car("red", 222, 1000000);
       // car audi = new car();

        /*
         * volvo.color = "red";
         * volvo.model = 2022;
         * volvo.prize = 3000000;
         * 
         * System.out.println(volvo.color);
         * System.out.println(volvo.model);
         * System.out.println(volvo.prize);
         */
        /*
         * System.out.println("volvo properties ");
         * System.out.println();
         * 
         * System.out.println(volvo.color);
         * System.out.println(volvo.prize);
         * System.out.println(volvo.model);
         * 
         * System.out.println();
         * System.out.println("audi properties ");
         * 
         * System.out.println(audi.color);p
         * System.out.println(audi.prize);
         * System.out.println(audi.model);
         */

        // +++++++++++++++++++++ ================= +===============s
/*
        System.out.println("new reference variable property volvo to maruti ");
        car new_car = new car(volvo);
        System.out.println(new_car.color);
        System.out.println(new_car.prize);
        System.out.println(new_car.model);

    }
}

class car {
    String color;
    int prize;
    int model;

    car() {
        this.color = "red";
        this.model = 2022;
        this.prize = 100000000;
    }

    car(String colour, int prize, int model) {
        this.color = colour;
        this.prize = prize;
        this.model = model;
    }

    car(car maruti) {
        this.color = maruti.color;
        this.model = maruti.model;
        this.prize = maruti.prize;
    }
}
     */
    Human obj = new Human("himanshu",19,"sanodiya");
    System.out.println(obj.name);
    System.out.println(obj.age);
     System.out.println(obj.lastName);

    }
}

class Human {
    String name;
    int age;
    String lastName;

    // Constructor
    Human(String name, int age, String lastName) {
        this.name = name;
        this.age = age;
        this.lastName = lastName;
    }
}
