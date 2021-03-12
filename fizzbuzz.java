class Scratch {
    public static void main(String[] args) {
        for(int i=1; i<101;i++){
            if(i%5==0){
                System.out.print("FIZZ");
            }
            if(i%7==0){
                System.out.print("BUZZ");
            }
            if(i%7!=0 && i%5!=0){
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
}