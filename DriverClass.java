package udayasreeCh_OOPs_Assignment_FoP;

public class DriverClass{
public static void main(String[] Args) {
		
		TechDepartment TD = new TechDepartment();
		AdminDepartment AD = new AdminDepartment();
		HRDepartment HD = new HRDepartment();
		
		System.out.println("Welcome to " + AD.departmentName());
		System.out.println(AD.getTodaysWork());
		System.out.println(AD.getWorkDeadline());
		System.out.println(AD.isTodayAHoliday()+"\n\n");
		
		System.out.println("Welcome to " + HD.departmentName());
		System.out.println(HD.doActivity());
		System.out.println(HD.getTodaysWork());
		System.out.println(HD.getWorkDeadline());
		System.out.println(HD.isTodayAHoliday()+"\n\n");
		
		System.out.println("Welcome to " + TD.departmentName());
		System.out.println(TD.getTodaysWork());
		System.out.println(TD.getWorkDeadline());
		System.out.println(TD.getTechStackInformation());
		System.out.println(HD.isTodayAHoliday()+"\n\n");
}
}