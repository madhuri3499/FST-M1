package activities;

public class Activity8 {
    static void exceptionTest(String val) throws CustomException{
        if(val!=null){
            System.out.println(val);
        }
        else{
            throw new CustomException("String is a null");
        }
    }

    public static void main(String[] args) {
        try{
            exceptionTest("This is not a null value");
            exceptionTest(null);
        }
        catch(CustomException err){
            System.out.println("Inside catch block"+err.getMessage());
        }
    }
}
