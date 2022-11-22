package Test;

import Pages.Drag_Drop_Page;
import org.testng.annotations.Test;

public class Drag_DropTest extends  TestBase{
    public Drag_DropTest(){
        super("https://jqueryui.com/droppable/");
    }

    Drag_Drop_Page dragObject ;

    @Test
    public void DragtTest(){

        dragObject =new Drag_Drop_Page(driver);
        dragObject.dragDrop();
    }

}
