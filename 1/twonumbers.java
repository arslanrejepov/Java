public class twonumbers {
    public static void main(String[] args){
    int counter=0 ;
    for(int num1=1;num1<=7;num1++){
        for (int num2=1;num2<=7;num2++){
            if (num1!=num2){
                System.out.println(num1+" "+num2);
                counter++;
            }
        }
    }  
    System.out.println("Total number of all combinantion is "+ counter);  
    }
}
