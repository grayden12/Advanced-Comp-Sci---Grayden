public class Student {
    private String name;
    private int age;
    private int grade;
    private String id;
    

    public Student(int age, int grade, String name) {

        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public Student(String name, int grade) {

        this.name = name;
        this.grade = grade;
    }

    public Student(String name) {
        this.name = name;
        
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        if (this.name.equals("John")) {
            this.grade = 10;
        }
        
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    

    public String toString() {
        return "Student: " + age + " years old and in " 
            + grade + " grade, name: " + name;
    }

  

    public boolean equals(Student anotherStudent) {
        if (this.age == anotherStudent.age 
            && this.grade == anotherStudent.grade
            && this.name.equals(anotherStudent.name)) {
            return true;
        } else {
            return false;
        }
    }
    
    public int getRandom(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }

    public String getId() {
        generateId();
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public void generateId() {
        String id = "";
        int x = getRandom(1, 9);
        id = id + x;
        x = getRandom(1, 9);
        id = id + x;
        x = getRandom(1, 9); 
        id = id + x;
        id = id + "-";
        x = getRandom(0, 10); 
        id = id + x;
        x = getRandom(0, 10); 
        id = id + x;
        x = getRandom(0, 10); 
        id = id + x;
        x = getRandom(0, 10); 
        id = id + x;
        this.id = id;


    }

   
}
    

