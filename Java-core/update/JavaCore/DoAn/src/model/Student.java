package model;

public class Student {
    private String idStudent;
    private String name;
    private int grade;
    private String schoolClass;
    private int year;
    private String address;
    private double mathPoint;
    private double literaturePoint;
    private double englishPoint;
    private double averagePoint;
    private String rate;

    public Student(String idStudent, String name, int grade, String schoolClass, int year, String address, double mathPoint, double literaturePoint, double englishPoint) {
        this.idStudent = idStudent;
        this.name = name;
        this.grade = grade;
        this.schoolClass = schoolClass;
        this.year = year;
        this.address = address;
        this.mathPoint = mathPoint;
        this.literaturePoint = literaturePoint;
        this.englishPoint = englishPoint;
        this.averagePoint = countAveragePoint();
        this.rate = rateStudent(averagePoint);
    }

    public Student(String idStudent, String name, int grade, String schoolClass, int year, String address) {
        this.idStudent = idStudent;
        this.name = name;
        this.grade = grade;
        this.schoolClass = schoolClass;
        this.year = year;
        this.address = address;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(String schoolClass) {
        this.schoolClass = schoolClass;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public void setMathPoint(double mathPoint) {
        this.mathPoint = mathPoint;
    }


    public void setLiteraturePoint(double literaturePoint) {
        this.literaturePoint = literaturePoint;
    }


    public void setEnglishPoint(double englishPoint) {
        this.englishPoint = englishPoint;
    }

    public double getAveragePoint() {
        return averagePoint;
    }

    public String getRate() {
        return rate;
    }

    public Double countAveragePoint() {
        return (englishPoint +mathPoint +literaturePoint) / 3;
    }

    public String rateStudent(double averagePoint) {
        if (averagePoint >= 9) {
            rate = "Xuất sắc";
        } else if (averagePoint >= 8) {
            rate = "Giỏi";
        } else if (averagePoint >= 6.5) {
            rate = "Khá";
        } else if (averagePoint >= 5) {
            rate = "Trung bình";
        } else {
            rate = "Yếu";
        }
        return rate;
    }

    @Override
    public String toString() {
        return "{" +
                "id:" + idStudent  +
                ", name:'" + name +"'"+
                ", schoolClass:'" + schoolClass +"'"+
                ", address:'" + address +"'"+
                ", mathPoints:" + mathPoint +
                ", literPoints:" + literaturePoint +
                ", engPoints:" + englishPoint +
                "},";
    }
    public void showStudentInfomation(){
        System.out.printf("%-10s %-20s %-10s %-10d %-20s %-10.2f %-10.2f %-10.2f %-10.2f %-10s  \n" ,idStudent,name,schoolClass,year,address,mathPoint,literaturePoint,englishPoint,countAveragePoint(),rateStudent(countAveragePoint()));
    }
}

