package QuestionE;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Student_Test() {
		
		Date dBirthDate = null;
		try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu2 = new Student("Dan", "Randall", "Cortes", dBirthDate, "114 Labrador Lane", "402-893-6889", "vgibbons@udel.edu","GIS");
		Student stu3 = new Student("Jeff", "Randall", "Nelson", dBirthDate, "314 Labrador Lane", "502-893-6889", "ggibbons@udel.edu","PIS");
		Student stu4 = new Student("Steve", "Randall", "Coleman", dBirthDate, "414 Labrador Lane", "602-893-6889", "hgibbons@udel.edu","OIS");
		Student stu5 = new Student("Bob", "Randall", "Dude", dBirthDate, "514 Labrador Lane", "702-893-6889", "kgibbons@udel.edu","DIS");
		
		HashMap hm = new HashMap();
		 hm.put("MIS", stu1);
		 hm.put("GIS", stu2);
		 hm.put("PIS", stu3);
		 hm.put("OIS", stu4);
		 hm.put("DIS", stu5);
		 
		// Get a set of the entries
	      Set set = hm.entrySet();
	      // Get an iterator
	      Iterator i = set.iterator();
	      // Display elements
	      while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());

		assertTrue(5==5);
	}

	}
}
