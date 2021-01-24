package Employee;

import java.util.Scanner;

class EmployeeUI {
    private Scanner scanner = new Scanner(System.in);
    private EmployeeService service = new EmployeeService();

    String getString(String msg){
        System.out.println(msg);
        return scanner.nextLine();
    }

    void regist() {
        System.out.println("신규 인사정보를 등록합니다.");
        String name = getString("이름을 입력하세요.");
        String sabun = getString("사번을 입력하세요.");
        String ssn = getString("주민번호를 입력하세요.");
        System.out.println("입력한 정보는 다음과 같습니다.");
        System.out.println(name + " " + sabun + " " + ssn);

        Employee emp = new Employee(sabun, name, ssn);
        boolean addResult = service.add(emp);
        System.out.println("서비스에서 처리된 결과:" + addResult);
    }

    public static void main(String[] args) {
        EmployeeUI ui = new EmployeeUI();
        ui.regist();
    }
}
