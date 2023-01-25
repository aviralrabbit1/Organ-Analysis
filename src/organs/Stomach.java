package organs;

public class Stomach extends Organ {
    private boolean isEmpty;

    public Stomach(String name, String medicalCondition) {
        super(name, medicalCondition);
        this.isEmpty = isEmpty;
    }

    

    @Override
    public void getDetails() {
        super.getDetails();
        if(this.isEmpty){
            System.out.println("Need to eat");
        }
        else {System.out.println("Stomach is full");}
    }

    public void digest() {
        System.out.println("Digest Begins");
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    
    
}
