package functionalInter;
@FunctionalInterface
public interface ComplexFunInterface extends simpleFunInterface {

  default public void doSomeWork(){
      System.out.println("Hello");
  }
  default public void doSomeWork2(){
        System.out.println("Hello");
  }
}
