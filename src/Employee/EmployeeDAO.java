package Employee;

class EmployeeDAO {
    private Employee[] arr = new Employee[100];
    private int idx = 0;

    boolean addNewEmployee(Employee newEmp) {
        boolean result = true;
        // 배열에 모든 데이터가 차면 99번까지 데이터가 꽉 찬 상태
        // 들어갈 수 없으면 false 반환
        if (idx >= arr.length - 1)
            return false;
        arr[idx] = newEmp;
        idx++;
//        System.out.println("디버그 : DAO 처리 결과" + result);
        return result;
    }
}
