class ABC {
  static void Dog() {
    System.out.println("i am from dog method");
    ABC a = new ABC();
    a.cat();
  }

  void cat() {
    System.out.println("i am from cat method");
  }
}

public class First {
  public static void main(String[] args) {
    System.out.println("Hello Java...!");
    First f = new First();
    f.show();

    ABC.Dog();
    // ABC.cat();
  }

  void show() {
    System.out.println("I am form show");
  }
}