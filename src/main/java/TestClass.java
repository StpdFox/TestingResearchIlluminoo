public class TestClass {
     
  
    public int doubleNumber(int num) {
        return num * 2;
    }
     
    public boolean returnBoolean(String inputData) {
        if ("Save".equalsIgnoreCase(inputData)) {
            return true;
        } else {
            return false;
        }
    }
 
    public void voidFunction(String inputData) {
        if ("Ok".equalsIgnoreCase(inputData)) {
            System.out.println("doing something.");;
        } else {
            throw new IllegalArgumentException("Bad argument:" + inputData);
        }
    }
}
