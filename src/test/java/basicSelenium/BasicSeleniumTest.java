package basicSelenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSeleniumTest {

    WebDriver driver;
    //emepzamos las pruebas con las configuraciones del test
    @BeforeEach
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver Windows/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://todo.ly/");

    }
    //salimos de la pagina despues del test
    @AfterEach
    public void cleanup(){
        driver.quit();


    }
    @Test
    public void Test() throws InterruptedException {

        //Ingresar
        driver.findElement(By.xpath("//img[contains(@src,'pagelogin')]")).click();
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail")).sendKeys("deskomunal@gmail.com");
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword")).sendKeys("iver777");
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_ButtonLogin")).click();

        Thread.sleep(1000);

        //Crear Proyecto
        driver.findElement(By.xpath("//td[text()='Add New Project']")).click();
        driver.findElement(By.id("NewProjNameInput")).sendKeys("new");
        driver.findElement(By.id("NewProjNameButton")).click();
        Thread.sleep(1000);

        //crear Tarea
        driver.findElement(By.id("NewItemContentInput")).sendKeys("new");
        driver.findElement(By.id("NewItemAddButton")).click();
        Thread.sleep(3000);

        //actualizar Tarea
        driver.findElement(By.xpath("//img[@class='ItemIndicator']")).click();
        //driver.findElement(By.id("ItemEditTextbox")).sendKeys("nueva tarea");
       // driver.findElement(By.cssSelector(".MainTableRight")).click();
        Thread.sleep(10000);







    }
}
