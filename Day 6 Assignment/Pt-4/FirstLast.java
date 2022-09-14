public class FirstLast {

    public String checkFirstLast(int[] arr){
        if(arr.length>5){
            if(arr[0]==arr[arr.length-1]){
                return "First and last are same in the Array";
            }
            else return "First and last are not same in the Array";
        }

        return "Array size should be greater than 5";
    }

    public static void main(String[] args) {
        FirstLast firstLast=new FirstLast();
        int[] arr=new int[]{1,2,3,4,5,6,2};

        System.out.println(firstLast.checkFirstLast(arr));

    }
}
