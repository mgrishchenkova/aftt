package main.lesson9.task4;

public abstract class Food {
    public int cookingTime;

    public Food(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public int getCookingTime() {
        return cookingTime;
    }
}
