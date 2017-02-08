package testbookmydoc;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Servlet implementation class test_patient_reg
 */
@WebServlet("/test_patient_reg")
public class test_patient_reg extends HttpServlet {
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		WebDriver driver = new FirefoxDriver();
		try {
			//Thread.sleep(5000);
			//driver.get("http://10.44.120.71:8080/BookMyDoc/");
			driver.get("http://localhost:8080/BookMyDoc/");
			Thread.sleep(5000);
			driver.findElement(By.cssSelector("a[href='pat_register.jsp']")).click();
			//driver.get("http://localhost:8080/BookMyDoc/pat_register.jsp");
			Thread.sleep(5000);
			driver.findElement(By.name("name")).sendKeys("patient100");
			Thread.sleep(5000);
			driver.findElement(By.name("password")).sendKeys("password");
			Thread.sleep(5000);
			driver.findElement(By.name("age")).sendKeys("20");
			Thread.sleep(5000);
			driver.findElement(By.name("register")).click();
			System.out.println("*********");
			Thread.sleep(5000);
			System.out.println("*********");
			driver.findElement(By.name("password")).sendKeys("password");
			Thread.sleep(5000);
			driver.findElement(By.name("login")).click();
			Thread.sleep(5000);
			driver.findElement(By.cssSelector("a[href='logout.jsp']")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("login")).click();
			Thread.sleep(5000);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
