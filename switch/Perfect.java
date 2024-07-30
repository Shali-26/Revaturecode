class Perfect{
    public static void main(String[] args) {
        int n=9;
        int sum=0;
        for(int i=0;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }if(n==sum){
                System.out.println("perfect");
            }else{
                System.out.println("Not a Perfect");
            }
        }
    }
}
