public class EmployeeWageDayMonth {
        public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;
        public static final int EMP_RATE_PER_HR = 20;
        public static final int NO_OF_WORKING_DAYS = 2;
        public static final int MAX_HRS_IN_MONTH = 10;
        public static void main(String[] args) {
                int empHrs = 0;
                int totalEmpHrs = 0;
                int totalWorkingDays = 0;
                while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NO_OF_WORKING_DAYS) {
                        totalWorkingDays++;
                        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                        switch (empCheck) {
                        case IS_PART_TIME:
                        empHrs = 4;
                        break;
                        case IS_FULL_TIME:
                        empHrs = 8;
                        break;
                        default:
                        empHrs = 0;
                        }
                totalEmpHrs += empHrs;
                System.out.println("Emp Wage Day:" + totalWorkingDays + "Employee Hr:"  + empHrs);
                }
                int totalEmpWage = EMP_RATE_PER_HR * totalEmpHrs;
                System.out.println("Total Employee Wage is:" + totalEmpWage);
        }

}
