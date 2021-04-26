public class partTimeEmployee {
        public static void main(String[] args) {
                //Constants
                int IS_PART_TIME = 1;
                int IS_FULL_TIME = 2;
                int EMP_RATE_PER_HR = 20;
                //variables
                int empHrs = 0;
                int empWage = 0;
                double empCheck=Math.floor(Math.random() * 10) % 3;
                if (empCheck == IS_PART_TIME) {
                        empHrs = 4;
            }
                else if (empCheck == IS_FULL_TIME)
                        empHrs = 8;
                else
                        empHrs = 0;
                empWage = EMP_RATE_PER_HR * empHrs;
                System.out.println("Part time employee Wage is:" + empWage);
	}
}
