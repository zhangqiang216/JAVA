package zuoye2;

class Hello{

    String title;

    int value;

    public Hello(){

       title += "World";

    }

    public Hello(int value){

       this.value = value;

       title = "Hello";

       Hello();

    }

}