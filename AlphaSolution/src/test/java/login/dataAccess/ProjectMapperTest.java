package login.dataAccess;

import login.model.Project;
import login.model.User;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ProjectMapperTest {




    @Test
    void findProject() throws SQLException {

        //Arrange
        ProjectMapper project = new ProjectMapper();

        //Act
        String name = project.findProject(1);
        String name1 = "alpha";

        //Assert
        assertEquals(name,name1);
    }
}

