import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa)
	{
		super();
		this.id=id;
		this.fname=fname;
		this.cgpa=cgpa;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	
}



public class HackerRankSort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		List<Student> studentList = new ArrayList<Student>();
		while(n>0)
		{
			int id=scan.nextInt();
			String fname=scan.next();
			double cgpa=scan.nextDouble();
			Student s = new Student(id, fname, cgpa);
			studentList.add(s);
			n--;
		}
		
		Collections.sort(studentList, new Comparator<Student>(){
			public int compare(Student s1, Student s2)
			{
				if(s2.getCgpa()>s1.getCgpa())
				{
					return 1;
				}
				else if(s2.getCgpa()<s1.getCgpa())
				{
					return -1;
				}
				return s1.getFname().compareTo(s2.getFname());
			}
		});
		
		for(Student s : studentList)
		{
			System.out.println(s.getFname());
		}
	}
}
