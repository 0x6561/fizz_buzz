/**
 * Implementation of FizzBuzz in Java
 * 
 **/
public class FizzBuzz{

  public static void main(String args[]){

    for(int i = 0; i<100; i++){
      System.out.println(fizzBuzz(i));
    }
  }

  /**
   * returns fizz,buzz or fizzbuzz depending on input
   * @param i, int to be evaluated
   * @return String, containing either a number, Fizz, 
   * Buzz or FizzBuzz 
   **/
  public static String fizzBuzz(int i){
    String fb = "";
    if(i%15 == 0){
      fb += "FIZZBUZZ";
    }else if(i%3 == 0){
      fb += "FIZZ";
    }else if(i%5 == 0){
      fb += "BUZZ";
    }else{
      fb += i + "";
    }
    return fb;
  }

}
