package zuoye2;

public class Example{

    int booth;

    String snooth;

    public Example(){

       this("snoothchy");

       System.out.print("first ");

    }

    public Example(String snooth){

       this(420,"snoothchy");

       System.out.print("second ");

    }

    public Example(int booth, String snooth){

       this.booth = booth;

       this.snooth = snooth;

       System.out.print("third ");

    }

    public static void main(String args[]){

       Example b = new Example();

       System.out.print(b.snooth+" "+b.booth);

    }

   

}