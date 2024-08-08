import java.util.Scanner;
public class calulater{

   public void normal(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num1=sc.nextInt();
        System.out.println("enter second number:");
        int num2=sc.nextInt();
        System.out.println("choose  a opreation:");
        int result=0;
        while(true){
            System.out.println(" 1 = '+'    ");
            System.out.println(" 2= '-'     ");

            System.out.println(" 3 = '*'    ");

            System.out.println(" 4 = '/'    ");
            System.out.println(" 5 = 'exit' ");


            int op=sc.nextInt();
            switch (op) {
                case 1:
                result=num1+num2;
                System.out.println("your result is  "+result);
                break;
                case 2:
                result=num1-num2;
                System.out.println("your result is  "+result);
  
                break;
                case 3:
                result=num1*num2;
                System.out.println("your result is  "+result);
                break;
                case 4:
                result=num1/num2;
                System.out.println("your result is  "+result);
                break;
                case 5:
                System.out.println("THANK YOU");
                System.exit(0);
            
                default:
                System.out.println("please enter valid opreation!");
                    break;
            }


        }
    }

 public void scintific(){    
    double result=0;
    Scanner sc=new Scanner(System.in);
    while(true){
     System.out.println("enter the opreation you want to performed>>>>>");
    System.out.println();
    System.out.println(" 1=  'square root' ");
    System.out.println(" 2=  'power'       ");
    System.out.println(" 3=  'EXIT'        ");
    int op=sc.nextInt();


        switch (op) {
            case 1:
            System.out.println("enter a number:");
            double num=sc.nextDouble();
            result=num*num;
            System.out.println("your result is= "+result);
            break;

            case 2:
            System.out.println("enter base:");
            double num1=sc.nextDouble();
            System.out.println("enter exponet");
            double num2=sc.nextDouble();
            result=num1;
            double exp= (num2 < 0) ? -num2 : num2;
            if(exp==0){
                System.out.println("your result is "+result);
            }
            for(int i=1;i<exp;i++){
                result*=num1;
            }
            System.out.println("your result is= " +result);
            break;

            case 3:
            System.out.println("WELCOME");
            sc.close();
            System.exit(0);


            default:
            System.out.println("please enter valid opreation!");
                break;
        }
    }



    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("choose one");
        System.out.println("1->   Normal    ");
        System.out.println("2->   Scintific ");
        int choose=sc.nextInt();
        calulater obj=new calulater();
            switch (choose) {
                case 1:
                obj.normal();
                break;
                case 2:
                obj.scintific();

                break;
                case 3:
                break;
            
                default:
                System.out.println("please choose valid option.!");

                    break;
            
        }

    }
}

