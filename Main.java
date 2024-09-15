public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int sum=0;
        for (int i=1;i<=100;i++){
            if(i%7==0){
                sum=sum+i;

            }
        };
        System.out.println("Tổng các bội chung của 7 là: "+sum);
    }
}