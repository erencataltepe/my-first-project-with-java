public class Main {
    public static void main(String[] args) {        
        String name = "galactic hunter";
        String learning  = "java";
        //write your code below
        String newWord = String.format("%s learning %s", name, learning);
        System.out.println(newWord);
    }
}