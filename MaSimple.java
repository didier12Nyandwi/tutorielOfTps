public class MaSimple {

	 public static void main(String[] argv){
  (new A()).saluer();
		 desole je viens de faire ça !!!!
    }
}

class A{
    B b = new B();
    void saluer(){
        System.out.println("Bonjour, je suis une instance de A!");
  System.out.println("Je vais appeler une instance de B!");
  b.saluer();
    }
}

class B{
    void saluer(){
        System.out.println("Bonjour, je suis une instance de B!");
    }
}
