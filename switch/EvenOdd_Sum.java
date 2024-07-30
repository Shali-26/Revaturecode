public class EvenOdd_Sum {
    public static void main(String[] args) {
        int sum=0;
        int odd=0;
        for(int i=0;i<=10;i++){
            if(i%2==0){
                sum+=i;
                System.out.println(sum);
            }
        }
        for(int i=0;i<=10;i++){
            if(i %2 !=0) {
                odd+=i;
                System.out.println(odd);

            }
        }
    }
    
}
