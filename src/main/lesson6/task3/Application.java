package main.lesson6.task3;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Application {
    public static void main(String[] args) {
        Scholar scholar = new Scholar();
        Map<DayOfWeek, List<Lesson>> diary = new TreeMap<>();
        for (DayOfWeek day : DayOfWeek.values()) {
            diary.put(day, Lesson.generateLesson());
        }
        scholar.setDiary(diary);

        for (Map.Entry<DayOfWeek, List<Lesson>> dayEntry : scholar.getDiary().entrySet()) {
            StringBuilder format = new StringBuilder();
            format.append(dayEntry.getKey().getDay()).append(":");
            for (Lesson lesson : dayEntry.getValue()) {
                format.append(", ").append(lesson.getLessonName());
            }
            String formattedString = format.toString().replaceFirst(",", "");
            System.out.println(formattedString);
        }

        Map<Lesson, Integer> countLesson = new TreeMap<>();
        for (Lesson lesson : Lesson.values())
            countLesson.put(lesson, 0);
        for (List<Lesson> lessons : scholar.getDiary().values()) {
            for (Lesson lesson : lessons) {
                countLesson.put(lesson, countLesson.get(lesson) + 1);
            }
        }

        countLesson.entrySet().stream().
                sorted(Map.Entry.<Lesson, Integer>comparingByValue().
                        reversed()).forEach(System.out::println);


    }
}
