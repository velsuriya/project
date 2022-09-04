package com.testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base1 {

	public static WebDriver driver;

	public static void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void maximize1() {
		driver.manage().window().maximize();
	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public void type(WebElement element, String data) {
		element.sendKeys(data);
	}

	public void click(WebElement element) {
		element.click();
	}

	public void txtClear(WebElement element) {
		element.clear();
	}

	public static void closeWindow() {
		driver.close();
	}

	public static void closeallWindows() {
		driver.quit();
	}

	public WebElement findElementById(String idvalue) {
		WebElement idelement = driver.findElement(By.id(idvalue));
		return idelement;
	}

	public WebElement findElementByName(String namevalue) {
		WebElement nameelement = driver.findElement(By.name(namevalue));
		return nameelement;
	}

	public WebElement findElementByClassName(String classvalue) {
		WebElement classelement = driver.findElement(By.className(classvalue));
		return classelement;
	}

	public WebElement findElementByXpath(String xpath) {
		WebElement xpathelement = driver.findElement(By.xpath(xpath));
		return xpathelement;
	}

	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public String getAttributeValue(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	public String getAttributeValue(WebElement element, String attributename) {
		String attribute = element.getAttribute(attributename);
		return attribute;
	}

	public Object getAttributeJs(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		Object attribute = executor.executeScript("return arguments[0].getAttribute('value')", element);
		return attribute;
	}

	public void moveToElement(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}

	public void toRightClick(WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element).perform();
	}

	public Alert switchToAlert() {
		Alert alert = driver.switchTo().alert();
		return alert;
	}

	public void acceptAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void dismissAlert() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public void handlePromptAlert(String value) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(value);
		alert.accept();
	}

	public void scrollDownJs(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeAsyncScript("arguments[0].scrollIntoView(true)", element);
	}

	public void scrollUpJs(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeAsyncScript("arguments[0].scrollIntoView(false)", element);
	}

	public List<WebElement> getOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}

	public List<WebElement> getAllSelectedOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> alloptions = select.getAllSelectedOptions();
		return alloptions;
	}

	public WebElement getFirstSelectedOptions(WebElement element) {
		Select select = new Select(element);
		WebElement firstselected = select.getFirstSelectedOption();
		return firstselected;
	}

	public void selectByIndex(WebElement element, int year) {
		Select select = new Select(element);
		select.selectByIndex(year);
	}

	public void selectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public void selectByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public void deSelectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}

	public void deSelectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}

	public void deSelectByText(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}

	public void deSelectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}

//	public void dropDown(WebElement element, int value  ) {
//		Select drop = new Select(element);
//		drop.selectByIndex(value);
//	}

	public boolean isMultiple(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}

	public void switchToFrameByidOrname(String idorname) {
		driver.switchTo().frame(idorname);
	}

	public void switchToFrameByElement(WebElement frameelement) {
		driver.switchTo().frame(frameelement);
	}

	public void switchToFrameByindex(int index) {
		driver.switchTo().frame(index);
	}

	public void closeFrames() {
		driver.switchTo().defaultContent();
	}

	public void navigateToBystring(String url) {
		driver.navigate().to(url);
	}

	public void navigatetobyUrl(URL url) {
		driver.navigate().to(url);
	}

	public void toMoveForward() {
		driver.navigate().forward();
	}

	public void toMoveBackward() {
		driver.navigate().back();
	}

	public void toRefresh() {
		driver.navigate().refresh();
	}

	public void switchToWindowByWindowId(String windowid) {
		driver.switchTo().window(windowid);
	}

	public void switchToWindowByTitle(String title) {
		driver.switchTo().window(title);
	}

	public void switchToWindowByUrl(String url) {
		driver.switchTo().window(url);
	}

	public String getParentWindow() {
		String parentid = driver.getWindowHandle();
		return parentid;
	}

	public Set<String> getAllWindows() {
		Set<String> allwindows = driver.getWindowHandles();
		return allwindows;
	}

	public void dragAndDrop(WebElement source, WebElement target) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).perform();
	}

	public void doubleClick(WebElement element) {
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();
	}

	public List<WebElement> findAllElementsById(String value) {
		List<WebElement> allElements = driver.findElements(By.id(value));
		return allElements;
	}

	public List<WebElement> findAllElementsByName(String value) {
		List<WebElement> allElements = driver.findElements(By.name(value));
		return allElements;
	}

	public List<WebElement> findAllElementsByClassName(String value) {
		List<WebElement> allElements = driver.findElements(By.className(value));
		return allElements;
	}

	public List<WebElement> findAllElementsByXpath(String xpath) {
		List<WebElement> allElements = driver.findElements(By.xpath(xpath));
		return allElements;
	}

	public void TempSleep(long seconds) throws InterruptedException {
		Thread.sleep(seconds);
	}

	public static void implicitWait(long sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	public void getScreenShot(String filename) throws IOException {
		TakesScreenshot sc = (TakesScreenshot) driver;
		File screenshotAs = sc.getScreenshotAs(OutputType.FILE);
		File file = new File(filename);
		FileHandler.copy(screenshotAs, file);
	}

	public void tabKeyPress() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
	}

	// Get data from the sheet

	public String getData(String sheetname, int rownum, int cellnum) throws IOException {

		String res = null;
		File file = new File("C:\\Users\\ELCOT\\Eclipse\\Framework\\Excel Folder\\Book1.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType type = cell.getCellType();

		switch (type) {

		case STRING:
			res = cell.getStringCellValue();
			break;
		case NUMERIC:

			if (DateUtil.isCellDateFormatted(cell)) {

				Date dateValue = cell.getDateCellValue();
				SimpleDateFormat simpleformat = new SimpleDateFormat("dd/MM/yyyy");
				res = simpleformat.format(dateValue);
			} else {
				double cellValue = cell.getNumericCellValue();
				BigDecimal decimal = BigDecimal.valueOf(cellValue);
				res = decimal.toString();
			}
			break;
		default:
			break;
		}

		return res;

	}

	// Modify data

	public void modifyData(String sheetname, int rownum, int cellnum, String olddata, String newdata)
			throws IOException {

		File file = new File("C:\\Users\\ELCOT\\Eclipse\\Framework\\Excel Folder\\Book1.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);

		String Value = cell.getStringCellValue();
		if (Value.equals(olddata)) {
			cell.setCellValue(newdata);
		}

		FileOutputStream output = new FileOutputStream(file);
		workbook.write(output);
	}

	// Insert value in cell

	public void insertValueInCell(String sheetname, int rownum, int cellnum, String data) throws IOException {

		File file = new File("C:\\Users\\ELCOT\\Eclipse\\Framework\\Excel Folder\\Book1.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.createCell(cellnum);
		cell.setCellValue(data);

		FileOutputStream output = new FileOutputStream(file);
		workbook.write(output);

	}

	// Get Inserted value from cell

	public void getinsertValueInCell(WebElement element, String sheetname, int rownum, int cellnum) throws IOException {

		File file = new File("C:\\Users\\ELCOT\\Eclipse\\Framework\\Excel Folder\\Book1.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.createCell(cellnum);
		String value = element.getAttribute("value");
		cell.setCellValue(value);

		FileOutputStream output = new FileOutputStream(file);
		workbook.write(output);

	}
}
