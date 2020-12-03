package lesson9.task1;

public class Generator {
    private static int roundRobin=0;

   public static Object generate(){
        roundRobin %=4;
        switch (roundRobin++){
            case 0:
                return new Box();
            case 1:
                return new Circle();
            case 2:
                return new Square();
            case 3:
                return new Table();
            default:
                return null;
        }

    }

}
