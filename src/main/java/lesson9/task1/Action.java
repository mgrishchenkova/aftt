package lesson9.task1;

public class Action {

    public static void action(Object object){
        if (object instanceof Drawable) {
            Drawable drawable = (Drawable) object;
            drawable.draw();
        }
        if (object instanceof Movable) {
            Movable movable = (Movable) object;
            movable.move();
        }
    }
}