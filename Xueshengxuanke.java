package system;

public class Xueshengxuanke {
	    public static void main(String[] args) {
	        System.out.println("******************学生信息*********************");
	        Student xm = new Student();
	        xm.setName("刘吉吉");
	        xm.setAge(20);
	        xm.setNumber(201938250);
	        xm.setSex("女");
	        System.out.println("学生姓名:" + xm.getName());
	        System.out.println("学生年龄:" + xm.getAge());
	        System.out.println("学生编号:" + xm.getNumber());
	        System.out.println("学生性别:" + xm.getSex());

	        System.out.println("******************教师信息*********************");
	        Teacher cdm = new Teacher();
	        cdm.setName("灭绝师太");
	        cdm.setAge(18);
	        cdm.setNumber(200000000);
	        cdm.setSex("女");
	        cdm.setLesson_1("体育");
	        System.out.println("授课教师:" + cdm.getName());
	        System.out.println("教师年龄:" + cdm.getAge());
	        System.out.println("教师编号:" + cdm.getNumber());
	        System.out.println("教师性别:" + cdm.getSex());

	        System.out.println("******************课程信息*********************");
	        Lesson_1 xxds = new Lesson_1();
	        xxds.setName("体育");
	        xxds.setTime("每周五 晚上7:00-9:40");
	        xxds.setNumber(12138);
	        xxds.setPlace("体育馆");
	        System.out.println(xxds.toString());

	        System.out.println("******************课程详情*********************");
	        System.out.println("选课成功");

	    }

	}


	class People{
	    public People(){

	    }
	    public People(String name,int age,int number,String sex){
	        this.name = name;
	        this.age = age;
	        this.number = number;
	        this.sex = sex;
	    }

	    private String name;
	    private int age;
	    private int number;
	    private String sex;

	    public String getName() {
	        return name;
	    }
	    public int getAge() {
	        return age;
	    }
	    public String getSex() {
	        return sex;
	    }
	    public int getNumber() {
	        return number;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public void setAge(int age) {
	            this.age = age;
	    }
	    public void setNumber(int number) {
	        this.number = number;
	    }
	    public void setSex(String sex) {
	        this.sex = sex;
	    }

	}

	class Student extends People{
	    public Student(){

	    }
	    public Student(String name,int age,int number,String sex){
	        super(name, age, number, sex);
	    }
	}

	class Teacher extends People{
	    public Teacher(){

	    }
	    public Teacher(String name,int age,int number,String sex){
	        super(name, age, number, sex);
	    }
	    String lesson_1;
	    public String getLesson_1() {
	        return lesson_1;
	    }
	    public void setLesson_1(String lesson_1) {
	        this.lesson_1 = lesson_1;
	    }


	}


	class Lesson{
	    public Lesson(){

	    }
	    public Lesson(String name,String time,int number,String place){
	        this.name = name;
	        this.time = time;
	        this.number = number;
	        this.place = place;
	    }

	    private String name;
	    private String time;
	    private int number;
	    private String place;


	    public String getName() {
	        return name;
	    }
	    public String getTime() {
	        return time;
	    }

	    public String getPlace() {
	        return place;
	    }
	    public int getNumber() {
	        return number;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public void setTime(String time) {
	        this.time = time;
	    }
	    public void setNumber(int number) {
	        this.number = number;
	    }
	    public void setPlace(String place) {
	        this.place = place;
	    }

	}


	class Lesson_1 extends Lesson{
	    public Lesson_1(){

	    }
	    public Lesson_1(String name,String time,int number,String place){
	        super(name, time, number, place);
	    }
	    public String toString() {
	        return "课程名称：" + getName()+ "\n" + "上课时间：" + getTime() + "\n" + "课程编号：" + getNumber()+ "\n" + "授课地点：" + getPlace()+ "\n";
	    }
	}

