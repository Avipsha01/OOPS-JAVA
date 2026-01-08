import java.util.Scanner;
class f1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range:");
        int n=sc.nextInt();
        for(int i=1;i<n;i++){
            int f=0;
            for(int j=2;j<n;j++){
                if(i%j==0){
                    f=1;
                    break;
                }
            }
            if(f==0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}