package org.base;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	//private static final Object userName = null;
	public static WebDriver driver;
	//1
	public static void browserLaunch(String url) {
		
		WebDriverManager.chromedriver().setup();
		//***
		ChromeOptions o = new ChromeOptions();
		o.addArguments("--remote-allow-origins=*");
		//***
		 driver = new ChromeDriver(o);
		driver.get(url);
		driver.manage().window().maximize();
		
	}
		//2
		public WebElement findElementId(String id) {
			
			
			WebElement elementId = driver.findElement(By.id(id));
			return elementId;

		}
		//3
		public WebElement findElementName(String name) {
			
			WebElement elementName = driver.findElement(By.name(name));
			return elementName;

		}
		
		//4
		public void sendValues(WebElement webElement,String data) {
			webElement.sendKeys(data);

		}
		//5
		public void clickBtn(WebElement element) {
			element.click();
			
			
			
		}
		
		public void closeBtn() {
			driver.close();
		}
		
		//6
		public WebElement findElementXpath(String xpath) {
			WebElement elementXpath = driver.findElement(By.xpath(xpath));
			return elementXpath;
		
			
		}
		
		//7
	    public void goToElement(WebElement element) {
	    	Actions action = new Actions(driver);
	    	action.moveToElement(element).perform();
	    }
	    //8
	    public void dragDropAction(WebElement element, WebElement element1 ) {
	    	
	    	Actions action = new Actions(driver);
	    	action.dragAndDrop(element, element1).perform();

		}
	    //9
	  public void doubleClickAction(WebElement element) {
		  Actions action = new Actions(driver);
		  action.doubleClick(element).perform();
	 }
	  
	  //10
	  public void rightClick(WebElement element) {
		  
		  Actions action = new Actions(driver);
		  action.contextClick(element).perform();

	}
	  //11
	  public void navigateTo(String url) {
		  driver.navigate().to(url);

	}
	  //12
	  public void backNavigate(WebElement element) {
		  driver.navigate().back();
	  }
	  //13
	  public void forwardNavigate(WebElement element) {
		driver.navigate().forward();

	}
	  
	  //14
	  public void refreshButton(WebElement element) {
		  
		  driver.navigate().refresh();

	}
	  //15
	  public void pressReleaseKey(WebElement element) throws AWTException {
		  
		  Robot robot = new Robot();
		  for (int i = 1; i <=3; i++) {
			  robot.keyPress(KeyEvent.VK_TAB);
			  robot.keyRelease(KeyEvent.VK_TAB);
			  robot.keyPress(KeyEvent.VK_SHIFT);
			  robot.keyPress(KeyEvent.VK_A);
			  robot.keyRelease(KeyEvent.VK_A);
			  robot.keyRelease(KeyEvent.VK_SHIFT);
			  
			  
			 }
		  
		  
	  }
		  
		  //16
		  public void chooseByIndex( WebElement element,int element1) {
			
			Select select =new Select(element);
			select.selectByIndex(element1);
			
		}
		  //17
		  public void chooseByValue(WebElement element,String element1) {
			  Select select =new Select(element);
				select.selectByValue(element1);
		}
		  //18
		public void getByOptions(WebElement element,Object element1) {
			Select select = new Select(element);
			List<WebElement> options = select.getOptions();
			int size = options.size();
			System.out.println(size);
			for (int i = 0; i < options.size(); i++) {
				String text = options.get(i).getText();
				System.out.println(text);
				
			}

		}
		//19
		public void getAllBySelectedOptions(WebElement element1,Object element2) {
			Select select = new Select(element1);
			List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
			int i = allSelectedOptions.size();
			System.out.println(i);
			for (int j = 0; j <allSelectedOptions.size() ; j++) {
				String text1 = allSelectedOptions.get(j).getText();
				System.out.println(text1);
				
			}
			
			
			

		}
		//20
		
		public void unSelectByndex(WebElement element,int element1) {
			Select select =new Select(element);
			select.deselectByIndex(element1);
			

		}
		
		//21
		
		public void isMultiples(WebElement element, WebElement element1 ) {
			
			Select select = new Select(element);
			boolean multiple = select.isMultiple();
			System.out.println(multiple);	

		}
		  
		//22
		public void unSelectByValue(WebElement element,String element1) throws InterruptedException {
			Select select =new Select(element);
			select.deselectByValue(element1);
		     Thread.sleep(3000);
			
}
		  
		//23
		public void executorScript( WebElement element, String data ) {
			JavascriptExecutor executor =(JavascriptExecutor)driver;
			executor.executeScript("arguments[0].setAttribute('value','anand@gmail.com')",element);
             
		}
		
		//24
		public void switchFrame(String data) {
          driver.switchTo().frame(data);
          
		}
		//25
		public void defaultFrame(String data) {
			driver.switchTo().defaultContent();
		}
		
		//26
		public void screenShotAs(String pathName ) throws IOException {
			
			TakesScreenshot ts= (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File destination= new File(pathName);
			FileUtils.copyFile(src,destination);
			
		}
		
		//27
		public WebElement findByClassName(String className) {
					
	    WebElement elementClass = driver.findElement(By.className(className));
		return elementClass;  
				}
		
		//28
		
		
	public void byTagName(String tagName) {
		List<WebElement> findElements = driver.findElements(By.tagName(tagName));
		System.out.println(findElements.size());
	}
			
		//29
	
	public void acceptAlert(WebElement element) {
		driver.switchTo().alert().accept();
	
	}
	
	//30
	
	public void declineAlert(WebElement element) {
		driver.switchTo().alert().dismiss();
	}
	
	//31
	public void textAlert(WebElement element, String keysToSend) {
		driver.switchTo().alert().sendKeys(keysToSend);
		

	}
	
	
 //32
 
 public void nextIntMethod( int element1) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter your id");
	int nextInt = s.nextInt();
	
	
}
 
 //33
 public void nextByteMethod(int element) {
	 Scanner s = new Scanner(System.in);
		System.out.println("Enter your age");
		byte nextByte = s.nextByte();
		

}
 
 //34
 public void nextBooleanMethod(String text) {
	 Scanner s = new Scanner(System.in);
		//System.out.println("roses are red");
		boolean nextBoolean = s.nextBoolean();
		System.out.println(nextBoolean);

}
 
 //35
 
 public boolean stringEquals(String data, String data1) {
	
	 String s =data;
	 String s1 =data1;
	 boolean equals = s.equals(s1);
     System.out.println(equals);
	 return equals;
}
 
 //36
 
 public int stringLength(String data) {
	String s=data;
	int length = s.length();
	System.out.println(length);
	return length;
	
}
 
 //37
 
 public void toUpperCaseMethod(String data) {
	String s = data;
	String upperCase = s.toUpperCase();
	System.out.println(upperCase);

}
 //38
 public void toLowerCaseMethod(String data) {
	 
	 String s = data;
	 String lowerCase = s.toLowerCase();
	 System.out.println(lowerCase);
	

}
 //39
 
 public void firstIndexOf(String data, char data1) {
	 
	 String s = data;
	 int indexOf = s.indexOf(data1);
	 System.out.println(indexOf);
}

 
 //40
 
 public void lastIndex(String data, char data1) {
	 
	 String s = data;
	 int lastIndexOf = s.lastIndexOf(data1);
	 System.out.println(lastIndexOf);

}
 //41
 
 public void charAtMethod(String data, int data1) {
	 
	 String s = data;
	 char charAt = s.charAt(data1);
	  System.out.println(charAt);
}
 
 //42
 
 public void equalsIgnore(String data, String data1) {
	String s = data;
	String s1 = data1;
	boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
	System.out.println(equalsIgnoreCase);
}

 
 //43
 public void containsCase(String data, String data1) {
	
	 String s = data;
	 boolean contains = s.contains(data1);
     System.out.println(contains);
}
 
 //44
 
 public void rePlaceBy(String data,String data1,String data2) {
	 
	 String s=data;
	 String replace = s.replace(data1, data2);
	 System.out.println(replace);
	

}
 
 //45
 
 public void beginsWith(String data, String data1) {
	
	String s=data;
	boolean startsWith = s.startsWith(data1);
	System.out.println(startsWith);
	

}
 //46
 public void EndsWithMethod(String data, String data1) {
		
		String s=data;
		boolean endsWith = s.endsWith(data1);
		System.out.println(endsWith);
		

	}
 //47
 public void isEmptyMethod(String data) {
	String s  =data;	
boolean empty = s.isEmpty();
System.out.println(empty);
}
	
 
 //48
 public void subStringMethod(String data, int data1, int data2) {
	 String s=data;
	 String substring = s.substring(data1,data2);
	 System.out.println(substring);
	
}
 //49
 
 public void trimMethod(String data) {
	String s = data;
	String trim = s.trim();
    System.out.println(trim);
	
 }}
