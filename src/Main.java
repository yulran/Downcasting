public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        operateVehicle(car);
        operateVehicle(motorcycle);
        Soup soup=new Soup();
        Steak steak=new Steak();
        cookDish(soup);
        cookDish(steak);
    }

     public static class Car implements Vehicle {

        @Override
        public void start() {
            System.out.println("start");
        }

        @Override
        public void stop() {
            System.out.println("stop");

        }
    }

    public static class Motorcycle implements Vehicle {

        @Override
        public void start() {
            System.out.println("start");
        }

        @Override
        public void stop() {
            System.out.println("stop");
        }
    }

    public static void operateVehicle(Vehicle vehicle) {
        vehicle.start();

        if (vehicle instanceof Car){ ((Car) vehicle).start();
        vehicle.stop();
        System.out.println("end of ride");
    }
       else if(vehicle instanceof Motorcycle) ((Motorcycle) vehicle).start();
    {
        vehicle.stop();
        System.out.println(" motorcycle cant ride now");
    }
}
   class Television implements ElectronicDevice{

       @Override
       public void TurnOn() {
           System.out.println("Television is on");

       }

       @Override
       public void TurnOff() {
           System.out.println("Television is off");

       }
   }
        public static class Computer implements ElectronicDevice {

            @Override
            public void TurnOn() {
                System.out.println("Computer is on");
            }

            @Override
            public void TurnOff() {
                System.out.println("Computer is off");
            }

        }

        public static void ControlDevices(ElectronicDevice electronicDevice) {
            electronicDevice.TurnOn();

            if (electronicDevice instanceof Computer) {
                ((Computer) electronicDevice).TurnOn();
                System.out.println(" Computer is on");

            } else if ((electronicDevice instanceof Television)) {
                ((Television) electronicDevice).TurnOn();
                electronicDevice.TurnOff();
                System.out.println(" televesion is blockrd for now");
            }
        }
public static class Steak implements Dish{

    @Override
    public void cook() {
        System.out.println( "steak is cooking");

    }
    public void season() {
        System.out.println("Seasoning the Steak");
    }
}
public static class Soup implements Dish{

    @Override
    public void cook() {
        System.out.println("soup is cooking");

    }
    public void addIngredients() {
        System.out.println("Adding ingredients to the Soup");
    }
}
public static void cookDish(Dish dish){
        dish.cook();
        if (dish instanceof Soup) {
            ((Soup) dish).addIngredients();
        }
        if (dish instanceof Steak){
            ((Steak)dish).season();

        }
        System.out.println("dish is prepering");
}
}


