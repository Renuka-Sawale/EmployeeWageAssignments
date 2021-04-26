public class DailyEmpCalculate {
        public static void main(String[] args) {
                //Constants
                int IS_FULL_TIME = 1;
                int EMP_RATE_PER_HR = 20;
                double empCheck=Math.floor(Math.random() * 10) % 2;
                int empHrs;
                if(empCheck == IS_FULL_TIME) {
                        empHrs=8;
    	        }
                else {
                        empHrs=0;
                }
                int salary = EMP_RATE_PER_HR*empHrs;
                System.out.println("Daily Employee Wage Calculation is:" + salary);
        }

}

