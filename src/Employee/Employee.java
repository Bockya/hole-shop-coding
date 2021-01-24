package Employee;

class Employee {
    private String sabun; // 사번
    private String name; // 이름
    private String ssn; // 주민번호

    // 생성자
    public Employee(String sabun, String name) {
        this(sabun, name, "unknows");
    }

    public Employee(String sabun, String name, String ssn) {
        this.sabun = sabun;
        this.name = name;
        this.ssn = ssn;
    }
}
