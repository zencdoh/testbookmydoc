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
 * Servlet implementation class testbookmydoc
 */
@WebServlet("/testbookmydoc")
public class testbookmydoc extends HttpServlet {
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
		driver.findElement(By.cssSelector("a[href='admin_login.jsp']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("id")).sendKeys("10000");
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("password");
		Thread.sleep(5000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[href='create_doc.jsp']")).click();
		Thread.sleep(5000);
		//driver.get("http://localhost:8080/BookMyDoc/create_doc.jsp");
		driver.findElement(By.name("Create Doctor")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[href='admin_home.jsp']")).click();
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
