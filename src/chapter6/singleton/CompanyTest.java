package chapter6.singleton;

public class CompanyTest {
    public static void main(String[] args) {
//        Company company = new Company(); // 오류 발생

        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        System.out.println(company1);
        System.out.println(company2);
    }
}
