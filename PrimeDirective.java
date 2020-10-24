import java.util.ArrayList;
import java.util.Arrays;
public class PrimeDirective{

  private ArrayList<Integer> primes = new ArrayList<Integer>();
  private ArrayList<Integer> notprimes = new ArrayList<Integer>();

  public Boolean isPrime(int num){
    Boolean isPrime = false;
    if (num == 2){isPrime = true;}
    else if (num % 2 == 0){isPrime = false;}
    else if (num % 2 >= 1){isPrime = true;}
    return isPrime;
  }

  public void onlyPrimes(int[] arr) {
    for (int i = 0; i < arr.length; i++){
      if (this.isPrime(arr[i])){
        //System.out.println(arr[i] + " Prime");
        primes.add(arr[i]);
      }
      else {
        //System.out.println(arr[i] + " Not Prime");
        notprimes.add(arr[i]);
      }
    }
  }

  public String showArray(ArrayList<Integer> arr){
    String result = "";
    for (int i : arr){
      result += i + ", ";
    }
    return result;
  }


  public static void main(String[] args){

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
    pd.onlyPrimes(numbers);
    System.out.println("not prime nos: " + pd.notprimes.size());
    System.out.println(pd.showArray(pd.notprimes));
    System.out.println("prime nos: " +pd.primes.size());
    System.out.println(pd.showArray(pd.primes));



    //CALL TEST FUNCTION System.out.println(pd.sayHello());
  }//MAIN
}//CLASS
