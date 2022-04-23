package test.object;

import co.edu.uco.crosscutting.util.object.UtilObject;

public class UtilObjectTest {

    void validateIfObjectIsNotNull(){
        //Arrange

        Object value = null;
        //Act
        UtilObject utilObject;
        boolean result = UtilObject.isNull(value);
        //Assert
        asserTrue(result);
    }

    private void asserTrue(boolean result) {
    }

    void validateIfObjectIsNotNull(){
        //Arrange

        Object value = new Object();
        //Act
        boolean result = UtilObject.isNull(value);
        //Assert
        asserFalse(result);
    }
}
