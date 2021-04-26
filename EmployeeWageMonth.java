public class EmployeeWageMonth {
        public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;
        public static final int EMP_RATE_PER_HR = 20;
        public static final int NO_OF_WORKING_DAYS = 2;
        public static void main(String[] args) {
                int empHrs = 0;
                int empWage = 0;
                int totalEmpWage = 0;
            for (int day = 0; day < NO_OF_WORKING_DAYS; day++) {
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
                empWage = EMP_RATE_PER_HR * empHrs;
                totalEmpWage += empWage;
                System.out.println("Employee Wage is:" + empWage);
        }
            System.out.println("Total Employee Wage is:" + totalEmpWage);

        }
}

