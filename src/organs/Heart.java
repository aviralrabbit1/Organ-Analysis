package organs;

public class Heart extends Organ {
    public int rate;

    public Heart(String name, String medicalCondition) {
        super(name, medicalCondition);
        this.rate = rate;
    }

    

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Heart Rate : " + this.getRate());
    }



    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
    

    

    
    
}
