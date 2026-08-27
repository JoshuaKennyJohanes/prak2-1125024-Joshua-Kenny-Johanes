package praktikum2;

abstract class Hewan{
    private String name;
    private int age;
    private String food;

    public Hewan(String name, int age, String food){
        this.name = name;
        this.age = age;
        this.food = food;
    }
    
    
    String getName(){
        return name;
    }

    int getAge(){
        return age;
    }

    String getFood(){
        return food;
    }

    String setName(String nameBaru){
        return name = nameBaru;
    }

    int setAge(int ageBaru){
        return age = ageBaru;
    }

    String setFood(String foodBaru){
        return food = foodBaru;
    }

    String printData(){
        return "Nama  : " + getName() + "\n" + "Food  : " + getFood() +"\n"+ "Age   : " + getAge();
        
    }

    abstract String printSound();
}


abstract class HewanDarat extends Hewan{
    
    int numberOfLegs;

    public HewanDarat(String name, int age, String food, int numberOfLegs){
        super(name, age, food);
        this.numberOfLegs = numberOfLegs;
    }

    public void Move(){
        System.out.println("Bergerak di darat");
    };

    @Override
    String printData() {
        return super.printData() +"\n" +"Jumlah Kaki    : " + numberOfLegs;
    }
}



class Anjing extends HewanDarat{
    public Anjing(String name, int age, String food, int numberOfLegs){
        super(name, age, food, numberOfLegs);
    }

    @Override
    String printSound() {
        return "Guk Guk";
    }

    @Override
    String printData() {
        
        return "Jenis Hewan: Anjing \n"+super.printData();
    }
    
    
}


class Kucing extends HewanDarat{
    
    public Kucing(String name, int age, String food, int numberOfLegs){
        super(name,age,food,numberOfLegs);
    }

    @Override
    String printSound(){
        return "Meow Meow";
    }

    @Override
    String printData() {
        return "Jenis Hewan: Kucing \n" + super.printData();
    }

    
}

class Tikus extends HewanDarat{
    
    public Tikus(String name, int age, String food, int numberOfLegs){
        super(name, age, food, numberOfLegs);
    }

    @Override
    String printSound() {
        return "Cit Cit";
    }

    @Override
    String printData() {
        return "Jenis Hewan: Tikus \n" + super.printData();
    }

    

    
}
abstract class HewanLaut extends Hewan{
    double depth;
    public HewanLaut(String name, int age, String food, double depth){
        super(name, age, food);
        this.depth = depth;
    }

    @Override
    String printData() {
        return super.printData()+"\n"+"Kedalaman: "+depth;
    }

    
}

class Ikan extends HewanLaut{

    public Ikan(String name, int age, String food, double depth){
        super(name,age,food, depth);
    }

    @Override
    String printSound() {
        return "Blub Blub";
    }

    @Override
    String printData() {
        return "Jenis Hewan: Ikan \n" + super.printData();
    }


}

class Hiu extends HewanLaut{
    public Hiu(String name, int age, String food, double depth){
        super(name, age, food, depth);
    }

    @Override
    String printSound() {
        return "Splash";
    }

    @Override
    String printData() {
        return "Jenis Hewan: Hiu \n"+super.printData();
    }

    
}

class Paus extends HewanLaut{
    public Paus(String name, int age, String food, double depth){
        super(name, age, food, depth);
    }

    @Override
    String printSound() {
        return "Whistle";
    }

    @Override
    String printData() {
        return "Jenis Hewan: Paus \n" + super.printData();
    }

    
}


abstract class HewanUdara extends  Hewan{
    double wingSpan;

    public HewanUdara(String name, int age, String food, double wingSpan){
        super(name, age, food);
        this.wingSpan = wingSpan;
    }

    @Override
    String printData() {
        return super.printData() + "\n"+ "WingSpan: " + wingSpan;
    }

    
}


class Burung extends HewanUdara{
    public Burung(String name, int age, String food, double wingSpan){
        super(name, age, food, wingSpan);
    }

    @Override
    String printSound() {
        return "Cuit Cuit";
    }

    @Override
    String printData() {
        return "Jenis Hewan: Burung \n"+super.printData();
    }

    
}

class Elang extends HewanUdara{
    public Elang(String name, int age, String food, double wingSpan){
        super(name, age, food, wingSpan);
    }

    @Override
    String printSound() {
        return "Kreee";
    }

    @Override
    String printData() {
        return "Jenis Hewan: Elang \n"+super.printData();
    }

    
}
class Bebek extends HewanUdara{
    public Bebek(String name, int age, String food, double wingSpan){
        super(name, age, food, wingSpan);
    }

    @Override
    String printSound() {
        return "Kwek Kwek";
    }

    @Override
    String printData() {
        return "Jenis Hewan: Bebek \n" + super.printData();
    }

    
}
public class AbstractionInheritance {
    public static void main(String[]args){
        Hewan [] daftarHewan = new Hewan[] {
            new Anjing("Doggy", 3, "Tulang", 4),
            new Kucing("Milo", 2, "Ikan", 4),
            new Tikus("Jerry", 1, "Keju", 4),
            new Ikan("Nemo", 1, "Plankton", 15.0),
            new Hiu("Megalo", 10, "Daging", 500.0),
            new Bebek("Donald", 2, "Dedak", 0.8),
            new Paus("Bluey", 20, "Krill", 1000.0),
            new Burung("Pipit", 1, "Biji-bijian", 0.2),
            new Elang("Garuda", 5, "Daging", 2.1),
        };
        for (Hewan h : daftarHewan) {
            System.out.println(h.printData());
            System.out.println("Suara : " + h.printSound());
            System.out.println("----------------------------------------");
        }
    }

}
