package organs;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Patient patient = new Patient("Aman",32,
        new Eye("Left Eye", "Short Sighted","Blue",true), 
        new Eye("Right Eye", "normal", "green", true),
        new Heart("Heart", "normal"),
        new Stomach("Stomach", "PUD"),
        new Skin("SKin", "Burned", "red", 40));

        System.out.println("Name: "+ patient.getName());
        System.out.println("AGe: "+ patient.getAge());

        Scanner scanner = new Scanner(System.in);

        boolean ShouldFinish = false;
        while(!ShouldFinish){
            System.out.println("choose an organ: "+
            "\n\t 1.Left Eye" +
            "\n\t 2. Right Eye" +
            "\n\t 3. Heart" +
            "\n\t 4. Stomach" +
            "\n\t 5. Skin" +
            "\n\t 6. Quit"
            );
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: patient.getLeftEye().getDetails();
                    if(patient.getLeftEye().isOpen()){
                        System.out.println("\t\t 1. CLose the eye.");
                        if(scanner.nextInt()==1){
                            patient.getLeftEye().close();
                        }
                        else { continue;}
                    }
                    else {
                        System.out.println("\t\t 1. Open the eye.");
                        if(scanner.nextInt()==1){
                            patient.getLeftEye().close();
                        }
                        else { continue;}
                    }
                    break;
                case 2: patient.getRightEye().getDetails();
                    if(patient.getRightEye().isOpen()){
                        System.out.println("\t\t CLose the eye.");
                        if(scanner.nextInt()==1){
                            patient.getRightEye().close();
                        }
                        else { continue;}
                    }
                    else {
                        System.out.println("\t\t Open the eye.");
                        if(scanner.nextInt()==1){
                            patient.getRightEye().close();
                        }
                        else { continue;}
                    }
                    break;
                case 3: patient.getHeart().getDetails();
                    System.out.println("\t\t 1. CHange the heart rate");
                    if(scanner.nextInt()==1){
                        System.out.println("Enter new heart rate: ");
                        int newHeartRate = scanner.nextInt();
                        patient.getHeart().setRate(newHeartRate);
                        System.out.println("Heart rate changed to " + patient.getHeart().getRate());
                    } else {
                        continue;
                    }
                    break;
                    case 4: patient.getStomach().getDetails();
                    System.out.println("\t\t1. Digest");
                    if(scanner.nextInt()==1){
                        patient.getStomach().digest();
                    }else {
                        continue;
                    }
                    break;
                case 5: patient.getSkin().getDetails();
                    break;
                default: ShouldFinish = true;
                    break;
                }
            }
        }


    }
