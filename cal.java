package SIMPLILEARN.assignmentsSelflearningVideo.ArithematicCalculator;

public class cal {

    double a;
    double b;

    static double result;  //Making result variable as static,because i need to use result variable of cal class in main class before creating object of cal class
    public cal(double a, double b){

        this.a = a;
        this.b = b;

    }

    public void addition(){

        this.result = a + b;
        System.out.println(result);
    }

    public void subtraction(){

        this.result = a - b;
        System.out.println(result);
    }

    public void division(){

        this.result = a / b;
        System.out.println(result);
    }

    public void multiplication(){

        this.result = a * b;
        System.out.println(result);
    }

}
