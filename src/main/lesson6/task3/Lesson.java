package main.lesson6.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public enum Lesson {
    MATHEMATICS("математика"),
    PHYSICS("физика"),
    PROGRAMMING("программирование"),
    HISTORY("история"),
    BIOLOGY("биология"),
    GEOGRAPHY("география");
    private String lessonName;

    Lesson(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getLessonName() {
        return lessonName;
    }

    public static List<Lesson> generateLesson() {
        List<Lesson> listLesson = new ArrayList<>();
        int lesson = new Random().nextInt(3) + 4;
        for (int i = 0; i < lesson; i++) {
            listLesson.add(values()[new Random().nextInt(values().length)]);
        }
        return listLesson;
    }
}
