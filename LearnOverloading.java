package week3.day2;

public class LearnOverloading {
    
    public void Add(int a , int b) {
        System.out.println(a+b);
    }
     
    public void Add(int c, int d, int e) {
        System.out.println(c+d+e);
    }
    public void Sub(int a, int b) {
        System.out.println(a-b);
    }
    public void Sub(double c, double d) {
        System.out.println(c-d);
    }
    public void multiply(int a, int b) {
        System.out.println(a*b);
    }
    public void multiply(int c, double d) {
        System.out.println(c*d);
    }
    public void div(int a, int b) {
        System.out.println(a/b);
    }
    public void div(double c, double d) {
        System.out.println(c/d);
    }
    public static void main(String[] args) {
        
        LearnOverloading overloading = new LearnOverloading();
        
        overloading.Add(3, 4, 10);
        overloading.div(20, 2);
        overloading.Sub(20, 25);
        overloading.multiply(5, 4);
      
    }
}


	