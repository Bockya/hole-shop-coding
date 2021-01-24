package Employee;

class EmployeeService {
    void add(Employee emp) {
        System.out.println("신규 인사정보를 추가하는 기능 테스트");
        System.out.println(emp.getName());
        System.out.println(emp.getSabun());
        System.out.println(emp.getSsn());
    }

    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();
        Employee newEmp = new Employee("123", "홍길동", "111-222");
        service.add(newEmp);
    }
}
