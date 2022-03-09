package demo_001;

public class hello_003 {
    public static  int main(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }


}

