package login.dataAccess;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class TaskMapperTest {

    @Test
    void calcTime() throws SQLException {
        //Arrange
        TaskMapper task = new TaskMapper();

        //Act
        int result = task.calcTime(1);

        //Assert
        assertEquals(100,result);


    }


    @Test
    void calcPrice() throws SQLException {
        //Arrange
        TaskMapper task = new TaskMapper();

        //Act
        int result = task.calcPrice(1);

        //Assert
        assertEquals(100,result);

    }






}


