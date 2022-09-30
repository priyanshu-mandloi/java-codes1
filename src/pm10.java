
                                       // Conditional statements

public class pm10 {
    public static void main(String[] args) {
        int salary=250000;
        if(salary>10000)
        {
            salary+=20000;
        } else if (salary<5000) {
            salary+=6000;
        }else
        {
            salary+=1000;
        }
        System.out.println(salary);
    }

}
