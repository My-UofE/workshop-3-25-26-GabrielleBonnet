public class NumbersInSpanish {
    public static void main(String[] args) {
       // read the first argument passed to the program
       int number = Integer.parseInt(args[0]); 
       switch(number) {
        case 1:
            System.out.println("uno"); break;
        case 2:
            System.out.println("dos"); break;
        case 3:
            System.out.println("tres"); break;
        case 4:
            System.out.println("cuatro"); break;
        case 5:
            System.out.println("cinco"); break;
        default: System.out.println("Sorry I do not know that!");
       }
       }
 }

 // If the break is there, only the number is printed. If the break is not there
 // the number prints and the "Sorry I do not know that!" message also prints.