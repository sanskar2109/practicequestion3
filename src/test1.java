public class test1 {
    public static void main(String[] args) {
        for(int i=0; i<2; i++) {
            String StudentName=args[0];

            int sub1=Integer.parseInt(args[1]);
            int sub2=Integer.parseInt(args[2]);
            int sub3=Integer.parseInt(args[3]);

            try {
                if(sub1<0 || sub1 > 100)
                throw new NumberFormatException("Only Numbers Between 0 to 100 are Allowed");
                if(sub2 < 0 || sub2 > 100)
                throw new NumberFormatException("Only Numbers Between 0 to 100 are Allowed");
                if(sub3 < 0 || sub3 > 100)
                throw new NumberFormatException("Only Numbers Between 0 to 100 are Allowed");
            }
            catch (NumberFormatException obj) {
                System.out.println(obj);
            }
            System.out.println("Name: "+StudentName);
            System.out.println("Marks of subject 1: "+sub1);
            System.out.println("Marks of subject 2: "+sub2);
            System.out.println("Marks of subject 3: "+sub3);
        }
    }
}
class NumberFormatException extends Exception{
    public NumberFormatException(String number) {
        super(number);
    }
}