// //50
// 
// public String getDataFromExcel(String pathName, String sheetName, int rowNo , int CellNo) throws IOException {
//	 String cellData=null;
//	 File file = new File(pathName);
//	 FileInputStream inputStream = new FileInputStream(file);
//	 
//	 Workbook workbook = new XSSFWorkbook(inputStream);
//	 
//	 Sheet sheet = workbook.getSheet(sheetName);
//	  Row row = sheet.getRow(rowNo);
//	  Cell cell = row.getCell(CellNo);
//	  
//	  int cellType = cell.getCellType();
//	  
//	  if (cellType==1) {
//		 cellData = cell.getStringCellValue();
//		
//	}
//	  
//	 if (cellType==0) {
//		 
//		 if (DateUtil.isCellDateFormatted(cell)) {
//			 Date dateCellValue = cell.getDateCellValue();
//			 SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
//			  cellData = dateFormat.format(dateCellValue);
//			
//		}
//		 else {
//			double numericCellValue = cell.getNumericCellValue();
//			long l = (long)numericCellValue;
//			 cellData = String.valueOf(1);
//		}
//		
//	} 
//	  
//	 
//	return cellData; 
//	  
// }
//
//	  
//	  
//	//51
//	
//	 public String writeinExcel(String pathName, String sheetName, int rowNo , int CellNo,String data) throws IOException {
//	  
//	 File file =new File(pathName);
//	 
//	 
//	 Workbook workbook= new XSSFWorkbook();
//	 
//	 Sheet sheet = workbook.createSheet();
//	 
//	 Row createRow = sheet.createRow(rowNo);
//	 
//	 Cell createCell = createRow.createCell(CellNo);
//	 
//	 
//	 createCell.setCellValue(data);
//	 
//	  FileOutputStream outputStream= new  FileOutputStream(file);
//	   workbook.write(outputStream);
//	   
//	   System.out.println("excel write completed");
//	return data;
//	  
//	  
//}
//	 
//	 
//	 //52
//	 
//	 public String excelUpdateMethod(String pathName, String sheetName, int rowNo, int cellNo, String data, String data1) throws IOException {
//		
//         File file = new File(pathName);
//         
//         FileInputStream inputStream = new FileInputStream(file);
//         
//         Workbook workbook = new XSSFWorkbook(inputStream);
//         
//         Sheet sheet = workbook.getSheet(sheetName);
//         System.out.println(sheet.getPhysicalNumberOfRows());
//         
//         Row row = sheet.getRow(rowNo);
//         System.out.println(row.getPhysicalNumberOfCells());
//         
//         Cell cell = row.getCell(cellNo);
//         
//         int cellType = cell.getCellType();
//         
//        
//        String cellValue = cell.getStringCellValue();
//        
//        if (cellValue.equals(data)) {
//        	cell.setCellValue(data1);
//        
//		}
//        FileOutputStream outputStream= new  FileOutputStream(file);
// 	     workbook.write(outputStream);
// 	     
// 	     System.out.println("Excel update completed");
//		return cellValue;
//            
//	}
//	 
//	 
//	 //53
//	 
//	 public void windowHandlingMethod() {
//		String windowHandle = driver.getWindowHandle();
//		System.out.println(windowHandle);
//
//	}
// 
// //54
// public void multipleWindowHandles() {
//	 Set<String> allWindows = driver.getWindowHandles();
//	 System.out.println(allWindows);
//	
//
//}
// 
////55
//public void addMethod(Object data2,Object data3,String data4) {
//	List li=new ArrayList();
//   li.add(data2);
//   li.add(data3);
//   li.add(data4);
//	System.out.println(li);
//	
//}
//
//
////56
//
//public void getSizeMethod(Object data2,Object data3,String data4) {
//	List li=new ArrayList();
//	 li.add(data2);
//	   li.add(data3);
//	   li.add(data4);
//	int size = li.size();
//	System.out.println(size);
//}
// 
// //57
//
//public void getByIndex(Object data2,Object data3,String data4 ,int data5) {
//	List li=new ArrayList();
//	 li.add(data2);
//	   li.add(data3);
//	   li.add(data4);
//	
//Object object = li.get(data5);
//System.out.println(object);
//}
// 
// //58
//
//public void replaceByIndex(Object data2,Object data3,int i ,int data5, String data6) {
//	List li=new ArrayList();
//	 li.add(data2);
//	   li.add(data3);
//	   li.add(i);
//	   
//	   li.set(data5, data6);
//	   System.out.println(li);
//}
//
////59
//
//public void indexPositionOfValue(Object data2,Object data3,String data4 ,int data5) {
//	List li=new ArrayList();
//	 li.add(data2);
//	   li.add(data3);
//	   li.add(data4);
//	   
//	   int indexOf = li.indexOf(data5);
//	   System.out.println(indexOf);
//}
//	   //60
//	   
//	   
//	   public void lastIndexOfMethod(Object data2,Object data3,String data4 ,int data5,Object data6) {
//		
//		   List li=new ArrayList();
//			 li.add(data2);
//			   li.add(data3);
//			   li.add(data4);
//			   li.add(data5);
//			   li.add(data6);
//			   int lastIndexOf = li.lastIndexOf(data6);
//			   System.out.println(lastIndexOf);
//			   
//			   
//			   }
//	   
//	   
//	 //61
//		
////		public String getTexMethod(WebElement element ,String data) {
////			WebElement text111 = driver.findElement(By.partialLinkText(data));
////			String text2 = text111.getText();
////	           System.out.println(text2);
////	           return text2;
//	//}
//	   
//	   	   
//	
//	
//}
// 
 
 
 
 
		
		
		




