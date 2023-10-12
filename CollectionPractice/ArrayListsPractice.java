package CollectionPractice;
import java.util.*;

public class ArrayListsPractice extends ArrayList<String>{
        public static void main(String[] args) {
                System.out.println("ARRAY LIST");
                ArrayList<String> cars1 = new ArrayList<String>();
                cars1.add("Skoda");
                cars1.add("Kia");
                cars1.add("Hyundai");
                cars1.add("Honda");
                cars1.add("Nissan");
                // ArrayList name
                System.out.println(cars1);
                // List iterator
                ListIterator<String> cars = cars1.listIterator(cars1.size());

                System.out.println("\n");
                System.out.println("LIST ITERATOR ");
                while (cars.hasPrevious()) {
                        String s = cars.previous();
                        System.out.print(s + "  , ");
                }

                ArrayList<String> cars2 = new ArrayList<String>();
                cars2.add("BMW");
                cars2.add("Benz");
                cars2.add("Jaquar");
                cars2.add("Audi");
                cars2.add("Ferrari");

                // Iterator
                System.out.println("\n");
                System.out.println("ITERATOR");
                Iterator<String> iterator = cars1.iterator();
                while (iterator.hasNext()) {
                        System.out.print(iterator.next() + " , ");
                }

                System.out.println("\n");
                cars1.add("Maruti");
                System.out.println(cars1);

                System.out.println(cars1.addAll(cars2));

                //For Loop
                System.out.println("\n");
                System.out.println("FOR LOOP");
                for (int i=0;i<cars2.size();i++){
                        System.out.println(cars2.get(i));
                }

                // Enhanced for method
                System.out.println("\n");
                System.out.println("ENHANCED FOR LOOP");
                for(String car:cars1)
                        System.out.println(car);
                // System.out.println(cars1);

                ArrayList<String> cars3 = new ArrayList<String>();
                cars3.add("Porsche");
                cars3.add("Bentley");
                cars3.add("Lexus");
                cars3.add("Land Rover");
                cars3.add("Lamborghini");

                System.out.println("\n");
                System.out.println(cars3.get(3));
                cars3.set(3, "Tesla");

                // System.out.println(cars3);

                // For each remaining
                System.out.println("\n");
                System.out.println("FOR EACH REMAINING");
                Iterator<String> itr=cars3.iterator();
                itr.forEachRemaining( car ->{
                        System.out.println(car);
                });       

                System.out.println("\n");
                System.out.println("FOR EACH");
                // Double colon operator
                cars3.forEach(System.out::println);

                Collections.sort(cars1);
                System.out.println("\n");
                System.out.println("SORTED ARRAY-ASCEND: " + cars1);

                Collections.sort(cars1, Collections.reverseOrder());
                System.out.println("\n");
                System.out.println("SORTED ARRAY- DESC:  " + cars1);

                ArrayList<String> cars4 = new ArrayList<String>();
                cars4.add("Renault");
                cars4.add("Mahindra");
                cars4.add("Ford");
                cars4.add("Jeep");
                cars4.add("Tata");
                System.out.println("\n");

                ArrayList<String> cars5 = new ArrayList<String>();
                cars5.add("Fiat");
                cars5.add("Citroen");

                cars4.addAll(cars5);
                System.out.println("Added array List cars4+ cars5: "+cars4);

                System.out.println("CARS 4 - "+cars4);
                cars4.add("Toyota");
                
                System.out.println("Added: "+cars4);
                cars4.remove("Toyota");
                System.out.println("Remove : "+cars4);

                cars4.remove(1);
                System.out.println("Removed at index 1: "+cars4);

                cars4.removeAll(cars5);
                System.out.println("Remove All:" +cars4);

                cars4.add("Datsun");
                System.out.println("Added Datsun: "+cars4);

                cars4.removeIf(str->str.contains("Datsun"));
                System.out.println(cars4);
                // cars4.clear();
                
                cars4.addAll(cars5);
                cars4.addAll(cars3);
                
                ArrayListsPractice carsArray=new ArrayListsPractice();
                carsArray.addAll(cars4);
                System.out.println("3 Groups: "+carsArray);
                System.out.println(carsArray.size());
                carsArray.removeRange(2, 5);
                System.out.println("Removed range: "+carsArray);
                System.out.println("\n");

        // Alternate for removeRange(protected method)
                 // cars4.subList(0, 2).clear();
        
        System.out.println("CARS 4: "+cars4);
        System.out.println( "Porsche index: "+cars4.indexOf("Porsche"));
        // System.out.println(cars4.indexOf('P')); //-1 --------------------------------agrument should be object 
        System.out.println(cars4.contains("Lexus"));

        System.out.println("\n");

        ArrayList<String> itDept=new ArrayList<String>();
        itDept.add("Data Structures");
        itDept.add("Java Programming");
        itDept.add("DBMS");
        itDept.add("Data analytics");
        itDept.add("Big Data");
        System.out.println(itDept);

        ArrayList<String> cseDept=new ArrayList<String>();
        System.out.println("Before insertion: "+cseDept.isEmpty());
        cseDept.add("IoT");
        cseDept.add("Data analytics");
        cseDept.add("DBMS");
        cseDept.add("Operating Systems");
        System.out.println("After adding values: "+cseDept.isEmpty());
        System.out.println(cseDept);
                
        // itDept.retainAll(cseDept);
        cseDept.retainAll(itDept);
        System.out.println("\n");
        System.out.println("After retaining CSE: "+cseDept);
        System.out.println("\n");
        System.out.println("After retaining IT: "+itDept);

        List <Car> carList= new ArrayList<Car>();
        Car c1=new Car("Skoda","Slavia",15_00_000,"Sedan");
        Car c2=new Car("Ferrari ","Roma",3_00_00_000,"Sports");
        Car c3=new Car("Renault","Kiwid",5_00_000,"Hatchback");

        carList.add(c1);
        carList.add(c2);
        carList.add(c3);
        System.out.println("**********CAR LIST**********");
        for(Car c:carList){  
                System.out.println(c.carName+" "+c.modelName+" "+c.price+" "+c.carType);  
            }  
            System.out.print(carList.hashCode());

        }
        

}
class Car{
        String carName="";
        String modelName="";
        int price=0;
        String carType="";
        Car(String name, String model, int cost,String type){
                System.out.println("Car Constructor is invoked");

                this.carName=name;
                this.modelName=model;
                this.price=cost;
                this.carType=type;
        }

}

