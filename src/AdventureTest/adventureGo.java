package AdventureTest;

public class adventureGo {
  void go () {
    adventureHelloWorld Hello = new adventureHelloWorld();
    Hello.setHelloWorld("Hello World");
    System.out.println(Hello.getHelloWorld());
  }
  public static void main(String[] args) {
    new adventureGo().go();
  }
}
