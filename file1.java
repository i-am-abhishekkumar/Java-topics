class Calculator{
    public int sum(int x,int y){
        int r= x+y;
        return r;
    }
}
class Main {
    public static void main(String[] args) {
        int num1=5;
        int num2=10;
        Calculator calculator=new Calculator();
        int res= calculator.sum(num1,num2);
        System.out.println(res);
       
    }
}
