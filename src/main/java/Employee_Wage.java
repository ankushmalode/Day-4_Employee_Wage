public class Employee_Wage {
    public static void main(String[] args){
        int min=0, max=2, rate=20, empHrs=0, totalSalary=0, count=0;
        for (int i=1; i<=20; i++) {
            int check = (int)(Math.random()*(max-min+1)+min);
            if (empHrs<=100) {
                switch (check) {
                    case 1:
                        empHrs= empHrs+8;
                        break;
                    case 2:
                        empHrs=empHrs+4;
                        break;
                    default:
                        empHrs=empHrs+0;
                }
            }
                count = count+1;
        }
        System.out.println("Employee total working hour: "+empHrs);
        System.out.println("Employee total working days: "+count);

        int salary= empHrs*rate;
        totalSalary= salary+totalSalary;
        System.out.print("\nTotal salary is "+ totalSalary);
    }
}
