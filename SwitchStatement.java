public class SwitchStatement {

    
    public static void main(String[] args) {
        int marks = 90;
        //short,int,charor byte
        switch(marks){
            case 90:
                System.out.println("very Good");
                break;
            case 60:
                System.out.println("Good");
                break;
            case 40:
                System.out.println("OK");
                break;
            default:
                System.out.println("The mark is not defined   ");
        }
    }
    
}