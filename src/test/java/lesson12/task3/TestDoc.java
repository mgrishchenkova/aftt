package lesson12.task3;

import lesson12.task3.project.Permission;
import lesson12.task3.project.Project;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;

public class TestDoc {
    private final String PATH = "src/main/java/lesson12/task3/project.json";

    @Test
    @DisplayName("�������� ������������ ����������� ��������� ������� project")
    void testProjectDeserialization() throws IOException {
        FileHelper<Project> helper = new FileHelper<>();
        Project project = helper.getObjectFromJsonInFile(PATH, Project.class);

        Project expectedParentProject = new Project()
                .setId(19).setStartDate("2020-05-14").setEndDate("2021-10-01")
                .setName("automation")
                .setChildIds(Arrays.asList(154, 157, 192, 198))
                .setPermissions(Arrays.asList(
                        new Permission().setId(17).setName("���������� ������"),
                        new Permission().setId(18).setName("�������� ������"),
                        new Permission().setId(19).setName("�������� ������")
                ));
        Project expectedProject = new Project()
                .setId(154).setStartDate("2020-07-14").setEndDate("2020-10-01")
                .setName("automation_current")
                .setChildIds(Arrays.asList(157, 192, 198))
                .setPermissions(Arrays.asList(
                        new Permission().setId(17).setName("���������� ������"),
                        new Permission().setId(18).setName("�������� ������"),
                        new Permission().setId(19).setName("�������� ������")
                ))
                .setParentProject(expectedParentProject);

        Assertions.assertEquals(expectedParentProject, project.getParentProject());
        Assertions.assertEquals(expectedProject, project);
    }
}
