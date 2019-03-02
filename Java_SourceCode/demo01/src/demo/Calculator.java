package demo;

public class Calculator{
    int computeN( int totalNum ) {
		 int  s = 0 ;
		 int  n = 1 ;
		 while  ( s < totalNum ) {
			 s += n * ( n + 1 ) ;
			 n = n + 1 ;
		 }
		 return n-2 ;
   }
   public static void main ( String[] args ) {
		Calculator  cal = new Calculator() ;
        int n= cal.computeN( 1000 ) ;
        System.out.println( "n的最大值是：" + n ) ;
    }
}
