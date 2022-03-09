package LeetCode;

/*
逢7过

 */
public class feng7g {
    public static void main(String[] args) {
        for(int i=1;i<100;i++){
            boolean a=is7(i);
            if(a){
                System.out.print(i+"\t");
            }

        }

        }
        public static boolean is7(int num){
            if (num%7==0){
                return true;
            }
            if (num%10%7==0){
                return true;
            }
        else{
            return false;
            }
        }
}

